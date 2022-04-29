package com.example.school.demo.repository;

import com.example.school.demo.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface schoolRepository extends JpaRepository<School,Long> {
    School findBySchoolID(Long schoolID);
}
