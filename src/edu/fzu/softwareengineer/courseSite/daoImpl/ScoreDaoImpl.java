package edu.fzu.softwareengineer.courseSite.daoImpl;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.dao.ScoreDao;
import edu.fzu.softwareengineer.courseSite.domain.Score;

public class ScoreDaoImpl extends BaseDaoHibImpl<Score> implements ScoreDao{

	@Override
	public void insertScores(List<Score> scores) {
		// TODO Auto-generated method stub
		for(int i=0;i<scores.size();i++){
			save(scores.get(i));
		}
	}

	@Override
	public void updateScores(List<Score> scores) {
		// TODO Auto-generated method stub
		for(int i=0;i<scores.size();i++){
			update(scores.get(i));
		}
	}

	@Override
	public Score findScoreByOne(Integer Sno, String scoreType) {
		// TODO Auto-generated method stub
		String hql="from Score s where s.student.Sid=?0 and s.Type=?1";
		List<Score> list=find(hql, Sno,scoreType);
		return list.get(0);
	}

	@Override
	public List<Score> findScoresByAllStudents(String scoreType) {
		// TODO Auto-generated method stub
		String hql="from Score s where s.Type=?0";
		List<Score> list=find(hql, scoreType);
		return list;
	}
	
}
