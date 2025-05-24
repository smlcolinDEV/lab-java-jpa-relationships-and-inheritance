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
            var member8 = new Member("Hannah", MemberStatus.ACTIVE, LocalDate.now());

            var members1 = new ArrayList<Member>();
            members1.add(member1);
            var divison1 = new Division("Divison 1","<NAME1>",member1,members1);

            var members2 = new ArrayList<Member>();
            members2.add(member2);
            var divison2 = new Division("Divison 2","<NAME2>",member2,members2);

            var members3 = new ArrayList<Member>();
            members3.add(member3);
            var divison3 = new Division("Divison 3","<NAME>",member3,members3);

            var members4 = new ArrayList<Member>();
            members4.add(member4);
            var divison4 = new Division("Divison 4","<NAME4>",member4,members4);

            var members5 = new ArrayList<Member>();
            members5.add(member5);
            var divison5 = new Division("Divison 5","<NAME5>",member5,members5);

            var members6 = new ArrayList<Member>();
            members6.add(member6);
            var divison6 = new Division("Divison 6","<NAME6>",member6,members6);

            var members7 = new ArrayList<Member>();
            members7.add(member7);
            var divison7 = new Division("Divison 7","<NAME7>",member7,members7);

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
            memberRepository.saveAll(members1);


    }
}
