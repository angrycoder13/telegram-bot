package com.telegrambot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Just Code.
 */
public class VideoService {

    private PornHubService pornHubService;

    public VideoService() {
        pornHubService = new PornHubService();
    }

    public List<Video> getTopRatedVideos(String star, int amount) {
        List<Video> allVideos = pornHubService.getVideosForStar(star);
        if (!allVideos.isEmpty()) {
            VideoSorter sorter = new VideoSorter();
            List<Video> sorted = sorter.sortByRatings(allVideos);

            List<Video> topRated = new ArrayList<>(amount);

            ListIterator<Video> itr = sorted.listIterator(sorted.size());
            int counter = 0;
            while (itr.hasPrevious() && counter < amount) {
                topRated.add(itr.previous());
            }

            return topRated;
        }
        return allVideos;
    }
}
