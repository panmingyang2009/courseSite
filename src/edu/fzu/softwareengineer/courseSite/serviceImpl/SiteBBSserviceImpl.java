package edu.fzu.softwareengineer.courseSite.serviceImpl;

import edu.fzu.softwareengineer.courseSite.dao.SiteBBSDao;
import edu.fzu.softwareengineer.courseSite.daoImpl.BaseDaoHibImpl;
import edu.fzu.softwareengineer.courseSite.domain.Question;
import edu.fzu.softwareengineer.courseSite.domain.Reply;
import edu.fzu.softwareengineer.courseSite.domain.Student;
import edu.fzu.softwareengineer.courseSite.service.SiteBBSservice;

public class SiteBBSserviceImpl extends BaseDaoHibImpl<Object> implements SiteBBSservice{
	private SiteBBSDao siteBBSDao;
	@Override
	public boolean askQuestion(Question question,Integer sno) {
		// TODO Auto-generated method stub
		Student student = question.getStudent();
		student.setSid(sno);
		question.setStudent(student);
		siteBBSDao.insertQuestion(question);
		return true;
	}

	@Override
	public boolean publishReply(Reply reply) {
		// TODO Auto-generated method stub
		siteBBSDao.insertReply(reply);
		return true;
	}

	public SiteBBSDao getSiteBBSDao() {
		return siteBBSDao;
	}

	public void setSiteBBSDao(SiteBBSDao siteBBSDao) {
		this.siteBBSDao = siteBBSDao;
	}
}
