package com.xq.sonarqubedemo.application.service;

import com.xq.sonarqubedemo.domain.entity.People;
import com.xq.sonarqubedemo.domain.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleApplicationService {

    private final PeopleRepository repository;

    public PeopleApplicationService(PeopleRepository repository) {
        this.repository = repository;
    }

    public List<People> fetchAll() {
        return repository.findAll();
    }
}
