package com.vhots.dropwizard.helloworld.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class User {
    private long id;

    @NotNull
    @Size(min = 2, max = 64)
    private String name;

    @NotNull
    @Size(min = 2, max = 16)
    private String login;

    @NotNull
    @Size(min = 8, max = 16)
    private String password;

    public User() {
    }
}
