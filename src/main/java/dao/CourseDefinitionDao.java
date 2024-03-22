package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.CourseDefinition;

public class CourseDefinitionDao {

	 Session session = HibernateUtil.getSessionFactory().openSession();
	    public boolean addCourseDefinition(CourseDefinition courseDefinition){
	        Transaction tx = session.beginTransaction();
	        session.merge(courseDefinition);
	        tx.commit();
	        session.close();
	        return true;
	    }
	    public List<CourseDefinition> findAll() {
	        Session session = null;
	        List<CourseDefinition> result = new ArrayList<>();
	        try {
	            session = HibernateUtil.getSessionFactory().openSession();
	            result = session.createQuery("from CourseDefinition ").list();
	        } catch (HibernateException ex) {
	        } finally {
	            if (session != null) {
	                session.close();
	            }
	        }
	        return result;

	    }

	    public boolean deleteCourse(CourseDefinition courseDefinition){
	        Transaction tx = session.beginTransaction();
	        session.remove(courseDefinition);
	        tx.commit();
	        session.close();
	        return true;
	    }
//	    public List<CourseDefinition> getAllCourseDefinitions() {
//	        Session session = HibernateUtil.getSessionFactory().openSession();
//	        try {
//	            String hql = "FROM CourseDefinition";
//	            Query<CourseDefinition> query = session.createQuery(hql, CourseDefinition.class);
//	            return query.list();
//	        } finally {
//	            session.close();
//	        }
//	    }
	}

