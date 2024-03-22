package Service;

import dao.StudentRegDao;
import model.Semester;
import model.Student;
import model.StudentRegistration;

import java.rmi.RemoteException;
import java.util.List;
import java.util.UUID;

public class StudentRegServiceImpl implements StudentRegService{
    StudentRegDao studentRegDao = new StudentRegDao();

    @Override
    public boolean addStudentRegistration(StudentRegistration studentRegistration) {
        return studentRegDao.addStudentRegistration(studentRegistration);
    }

    @Override
    public List<StudentRegistration> getStudentRegistration() throws RemoteException {
        return studentRegDao.findAll();
    }

    @Override
    public StudentRegistration studRegistrationById(UUID id) {
        return studentRegDao.studRegistrationById(id);
    }

    @Override
    public StudentRegistration findRegistrationByName(String name) {
        return studentRegDao.findRegByName(name);

    }

    @Override
    public boolean deleteStudentRegistration(StudentRegistration studentRegistration) {
        return studentRegDao.deleteStudentRegistration(studentRegistration);
    }

    @Override
    public List<StudentRegistration> getStudentBySemester(UUID id) {
        return null;
    }

    @Override
    public List<StudentRegistration> getStudentBySemesterAndDepartment(UUID id, UUID unitId) {
        return null;
    }
}

