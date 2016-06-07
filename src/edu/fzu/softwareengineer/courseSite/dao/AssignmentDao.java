package edu.fzu.softwareengineer.courseSite.dao;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.domain.Assignment;

public interface AssignmentDao extends BaseHibDao<Assignment>{
	List<Assignment> getAssignments();
	void insertAssignment(Assignment assignment);
}
