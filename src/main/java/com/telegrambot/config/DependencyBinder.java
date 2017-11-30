package com.telegrambot.config;

import com.telegrambot.core.UpdateHandler;
import com.telegrambot.core.VideoSearchBotApi;
import org.glassfish.jersey.internal.inject.AbstractBinder;

import javax.inject.Singleton;

/**
 * Created by Just Code.
 */
public class DependencyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(VideoSearchBotApi.class).to(UpdateHandler.class).in(Singleton.class);
    }
}
