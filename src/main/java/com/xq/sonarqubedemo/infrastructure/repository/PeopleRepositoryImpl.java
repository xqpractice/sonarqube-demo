package com.xq.sonarqubedemo.infrastructure.repository;

import com.xq.sonarqubedemo.domain.entity.People;
import com.xq.sonarqubedemo.domain.repository.PeopleRepository;
import com.xq.sonarqubedemo.infrastructure.persist.repo.PeopleRepo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PeopleRepositoryImpl implements PeopleRepository {
    private final PeopleRepo repo;

    public PeopleRepositoryImpl(PeopleRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<People> findAll() {
        return repo.getAll().stream().map(po -> new People(po.getName())).collect(Collectors.toList());
    }
}
