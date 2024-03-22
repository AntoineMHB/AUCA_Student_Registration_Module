package Service;

import model.Semester;
import model.Student;

import java.rmi.RemoteException;
import java.util.List;

public interface StudentService {
    public boolean addStudent(Student student);
    public List<Student> getStudents() throws RemoteException;
    public boolean deleteStudent(Student student);
    public Student findStudentByName(String fullname);
    public Student findStudentByRegNo(String regNo);
    // In your service interface (StudentService.java)
    public List<Student> getStudentsBySemester(Semester semester);

}