package Service;

import model.Semester;

import java.rmi.RemoteException;
import java.util.List;

public interface SemesterInteface {
    public boolean addSemester(Semester semester);
    public List<Semester> getSemesters() throws RemoteException;
    public boolean deleteSemester(Semester semester);
    public Semester findSemesterByName(String name);
}
