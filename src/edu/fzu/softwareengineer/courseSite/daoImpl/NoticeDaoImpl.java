package edu.fzu.softwareengineer.courseSite.daoImpl;


import edu.fzu.softwareengineer.courseSite.dao.NoticeDao;
import edu.fzu.softwareengineer.courseSite.domain.Notice;

import java.util.List;

/**
 * Created by Punmy on 16/6/5.
 */
public class NoticeDaoImpl extends BaseDaoHibImpl<Notice> implements NoticeDao{

    @Override
    public List<Notice> get() {
        return findAll(Notice.class);
    }

    @Override
    public Notice get(int id) {
        return get(id);
    }

    @Override
    public void saveOrUpdateNotice(Notice notice) {
        update(notice);
    }
}
