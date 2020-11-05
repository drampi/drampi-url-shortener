package com.drampi.api.controller;

import com.drampi.api.model.UrlData;
import com.drampi.api.repository.UrlDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/")
public class UrlDataController {

    @Autowired
    private UrlDataRepository urlDataRepository;

    @GetMapping("all-urls")
    public List<UrlData> getAllUrlData() {
        return this.urlDataRepository.findAll();
    }
}
