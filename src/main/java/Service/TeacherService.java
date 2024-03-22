package Service;

import model.CourseDefinition;
import model.Teacher;

import java.rmi.RemoteException;
import java.util.List;

public interface TeacherService {
    public boolean addTeacher(Teacher teacher);
    public List<Teacher> getTeacher() throws RemoteException;
    public boolean deleteTeacher(Teacher teacher);
    public Teacher findTeacherByName(String name);
}
