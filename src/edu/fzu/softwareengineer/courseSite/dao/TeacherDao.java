package edu.fzu.softwareengineer.courseSite.dao;

import edu.fzu.softwareengineer.courseSite.domain.Teacher;

public interface TeacherDao extends BaseHibDao<Teacher>{
	void updateTeacherInfo(Teacher teacher);
	Teacher getTeacherInfo(Integer Tno);
	
}
