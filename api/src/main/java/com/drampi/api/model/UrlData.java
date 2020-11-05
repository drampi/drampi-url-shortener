package com.drampi.api.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test_table")
public class UrlData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "original_url")
    private String originalUrl;
    @Column(name = "short_url")
    private String shortUrl;
    @Column(name = "created_at")
    private Date createdAt;

    public UrlData() {}

    public UrlData(String originalUrl, String shortUrl, Date createdAt) {
        super();
        this.originalUrl = originalUrl;
        this.shortUrl = shortUrl;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
