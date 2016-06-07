package edu.fzu.softwareengineer.courseSite.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.fzu.softwareengineer.courseSite.domain.Test;
import edu.fzu.softwareengineer.courseSite.service.TestService;

public class TestAction extends ActionSupport {
	int testnum;
	int number;
	String[] answer=new String [10];
	TestService testService;

	public String show() {
		System.out.println(testnum);
		List<Test> list = testService.showTest(testnum);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("testList", list);
		return "success";
	}

	public String getScore() {

		int score = testService.getScore(answer, 10, testnum);
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("score", score);
		//System.out.println(answer[1]);
		return "showScore";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTestnum() {
		return testnum;
	}

	public void setTestnum(int testnum) {
		this.testnum = testnum;
	}

	public TestService getTestService() {
		return testService;
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	public String getQuestion1() {
		return answer[0];
	}

	public void setQuestion1(String question1) {
		this.answer[0] = question1;
	}

	public String getQuestion2() {
		return answer[1];
	}

	public void setQuestion2(String question2) {
		this.answer[1] = question2;
	}

	public String getQuestion3() {
		return answer[2];
	}

	public void setQuestion3(String question3) {
		this.answer[2] = question3;
	}

	public String getQuestion4() {
		return answer[3];
	}

	public void setQuestion4(String question4) {
		this.answer[3] = question4;
	}

	public String getQuestion5() {
		return answer[4];
	}

	public void setQuestion5(String question5) {
		this.answer[4] = question5;
	}

	public String getQuestion6() {
		return answer[5];
	}

	public void setQuestion6(String question6) {
		this.answer[5] = question6;
	}

	public String getQuestion7() {
		return answer[6];
	}

	public void setQuestion7(String question7) {
		this.answer[6] = question7;
	}

	public String getQuestion8() {
		return answer[7];
	}

	public void setQuestion8(String question8) {
		this.answer[7] = question8;
	}

	public String getQuestion9() {
		return answer[8];
	}

	public void setQuestion9(String question9) {
		this.answer[8] = question9;
	}

	public String getQuestion10() {
		return answer[9];
	}

	public void setQuestion10(String question10) {
		this.answer[9] = question10;
	}
	
}
