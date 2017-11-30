package com.telegrambot.service;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * Created by Just Code.
 */
public class Video {

    private String duration;
    private String views;
    private String video_id;
    private String rating;
    private Integer ratings;
    private String title;
    private String url;
    private String default_thumb;
    private String thumb;
    private String publish_date;
    @JsonIgnore
    private List<Object> thumbs;
    @JsonIgnore
    private List<Object> tags;
    @JsonIgnore
    private List<Object> pornstars;
    @JsonIgnore
    private List<Object> categories;

    public String getDuration() {
        return duration;
    }

    public String getViews() {
        return views;
    }

    public String getVideo_id() {
        return video_id;
    }

    public String getRating() {
        return rating;
    }

    public Integer getRatings() {
        return ratings;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getDefault_thumb() {
        return default_thumb;
    }

    public String getThumb() {
        return thumb;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public List<Object> getThumbs() {
        return thumbs;
    }

    public List<Object> getTags() {
        return tags;
    }

    public List<Object> getPornstars() {
        return pornstars;
    }

    public List<Object> getCategories() {
        return categories;
    }
}
