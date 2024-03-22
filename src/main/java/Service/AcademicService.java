package Service;

import model.AcademicUnit;
import model.CourseDefinition;

import java.rmi.RemoteException;
import java.util.List;

public interface AcademicService {
    public boolean addAcademicUnit(AcademicUnit academicUnit);

    public List<AcademicUnit> findAll();

    public AcademicUnit findUnitByName(String name);

    public boolean deleteUnit(AcademicUnit unit);

    public AcademicUnit findUnitById(String id);

    public List<AcademicUnit> getAllAcademicUnit();
}
