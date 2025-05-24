package com.example.labJavaJpaRelationshipsAndInheritance.models;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Exhibition extends Event{

    public Exhibition() {
        super();
    }
    public Exhibition(String title, LocalDate date, Integer duration, String location, List<Guest> description) {
        super(title, date, duration, location, description);
    }


}
