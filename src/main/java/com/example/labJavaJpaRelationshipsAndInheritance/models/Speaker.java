package com.example.labJavaJpaRelationshipsAndInheritance.models;

import jakarta.persistence.*;

public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer presentationDuration;
    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;




}
