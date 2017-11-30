package com.telegrambot.service;

import com.telegrambot.net.HttpClient;
import com.telegrambot.service.util.URLUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Just Code.
 */
public class PornHubService {

    private static final String PORN_HUB_RESOURCE = "https://www.pornhub.com/webmasters/search?";

    public List<Video> getVideosForStar(String star) {
        String url = URLUtil.replaceWhiteSpaces(PORN_HUB_RESOURCE + "stars[]=" + star);
        PornHubResponse res = HttpClient.GET(url, PornHubResponse.class);
        if (res.getVideos() != null) {
            return res.getVideos();
        }
        return new ArrayList<>(0);
    }

}
