package edu.fzu.softwareengineer.courseSite.daoImpl;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.dao.SiteBBSDao;
import edu.fzu.softwareengineer.courseSite.domain.Question;
import edu.fzu.softwareengineer.courseSite.domain.Reply;

public class SiteBBSDaoImpl extends BaseDaoHibImpl<Object> implements SiteBBSDao{

	@Override
	public void insertQuestion(Question question) {
		// TODO Auto-generated method stub
		update(question);
	}

	@Override
	public void insertReply(Reply reply) {
		// TODO Auto-generated method stub
		update(reply);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return (List<Question>) getSession().createQuery("select q from question as q").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reply> getReplys() {
		// TODO Auto-generated method stub
		return (List<Reply>) getSession().createQuery("select r from reply as r").list();
	}

}
