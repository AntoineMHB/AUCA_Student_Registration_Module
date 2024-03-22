package model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TryTwo {
    @Id
    private UUID id;
    @ManyToOne
    private TryOne tryOne;
}