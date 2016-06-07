package edu.fzu.softwareengineer.courseSite.daoImpl;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.dao.TestDao;
import edu.fzu.softwareengineer.courseSite.domain.Test;

public class TestDaoImpl extends BaseDaoHibImpl<Test> implements TestDao {

	@Override
	public List showTest(int num) {
		// TODO Auto-generated method stub
		String hql = "from Test";
		List<Test> list = findByPage(hql,num-1,10);
		return list;
	}

	@Override
	public boolean validateAnswer(int id,String answer) {
		// TODO Auto-generated method stub
		Test t= get(Test.class,id);
		if(t!=null)
		{
			if(t.getAnswer().equals(answer))return true;
		}
		return false;
	}

}
