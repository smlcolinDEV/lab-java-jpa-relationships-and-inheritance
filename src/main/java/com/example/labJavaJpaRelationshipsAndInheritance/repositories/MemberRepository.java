package com.example.labJavaJpaRelationshipsAndInheritance.repositories;

import com.example.labJavaJpaRelationshipsAndInheritance.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}
