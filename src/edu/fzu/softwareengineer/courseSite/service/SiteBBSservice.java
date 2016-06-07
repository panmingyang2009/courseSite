package edu.fzu.softwareengineer.courseSite.service;

import edu.fzu.softwareengineer.courseSite.domain.Question;
import edu.fzu.softwareengineer.courseSite.domain.Reply;

public interface SiteBBSservice {
	// 提问
	boolean askQuestion(Question question,Integer sno);

	// 发表回复
	boolean publishReply(Reply reply);
}
