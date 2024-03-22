package Service;

import dao.SemesterDao;
import model.Semester;

import java.rmi.RemoteException;
import java.util.List;

public class SemesterServiceImpl implements SemesterInteface {
    public SemesterServiceImpl(){
        super();
    }
    SemesterDao semesterDao = new SemesterDao();

    @Override
    public boolean addSemester(Semester semester) {
        return semesterDao.addSemester(semester);
    }

    @Override
    public List<Semester> getSemesters() throws RemoteException {
        return semesterDao.findAll();
    }

    @Override
    public boolean deleteSemester(Semester semester) {
        return semesterDao.deleteSemester(semester);
    }

    @Override
    public Semester findSemesterByName(String name) {
return null;    }
}
