package com.telegrambot.core;

import org.junit.Test;

/**
 * Created by Just Code.
 */
public class BotMessageTest {
    @Test
    public void send() throws Exception {
        new BotTextMessage(467647007, "Hi there again, Bot!").send();
    }

}