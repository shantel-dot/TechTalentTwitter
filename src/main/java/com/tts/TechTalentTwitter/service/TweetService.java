package com.tts.TechTalentTwitter.service;

import com.tts.TechTalentTwitter.model.Tweet;
import com.tts.TechTalentTwitter.model.User;

import java.util.List;
import java.util.Optional;

public interface TweetService {

    List<Tweet> findAll();
    List<Tweet> findAllByUser(User user);
    List<Tweet> findAllByUsers(List<User> users);
    void save(Tweet tweet);
    Optional<Tweet> findById(Long id);
    List<Tweet> findAllWithTag(String tag);
    void handleTags(Tweet tweet);
    List<Tweet> formatTweets(List<Tweet> tweets);
    void addTagLinks(List<Tweet> tweets);
    void shortenLinks(List<Tweet> tweets);

}
