package com.telegrambot.net;

import com.telegrambot.core.BotTextMessage;
import com.telegrambot.service.PornHubResponse;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Just Code.
 */
public class HttpClientTest {

    @Test
    public void GET() throws Exception {
        PornHubResponse res = HttpClient.GET("https://www.pornhub.com/webmasters/search?stars[]=sasha%20grey", PornHubResponse.class);
        Assert.assertNotNull(res);
    }

    @Test
    public void POST() throws Exception {
        HttpClient.POST(
                "https://api.telegram.org/bot472705096:AAGmwvoxG-NU9vTnie90DzxoYIEFpDvoqv8/sendMessage",
                new BotTextMessage(467647007, "Hi there, Bot!")
        );
    }

}