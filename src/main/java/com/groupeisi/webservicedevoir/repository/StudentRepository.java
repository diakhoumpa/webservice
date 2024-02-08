package com.groupeisi.webservicedevoir.repository;

import com.groupeisi.webservicedevoir.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
