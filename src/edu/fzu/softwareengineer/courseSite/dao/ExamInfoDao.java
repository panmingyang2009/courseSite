package edu.fzu.softwareengineer.courseSite.dao;

import edu.fzu.softwareengineer.courseSite.domain.ExamInfo;

public interface ExamInfoDao extends BaseHibDao<ExamInfo> {

	ExamInfo getExamInfo();

	void saveOrUpdateExamInfo(ExamInfo examInfo);
}
