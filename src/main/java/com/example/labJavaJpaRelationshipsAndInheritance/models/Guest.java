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

    public Guest() {
    }
    public Guest(String name, GuestStatus status, Event event) {
        this.name = name;
        this.status = status;
        this.event = event;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public GuestStatus getStatus() {
        return status;
    }
    public void setStatus(GuestStatus status) {
        this.status = status;
    }
    public Event getEvent() {
        return event;
    }
    public void setEvent(Event event) {
        this.event = event;
    }

}
