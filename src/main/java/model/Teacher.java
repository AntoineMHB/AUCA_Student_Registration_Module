package model;

import javax.persistence.Entity;

import enums.EQualification;

import java.util.UUID;

import javax.persistence.*;

@Entity
public class Teacher {
    @Id
    private UUID Id;
    private String code;
    private String names;
    @Enumerated(EnumType.STRING)
    private EQualification qualification;

    public Teacher() {
    }

    public Teacher(UUID id, String code, String names, EQualification qualification) {
        Id = id;
        this.code = code;
        this.names = names;
        this.qualification = qualification;
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
}
