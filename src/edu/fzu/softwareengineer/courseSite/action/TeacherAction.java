package edu.fzu.softwareengineer.courseSite.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.fzu.softwareengineer.courseSite.domain.Assignment;
import edu.fzu.softwareengineer.courseSite.domain.ExamInfo;
import edu.fzu.softwareengineer.courseSite.domain.Notice;
import edu.fzu.softwareengineer.courseSite.domain.Resource;
import edu.fzu.softwareengineer.courseSite.domain.Score;
import edu.fzu.softwareengineer.courseSite.domain.Student;
import edu.fzu.softwareengineer.courseSite.domain.Teacher;
import edu.fzu.softwareengineer.courseSite.service.StudentService;
import edu.fzu.softwareengineer.courseSite.service.TeacherService;

public class TeacherAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Teacher teacher;
	private List<Score> scores;
	private ExamInfo examInfo;
	private Assignment assignment;
	private List<Resource> resources;
	private Resource resource;
	private TeacherService teacherService;
	private StudentService studentService;

	private Integer tno;
	private String pwd;
	private String newPsw;
	private String plan;

	private List<Notice> notices;
	private Notice notice;

	public String login() {
		if (teacherService.checkLogin(tno, pwd)) {
			Map session = (Map) ActionContext.getContext().getSession();
			session.put("teacherID", tno);
			session.put("user", "teacher");
			return SUCCESS;
		} else
			return ERROR;
	}

	public String modifyPsw() {
		if (teacherService.modifyPsw(tno, newPsw, pwd))
			return SUCCESS;
		else
			return ERROR;
	}

	public String modifyTeacherInfo() {
		if (teacherService.modifyTeacherInfo(teacher))
			return "showTeacherInfo";
		else
			return ERROR;
	}

	public String publishPlan() {
		if (teacherService.publishPlan(tno, plan))
			return "showTeacherInfo";
		else
			return ERROR;
	}

	public String getAllStudentInfo() {
		List<Student> studentInfolist = studentService.getAllStudentInfo();
		if (!studentInfolist.isEmpty())
			return "showStudentInfo";
		else
			return ERROR;
	}

	public String inputScores() {
		if (teacherService.recordStudentScore(scores))
			return "showStudentInfo";
		else
			return ERROR;
	}

	public String publishExamInfo() {
		if (teacherService.publishExamInfo(examInfo))
			return "showExamInfo";
		else
			return ERROR;
	}

	public String publishAssignment() {
		if (teacherService.publishAssignment(assignment))
			return "showAssignment";
		else
			return ERROR;
	}

	public String getAllNotices() {
		notices = teacherService.getNotices();
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("notices", notices);
		if (notices.size() > 0) {
			return "showNotices";
		} else {
			return ERROR;
		}
	}

	public String createNotice() {
		Map session = (Map) ActionContext.getContext().getSession();
		if (session.get("user") == null && session.get("user").equals("teacher")) {
			return ERROR;
		}
		notice.setTeacher(teacherService.findTeacher((Integer) session.get("teacherID")));
		notice.setCreateDate(new Date());
		if (teacherService.createNotice(notice)) {
			return "showNotices";
		} else {
			return ERROR;
		}

	}


	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Score> getScores() {
		return scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}

	public ExamInfo getExamInfo() {
		return examInfo;
	}

	public void setExamInfo(ExamInfo examInfo) {
		this.examInfo = examInfo;
	}

	public Assignment getAssignment() {
		return assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public Integer getTno() {
		return tno;
	}

	public void setTno(Integer tno) {
		this.tno = tno;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNewPsw() {
		return newPsw;
	}

	public void setNewPsw(String newPsw) {
		this.newPsw = newPsw;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public List<Notice> getNotices() {
		return notices;
	}

	public void setNotices(List<Notice> notices) {
		this.notices = notices;
	}

	public Notice getNotice() {
		return notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}

}
