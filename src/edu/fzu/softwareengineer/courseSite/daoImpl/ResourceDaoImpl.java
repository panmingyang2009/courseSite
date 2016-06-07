package edu.fzu.softwareengineer.courseSite.daoImpl;

import java.util.List;

import edu.fzu.softwareengineer.courseSite.dao.ResourceDao;
import edu.fzu.softwareengineer.courseSite.domain.Resource;

public class ResourceDaoImpl extends BaseDaoHibImpl<Resource> implements ResourceDao {

    @Override
    public void createResource(Resource resource) {
        save(resource);
    }

    @Override
    public List<Resource> getAllResource(String type) {
        String hql = "from Resource r where r.type=?0";
        List<Resource> resources = find(hql, type);
        return resources;
    }

	@Override
	public void deleteResource(Integer id) {
		// TODO Auto-generated method stub
		delete(Resource.class,id);
	}

	@Override
	public void updateResource(Resource resource) {
		// TODO Auto-generated method stub
		update(resource);
	}

	@Override
	public Resource getResource(String fileName) {
		// TODO Auto-generated method stub
		return find("from Resource r where r.name=?0",	fileName).get(0);
	}
}
