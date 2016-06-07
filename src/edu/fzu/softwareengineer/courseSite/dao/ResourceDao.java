package edu.fzu.softwareengineer.courseSite.dao;

import edu.fzu.softwareengineer.courseSite.domain.Resource;

import java.util.List;

public interface ResourceDao extends BaseHibDao<Resource> {

    public void createResource(Resource resource);

    public List<Resource> getAllResource(String type);
    
    public Resource getResource(String fileName);
    
    public void deleteResource(Integer id);
    
    public void updateResource(Resource resource);
}