package com.xq.sonarqubedemo.representation.controller;

import com.xq.sonarqubedemo.application.service.PeopleApplicationService;
import com.xq.sonarqubedemo.representation.response.PeopleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/peoples")
public class PeopleController {

    private final PeopleApplicationService service;

    public PeopleController(PeopleApplicationService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<PeopleResponse> fetchAll() {
        return service.fetchAll()
                .stream()
                .map(people -> new PeopleResponse(people.getName()))
                .collect(Collectors.toList());
    }
}
