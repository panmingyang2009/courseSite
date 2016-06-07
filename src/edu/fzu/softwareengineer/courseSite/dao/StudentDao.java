package edu.fzu.softwareengineer.courseSite.dao;

import edu.fzu.softwareengineer.courseSite.domain.Student;

public interface StudentDao extends BaseHibDao<Student>{
	Student findStudent(Integer sno);
	void updateStudent(Student student);
}
