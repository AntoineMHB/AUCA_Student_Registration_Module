package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Course;

public class CourseDao {

	Session session = HibernateUtil.getSessionFactory().openSession();

    public boolean addCourse(Course course) {
        Transaction tx = session.beginTransaction();
        session.merge(course);
        tx.commit();
        session.close();
        return true;
    }

    public List<Course> findAll() {
        Session session = null;
        List<Course> result = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            result = session.createQuery("from Course ").list();
        } catch (HibernateException ex) {
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }

    public boolean deleteCourse(Course course) {
        Transaction tx = session.beginTransaction();
        session.remove(course);
        tx.commit();
        session.close();
        return true;
    }
    public Course courseById(UUID id){
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM Course WHERE id = :id";
            Query<Course> query = session.createQuery(hql, Course.class);
            query.setParameter("id", id);

            return query.uniqueResult();
        }
    }
    public List<Course> courseByDepAndSem(UUID depId, UUID semId) {
        List<Course> result = new ArrayList<>();
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "SELECT c FROM Course c " +
                    "JOIN c.department d " +
                    "JOIN c.semester s " +
                    "WHERE d.id = :depId AND s.id = :semId";
            Query<Course> query = session.createQuery(hql, Course.class);
            query.setParameter("depId", depId);
            query.setParameter("semId", semId);

            result = query.list();
        } catch (HibernateException ex) {
            // Handle Hibernate exceptions
            ex.printStackTrace();
        }
        return result;
    }
}
