package com.example.SpringBoot_ThymeleafCrudTutorial.Services;

import com.example.SpringBoot_ThymeleafCrudTutorial.Entity.Candidate;
import com.example.SpringBoot_ThymeleafCrudTutorial.Repository.SearchCandidateRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class CandidateService {
     @Autowired
    private SearchCandidateRepository repo;
     
    public List<Candidate> listAll(String keyword) {
        if (keyword != null) {
            return repo.search(keyword);
        }
        return repo.findAll();
    }
}
