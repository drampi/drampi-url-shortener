package com.drampi.api;

import com.drampi.api.model.UrlData;
import com.drampi.api.repository.UrlDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Autowired
    private UrlDataRepository urlDataRepository;

    @Override
    public void run(String... args) throws Exception {
        this.urlDataRepository.save(new UrlData("origUrl1", "shortUrl1", new Date()));
        this.urlDataRepository.save(new UrlData("origUrl2", "shortUrl2", new Date()));
        this.urlDataRepository.save(new UrlData("origUrl3", "shortUrl3", new Date()));
    }
}
