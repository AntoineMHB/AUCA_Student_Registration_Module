package dao;



import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import model.AcademicUnit;
import model.Course;
import model.CourseDefinition;
import model.Semester;
import model.Teacher;
import model.Users;
import model.Student;
import model.StudentRegistration;
import model.StudentCourse;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create properties for Hibernate configuration
            Configuration configuration = new Configuration();
            configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
            configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/auca_crud");
            configuration.setProperty("hibernate.connection.username", "postgres");
            configuration.setProperty("hibernate.connection.password", "1234");
            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
            configuration.setProperty("hibernate.hbm2ddl.auto", "update");
            configuration.setProperty("hibernate.show_sql", "true");
            configuration.addAnnotatedClass(Users.class);
            configuration.addAnnotatedClass(Student.class);
            configuration.addAnnotatedClass(AcademicUnit.class);
            configuration.addAnnotatedClass(Course.class);
            configuration.addAnnotatedClass(CourseDefinition.class);
            configuration.addAnnotatedClass(Semester.class);
            configuration.addAnnotatedClass(Teacher.class);
            configuration.addAnnotatedClass(StudentRegistration.class);
            configuration.addAnnotatedClass(StudentCourse.class);

            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception.
            System.err.println("Initial SessionFactory creation failed: " + ex.getMessage());
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() {
        try {
            return sessionFactory.openSession();
        } catch (Exception e) {
            // Log the exception and rethrow it.
            System.err.println("Failed to open session: " + e.getMessage());
            throw e;
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}