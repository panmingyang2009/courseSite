package edu.fzu.softwareengineer.courseSite.service;

import java.util.List;

public interface TestService {
	public List showTest(int num);
	public int getScore(String[] answer,int number,int testnum);
}
