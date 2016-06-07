package edu.fzu.softwareengineer.courseSite.daoImpl;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.dao.AssignmentDao;
import edu.fzu.softwareengineer.courseSite.domain.Assignment;

public class AssignmentDaoImpl extends BaseDaoHibImpl<Assignment> implements AssignmentDao {

	@Override
	public List<Assignment> getAssignments() {
		// TODO Auto-generated method stub
		//�������е���ҵ��¼
		return findAll(Assignment.class);
	}

	@Override
	public void insertAssignment(Assignment assignment) {
		// TODO Auto-generated method stub
		update(assignment);
	}

	
}
