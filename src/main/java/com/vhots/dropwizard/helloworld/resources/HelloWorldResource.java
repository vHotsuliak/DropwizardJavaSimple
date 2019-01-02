package com.vhots.dropwizard.helloworld.resources;

import com.codahale.metrics.annotation.Timed;
import com.vhots.dropwizard.helloworld.api.Saying;
import com.vhots.dropwizard.helloworld.api.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.orElse(defaultName));
        return new Saying(counter.incrementAndGet(), value);
    }

        @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public User testForm(User accept) {
        return accept;
    }
}

