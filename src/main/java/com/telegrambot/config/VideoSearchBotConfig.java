package com.telegrambot.config;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by Just Code.
 */
public class VideoSearchBotConfig extends ResourceConfig {

    public VideoSearchBotConfig() {
        register(new DependencyBinder());
        packages(true, "com.telegrambot");
    }
}
