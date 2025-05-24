package com.example.labJavaJpaRelationshipsAndInheritance.models;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String company;
    private String title;

    @Embedded
    private Name name;

}
