package com.example.demo.models.binding;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserLoginBindingModel {
    private String username;
    private String password;

    public UserLoginBindingModel() {
    }

    @Size(min = 2)
    @NotNull
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Size(min = 2)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
