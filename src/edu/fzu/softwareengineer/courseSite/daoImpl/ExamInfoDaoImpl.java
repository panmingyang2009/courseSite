package edu.fzu.softwareengineer.courseSite.daoImpl;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.dao.ExamInfoDao;
import edu.fzu.softwareengineer.courseSite.domain.ExamInfo;

public class ExamInfoDaoImpl extends BaseDaoHibImpl<ExamInfo> implements ExamInfoDao {

	@Override
	public ExamInfo getExamInfo() {
		// TODO Auto-generated method stub
		//�������еĿ�����Ϣ��¼
		List<ExamInfo> list=findAll(ExamInfo.class);
		return list.get(list.size()-1);
	}

	@Override
	public void saveOrUpdateExamInfo(ExamInfo examInfo) {
		// TODO Auto-generated method stub
		//���»��߱��濼����Ϣ
		update(examInfo);
	}

}
