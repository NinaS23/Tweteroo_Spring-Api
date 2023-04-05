package com.tweteroo.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.model.Tweet;
import com.tweteroo.api.model.Users;
import com.tweteroo.api.repository.TweetRepository;
import com.tweteroo.api.repository.UserRepository;

@Service
public class TweetService {

    @Autowired
    public TweetRepository tweetsRepository;

    @Autowired
    public UserRepository userRepository;

    public String save(TweetDTO data) {
        Users isUserExistent = userRepository.findByUsername(data.username());

        if (isUserExistent != null) {
            tweetsRepository.save(new Tweet(data.username(), isUserExistent.getAvatar(), data.tweet()));
            return "OK";
        } else {
            return "user does not exist";
        }
    }

    public List<Tweet> findLastFiveTweets(Pageable pageable) {
        return tweetsRepository.findAll(pageable).getContent();
    }

    public List<Tweet> getUserTweets(String username) {
        return tweetsRepository.findAllByUsername(username);
    }

}
