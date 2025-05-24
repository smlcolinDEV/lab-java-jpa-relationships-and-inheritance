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
            var member1 = new Member("John", MemberStatus.ACTIVE, LocalDate.now());
            var member2 = new Member("Jane", MemberStatus.ACTIVE, LocalDate.now());
            var member3 = new Member("Jill", MemberStatus.ACTIVE, LocalDate.now());
            var member4 = new Member("Jack", MemberStatus.ACTIVE, LocalDate.now());
            var member5 = new Member("Jill", MemberStatus.ACTIVE, LocalDate.now());
            var member6 = new Member("Jack", MemberStatus.ACTIVE, LocalDate.now());
            var member7 = new Member("Hailey", MemberStatus.ACTIVE, LocalDate.now());


            List<Member> allMembers = new ArrayList<>();
            allMembers.add(member1);
            allMembers.add(member2);
            allMembers.add(member3);
            allMembers.add(member4);
            allMembers.add(member5);
            allMembers.add(member6);
            allMembers.add(member7);


            var divison1 = new Division("Divison 1","<NAME1>",member1,allMembers);
            var divison2 = new Division("Divison 2","<NAME>",member2,allMembers);
            var divison3 = new Division("Divison 3","<NAME>",member3,allMembers);
            var divison4 = new Division("Divison 4","<NAME>",member4,allMembers);
            var divison5 = new Division("Divison 5","<NAME>",member5,allMembers);
            var divison6 = new Division("Divison 6","<NAME>",member6,allMembers);
            var divison7 = new Division("Divison 7","<NAME>",member7,allMembers);


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
