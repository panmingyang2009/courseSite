package edu.fzu.softwareengineer.courseSite.serviceImpl;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.dao.AssignmentDao;
import edu.fzu.softwareengineer.courseSite.dao.ExamInfoDao;
import edu.fzu.softwareengineer.courseSite.dao.NoticeDao;
import edu.fzu.softwareengineer.courseSite.dao.ResourceDao;
import edu.fzu.softwareengineer.courseSite.dao.ScoreDao;
import edu.fzu.softwareengineer.courseSite.dao.TeacherDao;
import edu.fzu.softwareengineer.courseSite.domain.Assignment;
import edu.fzu.softwareengineer.courseSite.domain.ExamInfo;
import edu.fzu.softwareengineer.courseSite.domain.Notice;
import edu.fzu.softwareengineer.courseSite.domain.Resource;
import edu.fzu.softwareengineer.courseSite.domain.Score;
import edu.fzu.softwareengineer.courseSite.domain.Teacher;
import edu.fzu.softwareengineer.courseSite.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	private ScoreDao scoreDao;
	private ExamInfoDao examInfoDao;
	private AssignmentDao assignmentDao;
	private TeacherDao teacherDao;
	private ResourceDao resourceDao;
	private NoticeDao noticeDao;
	
	@Override
	public boolean checkLogin(Integer tno, String psw) {
		// TODO Auto-generated method stub
		Teacher teacher = teacherDao.getTeacherInfo(tno);
		if (teacher != null && teacher.getPsw().equals(psw))
			return true;
		else
			return false;
	}
	@Override
	public Teacher findTeacher(Integer tno) {
		return teacherDao.getTeacherInfo(tno);
	}

	@Override
	public boolean modifyPsw(Integer tno, String newPsw, String oldPsw) {
		// TODO Auto-generated method stub
		Teacher teacher = teacherDao.getTeacherInfo(tno);
		if (teacher != null && teacher.getPsw().equals(oldPsw)) {
			teacher.setPsw(newPsw);
			teacherDao.updateTeacherInfo(teacher);
			return true;
		} else
			return false;
	}
	
	@Override
	public boolean modifyTeacherInfo(Teacher teacher) {
		// TODO Auto-generated method stub
		teacherDao.updateTeacherInfo(teacher);
		return true;
	}
	
	@Override
	public boolean recordStudentScore(List<Score> scores) {
		// TODO Auto-generated method stub
		scoreDao.insertScores(scores);
		return true;
	}

	@Override
	public boolean publishPlan(Integer Tno, String plan) {
		// TODO Auto-generated method stub
		Teacher t = teacherDao.getTeacherInfo(Tno);
		t.setPlan(plan);
		teacherDao.updateTeacherInfo(t);
		return true;
	}

	@Override
	public boolean publishExamInfo(ExamInfo examInfo) {
		// TODO Auto-generated method stub
		examInfoDao.saveOrUpdateExamInfo(examInfo);
		return true;
	}

	@Override
	public boolean publishAssignment(Assignment assignment) {
		// TODO Auto-generated method stub
		assignmentDao.insertAssignment(assignment);
		return true;
	}

	@Override
	public boolean publishExperimentTeaching() {
		// TODO Auto-generated method stub

		return false;
	}
	
	@Override
	public List<Resource> getHomeworks() {
		return resourceDao.getAllResource("homework");
	}

	@Override
	public boolean uploadCourseware(Resource resource) {
		resourceDao.createResource(resource);
		return true;
	}
	
	@Override
	public boolean deleteCourseware(Integer id) {
		// TODO Auto-generated method stub
		resourceDao.deleteResource(id);
		return true;
	}
	
	@Override
	public List<Notice> getNotices() {
		return noticeDao.get();
	}


	@Override
	public boolean createNotice(Notice notice) {
		noticeDao.saveOrUpdateNotice(notice);
		return true;
	}
	public ScoreDao getScoreDao() {
		return scoreDao;
	}

	public void setScoreDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}

	public ExamInfoDao getExamInfoDao() {
		return examInfoDao;
	}

	public void setExamInfoDao(ExamInfoDao examInfoDao) {
		this.examInfoDao = examInfoDao;
	}

	public AssignmentDao getAssignmentDao() {
		return assignmentDao;
	}

	public void setAssignmentDao(AssignmentDao assignmentDao) {
		this.assignmentDao = assignmentDao;
	}

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public ResourceDao getResourceDao() {
		return resourceDao;
	}

	public void setResourceDao(ResourceDao resourceDao) {
		this.resourceDao = resourceDao;
	}

	public NoticeDao getNoticeDao() {
		return noticeDao;
	}

	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}
	
}
