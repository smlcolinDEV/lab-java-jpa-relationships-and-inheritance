package com.example.labJavaJpaRelationshipsAndInheritance.models;


import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String company;
    private String title;

    @Embedded
    private Name name;

}
