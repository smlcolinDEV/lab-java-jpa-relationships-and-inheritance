package com.example.labJavaJpaRelationshipsAndInheritance.repositories;

import com.example.labJavaJpaRelationshipsAndInheritance.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
