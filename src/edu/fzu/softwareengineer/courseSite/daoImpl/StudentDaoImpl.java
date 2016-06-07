package edu.fzu.softwareengineer.courseSite.daoImpl;

import edu.fzu.softwareengineer.courseSite.dao.StudentDao;
import edu.fzu.softwareengineer.courseSite.domain.Student;

public class StudentDaoImpl extends BaseDaoHibImpl<Student> implements StudentDao {

	@Override
	public Student findStudent(Integer sno) {
		// TODO Auto-generated method stub
		return get(Student.class, sno);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		update(student);
	}

}
