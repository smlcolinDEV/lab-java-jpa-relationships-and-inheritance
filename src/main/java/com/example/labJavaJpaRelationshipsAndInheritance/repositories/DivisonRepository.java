package com.example.labJavaJpaRelationshipsAndInheritance.repositories;

import com.example.labJavaJpaRelationshipsAndInheritance.models.Divison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisonRepository extends JpaRepository<Divison, Long> {
    Divison findByName(String name);

}
