package model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TryOne {
    @Id
    private UUID id;
    private String name;
    private LocalDate dob;

}
