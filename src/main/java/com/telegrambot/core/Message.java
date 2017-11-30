package com.telegrambot.core;

import java.util.Date;
import java.util.List;

/**
 * Created by Just Code.
 */
public class Message {
    private int message_id;
    private From from;
    private Chat chat;
    private Date date;
    private String text;
    private List<Entity> entities;

    public int getMessage_id() {
        return message_id;
    }

    public From getFrom() {
        return from;
    }

    public Chat getChat() {
        return chat;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public int getVideosAmount() {
        String amount = text.replaceAll("\\D+", "");
        return !amount.isEmpty() ? Integer.parseInt(amount) : 10;
    }

    public String getStarName() {
        return text.replaceAll("[0-9]", "").trim();
    }
}
