package edu.fzu.softwareengineer.courseSite.service;

import edu.fzu.softwareengineer.courseSite.domain.Question;
import edu.fzu.softwareengineer.courseSite.domain.Reply;

public interface SiteBBSservice {
	// ����
	boolean askQuestion(Question question,Integer sno);

	// ����ظ�
	boolean publishReply(Reply reply);
}
