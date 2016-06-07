//package edu.fzu.softwareengineer.courseSite.dao;
//
//public class testDao {
//  public show
//}
//

package edu.fzu.softwareengineer.courseSite.dao;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.domain.Test;

public interface TestDao extends BaseHibDao<Test>{
	List showTest(int num);
	boolean validateAnswer(int id,String answer);
}

