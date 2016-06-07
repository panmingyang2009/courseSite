package edu.fzu.softwareengineer.courseSite.serviceImpl;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.dao.AssignmentDao;
import edu.fzu.softwareengineer.courseSite.dao.ExamInfoDao;
import edu.fzu.softwareengineer.courseSite.dao.NoticeDao;
import edu.fzu.softwareengineer.courseSite.dao.ResourceDao;
import edu.fzu.softwareengineer.courseSite.dao.ScoreDao;
import edu.fzu.softwareengineer.courseSite.dao.StudentDao;
import edu.fzu.softwareengineer.courseSite.domain.Assignment;
import edu.fzu.softwareengineer.courseSite.domain.ExamInfo;
import edu.fzu.softwareengineer.courseSite.domain.Notice;
import edu.fzu.softwareengineer.courseSite.domain.Resource;
import edu.fzu.softwareengineer.courseSite.domain.Score;
import edu.fzu.softwareengineer.courseSite.domain.Student;
import edu.fzu.softwareengineer.courseSite.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	private ScoreDao scoreDao;
	private ExamInfoDao examInfoDao;
	private AssignmentDao assignmentDao;
	private ResourceDao resourceDao;
	private NoticeDao noticeDao;
	
	@Override
	public boolean register(Student student) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(student);
		return false;
	}
	
	@Override
	public boolean checkLogin(Integer sno,String psw) {
		// TODO Auto-generated method stub
		Student student=studentDao.findStudent(sno);
		if(student!=null){
			//检查根据学号获取的密码和输入的密码是否相等
			if(student.getPsw().equals(psw)){
				return true;
			}
			else{
				return false;
			}
		}
		//如果student==null；那么不存在这个学号。
		else{
			return false;
		}
	}

	@Override
	public Student getStudentInfo(Integer sno) {
		// TODO Auto-generated method stub
		return studentDao.findStudent(sno);
	}
	
	@Override
	public List<Student> getAllStudentInfo() {
		// TODO Auto-generated method stub
		return studentDao.findAll(Student.class);
	}
	
	@Override
	public boolean modifyPassword(Integer sno, String old_psw, String new_psw) {
		// TODO Auto-generated method stub
		Student student=studentDao.findStudent(sno);
		if(student.getPsw().equals(old_psw) ){
			student.setPsw(new_psw);
			studentDao.update(student);
			return true;
		}else{
			return false;
		}	
	}

	@Override
	public boolean modifyStudentInfo(Student student) {
		// TODO Auto-generated method stub
		studentDao.updateStudent(student);
		return false;
	}

	@Override
	public Score findScore(Integer sno, String scoreType) {
		// TODO Auto-generated method stub
		return scoreDao.findScoreByOne(sno, scoreType);
	}

	@Override
	public ExamInfo findExamInfo() {
		// TODO Auto-generated method stub
		return examInfoDao.getExamInfo();
	}

	@Override
	public List<Assignment> findAssignment() {
		// TODO Auto-generated method stub
		return assignmentDao.getAssignments();
	}
	
	@Override
	public boolean uploadHomework(Resource resource) {
		resourceDao.createResource(resource);
		return true;
	}

	@Override
	public List<Resource> getCourseware() {
		List<Resource> resources = resourceDao.getAllResource("courseware");
		return resources;
	}
	
	@Override
	public Resource findResource(String fileName) {
		// TODO Auto-generated method stub
		return resourceDao.getResource(fileName);
	}

	@Override
	public boolean downloadCourse(Resource resource) {
		// TODO Auto-generated method stub
		resourceDao.updateResource(resource);
		return true;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
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

	public ResourceDao getResourceDao() {
		return resourceDao;
	}

	public void setResourceDao(ResourceDao resourceDao) {
		this.resourceDao = resourceDao;
	}

	public List<Notice> getNotices() {
		return noticeDao.get();
	}

	public Notice getNotice(int id) {
		return noticeDao.get(id);
	}

	public NoticeDao getNoticeDao() {
		return noticeDao;
	}

	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}
	
}
