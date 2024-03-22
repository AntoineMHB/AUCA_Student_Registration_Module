package bean;

import java.util.UUID;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import enums.EQualification;

public class TeacherBean {

	 private UUID Id;
	    private String code;
	    private String names;
	    @Enumerated(EnumType.STRING)
	    private EQualification qualification;
	    private String infoMessage;
	    private String errorMessage;

	    public TeacherBean() {
	    }

	    public TeacherBean(UUID id, String code, String names, EQualification qualification, String infoMessage, String errorMessage) {
	        Id = id;
	        this.code = code;
	        this.names = names;
	        this.qualification = qualification;
	        this.infoMessage = infoMessage;
	        this.errorMessage = errorMessage;
	    }

	    public UUID getId() {
	        return Id;
	    }

	    public void setId(UUID id) {
	        Id = id;
	    }

	    public String getCode() {
	        return code;
	    }

	    public void setCode(String code) {
	        this.code = code;
	    }

	    public String getNames() {
	        return names;
	    }

	    public void setNames(String names) {
	        this.names = names;
	    }

	    public EQualification getQualification() {
	        return qualification;
	    }

	    public void setQualification(EQualification qualification) {
	        this.qualification = qualification;
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
