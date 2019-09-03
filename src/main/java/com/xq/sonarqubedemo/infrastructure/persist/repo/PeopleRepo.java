package com.xq.sonarqubedemo.infrastructure.persist.repo;

import com.xq.sonarqubedemo.infrastructure.persist.po.PeoplePo;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class PeopleRepo {
    public List<PeoplePo> getAll() {
        return Collections.singletonList(new PeoplePo("cxq"));
    }
}
