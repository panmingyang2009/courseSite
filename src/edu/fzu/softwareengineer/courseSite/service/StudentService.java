package edu.fzu.softwareengineer.courseSite.service;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.domain.Assignment;
import edu.fzu.softwareengineer.courseSite.domain.ExamInfo;
import edu.fzu.softwareengineer.courseSite.domain.Notice;
import edu.fzu.softwareengineer.courseSite.domain.Resource;
import edu.fzu.softwareengineer.courseSite.domain.Score;
import edu.fzu.softwareengineer.courseSite.domain.Student;

public interface StudentService {

	// ѧ��ע��
	boolean register(Student student);

	// ����½�Ƿ�ɹ�
	boolean checkLogin(Integer sno, String psw);

	// ��ȡѧ����Ϣ
	Student getStudentInfo(Integer sno);
	
	//�õ�����ѧ����Ϣ
	List<Student> getAllStudentInfo();

	// �޸�ѧ����Ϣ
	boolean modifyStudentInfo(Student student);

	// �޸�����
	boolean modifyPassword(Integer sno, String old_psw, String new_psw);

	// ��ѯ����
	Score findScore(Integer sno, String scoreType);

	// �鿴����ʱ��/�ص�
	ExamInfo findExamInfo();

	// �鿴��ҵ
	List<Assignment> findAssignment();
	
	// �ϴ���ҵ
	boolean uploadHomework(Resource resource);

	//�õ��μ��б�
	List<Resource> getCourseware();
	
	//�õ�һ����Դ
	Resource findResource(String fileName);
	
	//�޸�һ����Դ
	boolean downloadCourse(Resource resource);
	
	public List<Notice> getNotices();

	public Notice getNotice(int id);
}
