package edu.fzu.softwareengineer.courseSite.daoImpl;

import edu.fzu.softwareengineer.courseSite.dao.TeacherDao;
import edu.fzu.softwareengineer.courseSite.domain.Teacher;

public class TeacherDaoImpl extends BaseDaoHibImpl<Teacher> implements TeacherDao{

	@Override
	public void updateTeacherInfo(Teacher teacher) {
		// TODO Auto-generated method stub
		update(teacher);
	}

	@Override
	public Teacher getTeacherInfo(Integer Tno) {
		// TODO Auto-generated method stub
		return get(Teacher.class, Tno);
	}

}
