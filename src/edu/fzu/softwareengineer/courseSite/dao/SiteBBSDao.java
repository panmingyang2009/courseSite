package edu.fzu.softwareengineer.courseSite.dao;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.domain.Question;
import edu.fzu.softwareengineer.courseSite.domain.Reply;

public interface SiteBBSDao extends BaseHibDao<Object>{
	void insertQuestion(Question question);
	void insertReply(Reply reply);
	
	List<Question> getQuestions();
	List<Reply> getReplys();
}
