package com.example.SpringBoot_ThymeleafCrudTutorial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.SpringBoot_ThymeleafCrudTutorial.Entity.Candidate;

public interface SearchCandidateRepository extends JpaRepository<Candidate, Long> {
    @Query("SELECT p FROM Candidate p WHERE CONCAT(p.noreg) LIKE %?1%")
    public List<Candidate> search(String keyword);
}
