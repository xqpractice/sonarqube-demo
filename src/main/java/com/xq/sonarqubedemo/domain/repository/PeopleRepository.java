package com.xq.sonarqubedemo.domain.repository;

import com.xq.sonarqubedemo.domain.entity.People;

import java.util.List;

public interface PeopleRepository {
    List<People> findAll();
}
