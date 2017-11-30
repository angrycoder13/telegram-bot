package com.telegrambot.core;

import com.telegrambot.service.Video;
import com.telegrambot.service.VideoService;

import java.util.List;

/**
 * Created by Just Code.
 */
public class VideoSearchBotApi implements UpdateHandler {

    private VideoService videoService = new VideoService();

    @Override
    public void onUpdate(Update update) {
        Message mssg = update.getMessage();

        int chatId = mssg.getChat().getId();
        int videosAmount = mssg.getVideosAmount();
        String star = mssg.getStarName();

        List<Video> videos = videoService.getTopRatedVideos(star, videosAmount);
        if (!videos.isEmpty()) {
            videos.forEach(v -> new BotVideoMessage(chatId, v).send());
        } else {
            new BotTextMessage(chatId, "No videos found for star: " + star).send();
        }
    }
}
