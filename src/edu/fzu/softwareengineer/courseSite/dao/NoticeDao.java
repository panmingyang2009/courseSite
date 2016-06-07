package edu.fzu.softwareengineer.courseSite.dao;

import edu.fzu.softwareengineer.courseSite.domain.Notice;

import java.util.List;

/**
 * Created by Punmy on 16/6/5.
 */
public interface NoticeDao extends BaseHibDao<Notice> {

    public List<Notice> get();

    public Notice get(int id);

    public void saveOrUpdateNotice(Notice notice);
}
