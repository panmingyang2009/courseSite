package edu.fzu.softwareengineer.courseSite.service;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.domain.Assignment;
import edu.fzu.softwareengineer.courseSite.domain.ExamInfo;
import edu.fzu.softwareengineer.courseSite.domain.Notice;
import edu.fzu.softwareengineer.courseSite.domain.Resource;
import edu.fzu.softwareengineer.courseSite.domain.Score;
import edu.fzu.softwareengineer.courseSite.domain.Teacher;

public interface TeacherService {
	// ����ѧ���ɼ�
	// ������ѧ�ƻ�����������ʱ��/�ص�
	// ϰ�Ⲽ�á�����ʵ���ѧ������Ҫ��/������/ͳ�����ģ���

	// ��½
	boolean checkLogin(Integer tno, String psw);

	// �޸�����
	boolean modifyPsw(Integer tno, String newPsw, String oldPsw);

	// �޸���ʦ��Ϣ
	boolean modifyTeacherInfo(Teacher teacher);

	// ��������ɼ�
	boolean recordStudentScore(List<Score> scores);

	// ������ѧ�ƻ�
	boolean publishPlan(Integer Tno, String plan);

	// ��������ʱ��/�ص�
	boolean publishExamInfo(ExamInfo examInfo);

	// ������ҵ
	boolean publishAssignment(Assignment assignment);

	// ����ʵ���ѧ������Ҫ��/������/ͳ�����ģ�
	// ����������
	boolean publishExperimentTeaching();

	// ����ҵ
	List<Resource> getHomeworks();

	// �����μ�
	boolean uploadCourseware(Resource resource);
	
	//ɾ���μ�
	boolean deleteCourseware(Integer id);
	
	public List<Notice> getNotices();

	public boolean createNotice(Notice notice);
	
	Teacher findTeacher(Integer tno);
}
