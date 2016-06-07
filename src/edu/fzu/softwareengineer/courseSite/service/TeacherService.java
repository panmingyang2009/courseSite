package edu.fzu.softwareengineer.courseSite.service;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.domain.Assignment;
import edu.fzu.softwareengineer.courseSite.domain.ExamInfo;
import edu.fzu.softwareengineer.courseSite.domain.Notice;
import edu.fzu.softwareengineer.courseSite.domain.Resource;
import edu.fzu.softwareengineer.courseSite.domain.Score;
import edu.fzu.softwareengineer.courseSite.domain.Teacher;

public interface TeacherService {
	// 插入学生成绩
	// 发布教学计划、发布考试时间/地点
	// 习题布置、发布实验教学（发布要求/整理报告/统计批阅）。

	// 登陆
	boolean checkLogin(Integer tno, String psw);

	// 修改密码
	boolean modifyPsw(Integer tno, String newPsw, String oldPsw);

	// 修改老师信息
	boolean modifyTeacherInfo(Teacher teacher);

	// 批量插入成绩
	boolean recordStudentScore(List<Score> scores);

	// 发布教学计划
	boolean publishPlan(Integer Tno, String plan);

	// 发布考试时间/地点
	boolean publishExamInfo(ExamInfo examInfo);

	// 发布作业
	boolean publishAssignment(Assignment assignment);

	// 发布实验教学（发布要求/整理报告/统计批阅）
	// 参数待补充
	boolean publishExperimentTeaching();

	// 收作业
	List<Resource> getHomeworks();

	// 发布课件
	boolean uploadCourseware(Resource resource);
	
	//删除课件
	boolean deleteCourseware(Integer id);
	
	public List<Notice> getNotices();

	public boolean createNotice(Notice notice);
	
	Teacher findTeacher(Integer tno);
}
