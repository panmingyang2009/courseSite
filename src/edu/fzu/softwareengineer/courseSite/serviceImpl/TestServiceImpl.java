package edu.fzu.softwareengineer.courseSite.serviceImpl;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.dao.TestDao;
import edu.fzu.softwareengineer.courseSite.service.TestService;

public class TestServiceImpl implements TestService {
	public TestDao testDao;
	@Override
	public List showTest(int num) {
		// TODO Auto-generated method stub
		List l=testDao.showTest(num);
		return l;
	}
		
	public TestDao getTestDao() {
		return testDao;
	}
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	@Override
	public int getScore(String[] answer,int number,int testnum) {
		// TODO Auto-generated method stub
		String s=null;
		int id=(testnum-1)*10;
		int score=0;
		for(int i =0;i<number;i++)
		{
			s=answer[i];
			if(s!=null&&!s.isEmpty())
			{
				if(testDao.validateAnswer(id+i+1, answer[i])) score+=10;
			}
		}
		return score;
	}



}
