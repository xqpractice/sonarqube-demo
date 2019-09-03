package com.xq.sonarqubedemo.application.service;

import com.xq.sonarqubedemo.domain.entity.People;
import com.xq.sonarqubedemo.domain.repository.PeopleRepository;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class PeopleApplicationServiceTest {
    private PeopleApplicationService service;
    private PeopleRepository repository;

    @Before
    public void setup() {
        repository = mock(PeopleRepository.class);
        service = new PeopleApplicationService(repository);
    }

    @Test
    public void fetchAll() {
        when(repository.findAll()).thenReturn(Collections.singletonList(new People("cxq")));

        assertThat(service.fetchAll().size(), is(1));
    }
}