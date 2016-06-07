package edu.fzu.softwareengineer.courseSite.action;

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
import edu.fzu.softwareengineer.courseSite.service.StudentService;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Student student;
	private Score score;
	private ExamInfo examInfo;
	private List<Resource> resources;
	private Resource resource;
	private List<Assignment> assignments;
	private StudentService studentService;
	
	private List<Notice> notices;
	private Notice notice;

	private Integer sno;
	private String newPsw;
	private String pwd;
	private String scoreType;

	public String login() {
		if (studentService.checkLogin(sno, pwd)) {
			Map session = (Map) ActionContext.getContext().getSession();
			session.put("studentID", sno);
			session.put("user", "student");
			return SUCCESS;
		} else
			return ERROR;
	}

	public String modifyPsw() {
		if (studentService.modifyPassword(sno, pwd, newPsw))
			return "modifyPsw";
		else
			return ERROR;
	}

	public String showStudentInfo() {
		student = studentService.getStudentInfo(sno);
		if (student != null)
			return "showStudentInfo";
		else
			return ERROR;
	}

	public String modifyStudentInfo() {
		if (studentService.modifyStudentInfo(student))
			return "modifyStudentInfo";
		else
			return ERROR;
	}

	public String findScore() {
		score = studentService.findScore(sno, scoreType);
		if (score != null)
			return "showScore";
		else
			return ERROR;
	}

	public String findExamInfo() {
		examInfo = studentService.findExamInfo();
		if (examInfo != null)
			return "showExamInfo";
		else
			return ERROR;
	}

	public String findAssignment() {
		assignments = studentService.findAssignment();
		if (assignments != null)
			return "showAssignment";
		else
			return ERROR;
	}

	public String findAllNotices() {
		try {
			notices = studentService.getNotices();
			System.out.println(notices.size());
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("notice", notices);
			Map session=ActionContext.getContext().getSession();
			session.put("nnn", notices);

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (notices.size() > 0) {
			System.out.println("show nootices ");
			return "showNotices";
		} else {
			return ERROR;
		}
	}

	public String getNoticeById(int id) {
		notice = studentService.getNotice(id);
		if (notice != null) {
			return "showNotice";
		} else {
			return ERROR;
		}
	}

	public String downloadCourseware() {
		resources = studentService.getCourseware();
		if (resources != null)
			return "showCourseware";
		else
			return ERROR;
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getNewPsw() {
		return newPsw;
	}

	public void setNewPsw(String newPsw) {
		this.newPsw = newPsw;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public ExamInfo getExamInfo() {
		return examInfo;
	}

	public void setExamInfo(ExamInfo examInfo) {
		this.examInfo = examInfo;
	}

	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public String getScoreType() {
		return scoreType;
	}

	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
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

}
