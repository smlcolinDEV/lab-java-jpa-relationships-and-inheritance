package com.example.labJavaJpaRelationshipsAndInheritance.models;

import com.example.labJavaJpaRelationshipsAndInheritance.enums.GuestStatus;
import jakarta.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private GuestStatus status;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
