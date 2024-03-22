package bean;

import java.util.UUID;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import model.CourseDefinition;
import model.Semester;
import model.Teacher;

public class CourseBean {

	 private UUID id;
	    @ManyToOne
	    @JoinColumn(name = "semester")
	    private Semester semester;
	    @ManyToOne
	    @JoinColumn(name = "teacher")
	    private Teacher teacher;
	    @OneToOne
	    @JoinColumn(name = "coursed")
	    private CourseDefinition courseDefinition;
	    private String infoMessage;
	    private String errorMessage;

	    public CourseBean() {
	    }

	    public CourseBean(UUID id, Semester semester, Teacher teacher, CourseDefinition courseDefinition, String infoMessage, String errorMessage) {
	        this.id = id;
	        this.semester = semester;
	        this.teacher = teacher;
	        this.courseDefinition = courseDefinition;
	        this.infoMessage = infoMessage;
	        this.errorMessage = errorMessage;
	    }

	    public UUID getId() {
	        return id;
	    }

	    public void setId(UUID id) {
	        this.id = id;
	    }

	    public Semester getSemester() {
	        return semester;
	    }

	    public void setSemester(Semester semester) {
	        this.semester = semester;
	    }

	    public Teacher getTeacher() {
	        return teacher;
	    }

	    public void setTeacher(Teacher teacher) {
	        this.teacher = teacher;
	    }

	    public CourseDefinition getCourseDefinition() {
	        return courseDefinition;
	    }

	    public void setCourseDefinition(CourseDefinition courseDefinition) {
	        this.courseDefinition = courseDefinition;
	    }

	    public String getInfoMessage() {
	        return infoMessage;
	    }

	    public void setInfoMessage(String infoMessage) {
	        this.infoMessage = infoMessage;
	    }

	    public String getErrorMessage() {
	        return errorMessage;
	    }

	    public void setErrorMessage(String errorMessage) {
	        this.errorMessage = errorMessage;
	    }
	}

