package com.tweteroo.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Entity
@NoArgsConstructor
public class Tweet {
    
    public Tweet(String username, String avatar, String tweet) {
        this.username = username; 
        this.avatar = avatar; 
        this.tweet = tweet;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   
    @Column(length = 50, nullable = false)
    private String username;

    @Column(nullable = false)
    private String avatar;

    @Column(length = 100, nullable = false)
    private String tweet;
}
