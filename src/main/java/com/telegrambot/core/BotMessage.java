package com.telegrambot.core;

/**
 * Created by Just Code.
 */
public abstract class BotMessage {

    protected static final String TELEGRAM_RESOURCE = "https://api.telegram.org/bot472705096:AAGmwvoxG-NU9vTnie90DzxoYIEFpDvoqv8";

    private final int chat_id;

    public BotMessage(int chat_id) {
        this.chat_id = chat_id;
    }

    public int getChat_id() {
        return chat_id;
    }

    abstract void send();
}
