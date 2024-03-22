package Service;

import dao.CourseDefinitionDao;
import model.CourseDefinition;

import java.rmi.RemoteException;
import java.util.List;

public class CourseDefServiceImpl extends RemoteException implements CourseDefService{
    CourseDefinitionDao courseDefinitionDao = new CourseDefinitionDao();
    @Override
    public boolean addCourseDefinition(CourseDefinition courseDefinition) {
        return courseDefinitionDao.addCourseDefinition(courseDefinition);
    }

    @Override
    public List<CourseDefinition> getCourseDef() throws RemoteException {
        return courseDefinitionDao.findAll();
    }

    @Override
    public CourseDefinition findCourseByName(String name) {
        return null;

    }

    @Override
    public boolean deleteCourse(CourseDefinition courseDefinition) {
        return courseDefinitionDao.deleteCourse(courseDefinition);
    }

//    @Override
//    public List<CourseDefinition> getAllCourseDefinitions() {
//        return courseDefinitionDao.getAllCourseDefinitions();
//    }

}
