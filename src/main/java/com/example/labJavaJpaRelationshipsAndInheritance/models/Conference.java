package com.example.labJavaJpaRelationshipsAndInheritance.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;
}
