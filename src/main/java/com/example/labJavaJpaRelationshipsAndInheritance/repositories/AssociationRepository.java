package com.example.labJavaJpaRelationshipsAndInheritance.repositories;

import com.example.labJavaJpaRelationshipsAndInheritance.models.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository extends JpaRepository<Association, Long> {

}
