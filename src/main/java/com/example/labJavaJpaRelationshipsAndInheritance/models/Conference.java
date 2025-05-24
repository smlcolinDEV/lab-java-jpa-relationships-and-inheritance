package com.example.labJavaJpaRelationshipsAndInheritance.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "event_id")
public class Conference extends Event {

    @OneToMany(mappedBy = "conference")
    private List<Speaker> speakers;

    public Conference() {
    }
    public Conference(String title, LocalDate date, Integer duration, String location, List<Speaker> speakers) {
        super(title, date, duration, location, null);
        this.speakers = speakers;
    }
    public List<Speaker> getSpeakers() {
        return speakers;
    }
    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }


}
