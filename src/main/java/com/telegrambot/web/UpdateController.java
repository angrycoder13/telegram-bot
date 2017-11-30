package com.telegrambot.web;

import com.telegrambot.core.Update;
import com.telegrambot.core.UpdateHandler;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Created by Just Code.
 */
@Path("api")
public class UpdateController {

    @Inject
    private UpdateHandler updateHandler;

    @Path("update")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void processUpdate(Update update) {
        updateHandler.onUpdate(update);
    }
}
