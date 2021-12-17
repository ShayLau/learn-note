package org.example.service;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class DemoService {


    public List<String> getList() {
        return Collections.emptyList();
    }

    public String getInfoById(Long id) {
        return "hello world" + id;
    }
}
