package com.example.labJavaJpaRelationshipsAndInheritance.repositories;

import com.example.labJavaJpaRelationshipsAndInheritance.models.Name;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<Name, Long> {

}
