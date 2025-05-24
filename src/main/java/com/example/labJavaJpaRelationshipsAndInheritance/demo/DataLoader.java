package com.example.labJavaJpaRelationshipsAndInheritance.demo;

import com.example.labJavaJpaRelationshipsAndInheritance.enums.MemberStatus;
import com.example.labJavaJpaRelationshipsAndInheritance.models.Association;
import com.example.labJavaJpaRelationshipsAndInheritance.models.Division;
import com.example.labJavaJpaRelationshipsAndInheritance.models.Member;
import com.example.labJavaJpaRelationshipsAndInheritance.repositories.AssociationRepository;
import com.example.labJavaJpaRelationshipsAndInheritance.repositories.DivisonRepository;
import com.example.labJavaJpaRelationshipsAndInheritance.repositories.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    private final AssociationRepository associationRepository;
    private final DivisonRepository divisonRepository;
    private final MemberRepository memberRepository;

    public DataLoader(AssociationRepository associationRepository, DivisonRepository divisonRepository, MemberRepository memberRepository) {
        this.associationRepository = associationRepository;
        this.divisonRepository = divisonRepository;
        this.memberRepository = memberRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading data...");
        // Create Divisions and Members

        var divison1 = new Division("Divison 1","<NAME1>");
        var divison2 = new Division("Divison 2","<NAME>");
        var divison3 = new Division("Divison 3","<NAME>");
        var divison4 = new Division("Divison 4","<NAME>");
        var divison5 = new Division("Divison 5","<NAME>");
        var divison6 = new Division("Divison 6","<NAME>");
        var divison7 = new Division("Divison 7","<NAME>");


        var member1 = new Member("Member 1",MemberStatus.ACTIVE,LocalDate.now());
        var member2 = new Member("Member 2",MemberStatus.ACTIVE,LocalDate.now());
        var member3 = new Member("Member 3",MemberStatus.ACTIVE,LocalDate.now());
        var member4 = new Member("Member 4",MemberStatus.ACTIVE,LocalDate.now());
        var member5 = new Member("Member 5",MemberStatus.ACTIVE,LocalDate.now());
        var member6 = new Member("Member 6",MemberStatus.ACTIVE,LocalDate.now());
        var member7 = new Member("Member 7",MemberStatus.ACTIVE,LocalDate.now());

        member1.setDivision(divison1);
        member2.setDivision(divison2);
        member3.setDivision(divison3);
        member4.setDivision(divison4);
        member5.setDivision(divison5);
        member6.setDivision(divison6);
        member7.setDivision(divison7);

        divison1.getMembers().add(member1);
        divison2.getMembers().add(member2);
        divison3.getMembers().add(member3);
        divison4.getMembers().add(member4);
        divison5.getMembers().add(member5);
        divison6.getMembers().add(member6);
        divison7.getMembers().add(member7);

        divison1.setPresident(member1);
        divison2.setPresident(member2);
        divison3.setPresident(member3);
        divison4.setPresident(member4);
        divison5.setPresident(member5);
        divison6.setPresident(member6);
        divison7.setPresident(member7);






            List<Member> allMembers = new ArrayList<>();
            allMembers.add(member1);
            allMembers.add(member2);
            allMembers.add(member3);
            allMembers.add(member4);
            allMembers.add(member5);
            allMembers.add(member6);
            allMembers.add(member7);

            var divisions = new ArrayList<Division>();
            divisions.add(divison1);
            divisions.add(divison2);
            divisions.add(divison3);
            divisions.add(divison4);
            divisions.add(divison5);
            divisions.add(divison6);
            divisions.add(divison7);
            var association = new Association("Association 1",divisions);

            var associations = new ArrayList<Association>();
            associations.add(association);

            associationRepository.saveAll(associations);
            divisonRepository.saveAll(divisions);
            memberRepository.saveAll(allMembers);


    }
}
