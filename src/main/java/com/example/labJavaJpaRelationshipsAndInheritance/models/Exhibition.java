package com.example.labJavaJpaRelationshipsAndInheritance.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Exhibition extends Event{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Exhibition() {
    }
    public Exhibition(String title, LocalDate date, Integer duration, String location, List<Guest> guests) {
        super(title, date, duration, location, guests);
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


}
