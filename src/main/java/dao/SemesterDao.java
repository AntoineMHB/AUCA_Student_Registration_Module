package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Semester;

public class SemesterDao {

	Session session = HibernateUtil.getSessionFactory().openSession();

    public SemesterDao() {
    }

    public boolean addSemester(Semester semester){
        Transaction tx = session.beginTransaction();
        session.merge(semester);
        tx.commit();
        session.close();
        return true;
    }
    public List<Semester> findAll() {
        Session session = null;
        List<Semester> result = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = session.createQuery("from Semester").list();
        } catch (HibernateException ex) {
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;

    }
    public boolean deleteSemester(Semester semester){
        Transaction tx = session.beginTransaction();
        session.remove(semester);
        tx.commit();
        session.close();
        return true;
    }
}

