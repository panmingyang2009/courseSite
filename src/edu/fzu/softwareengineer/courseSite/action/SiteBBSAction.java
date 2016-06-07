package edu.fzu.softwareengineer.courseSite.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.fzu.softwareengineer.courseSite.domain.Question;
import edu.fzu.softwareengineer.courseSite.domain.Reply;
import edu.fzu.softwareengineer.courseSite.service.SiteBBSservice;

public class SiteBBSAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Question question;
	private Reply reply;
	private SiteBBSservice siteBBSservice;
	
	public String askQuestion(){
		Map session=(Map)ActionContext.getContext().getSession();
		if(siteBBSservice.askQuestion(question,(Integer)session.get("studentID")))
			return SUCCESS;
		else
			return ERROR;
	}
	
	public String publishReply(){
		if (reply != null) {
			if (siteBBSservice.publishReply(reply)) {
				return SUCCESS;
			}
		}
		return ERROR;
	}
	
	
}
