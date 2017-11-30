package com.telegrambot.core;

/**
 * Created by Just Code.
 */
public class Update {

    private int update_id;
    private Message message;

    public int getUpdate_id() {
        return update_id;
    }

    public Message getMessage() {
        return message;
    }
}
