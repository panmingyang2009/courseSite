package edu.fzu.softwareengineer.courseSite.dao;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.domain.Score;

public interface ScoreDao extends BaseHibDao<Score>{
	void insertScores(List<Score> scores);
	
	void updateScores(List<Score> scores);
	
	Score findScoreByOne(Integer Sno,String scoreType);
	
	List<Score> findScoresByAllStudents(String scoreType);
}
