package edu.fzu.softwareengineer.courseSite.service;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.domain.Assignment;
import edu.fzu.softwareengineer.courseSite.domain.ExamInfo;
import edu.fzu.softwareengineer.courseSite.domain.Notice;
import edu.fzu.softwareengineer.courseSite.domain.Resource;
import edu.fzu.softwareengineer.courseSite.domain.Score;
import edu.fzu.softwareengineer.courseSite.domain.Student;

public interface StudentService {

	// 学生注册
	boolean register(Student student);

	// 检查登陆是否成功
	boolean checkLogin(Integer sno, String psw);

	// 获取学生信息
	Student getStudentInfo(Integer sno);
	
	//得到所有学生信息
	List<Student> getAllStudentInfo();

	// 修改学生信息
	boolean modifyStudentInfo(Student student);

	// 修改密码
	boolean modifyPassword(Integer sno, String old_psw, String new_psw);

	// 查询分数
	Score findScore(Integer sno, String scoreType);

	// 查看考试时间/地点
	ExamInfo findExamInfo();

	// 查看作业
	List<Assignment> findAssignment();
	
	// 上传作业
	boolean uploadHomework(Resource resource);

	//得到课件列表
	List<Resource> getCourseware();
	
	//得到一个资源
	Resource findResource(String fileName);
	
	//修改一个资源
	boolean downloadCourse(Resource resource);
	
	public List<Notice> getNotices();

	public Notice getNotice(int id);
}
