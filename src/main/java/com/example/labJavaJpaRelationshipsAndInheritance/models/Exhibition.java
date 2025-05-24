package com.example.labJavaJpaRelationshipsAndInheritance.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "event_id")
public class Exhibition extends Event{

    public Exhibition() {
    }
    public Exhibition(String title, LocalDate date, Integer duration, String location, List<Guest> guests) {
        super(title, date, duration, location, guests);
    }

}
