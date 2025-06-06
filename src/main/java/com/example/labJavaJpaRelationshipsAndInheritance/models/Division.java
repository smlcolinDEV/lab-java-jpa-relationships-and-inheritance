package com.example.labJavaJpaRelationshipsAndInheritance.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    @OneToMany(mappedBy = "division")
    private List<Member> members;

    @ManyToOne
    private Association association;

    public Division() {
    }
    public Division(String name, String district, Member president, List<Member> members, Association association) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
        this.association = association;

    }
    public Division(String name, String district) {
        this.name = name;
        this.district = district;
    }
    public Association getAssociation() {
        return association;
    }
    public void setAssociation(Association association) {
        this.association = association;
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
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public Member getPresident() {
        return president;
    }
    public void setPresident(Member president) {
        this.president = president;
    }
    public List<Member> getMembers() {
        return members;
    }
    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
