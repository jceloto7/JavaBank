package com.jceloto7.java_bank.controller;

import com.jceloto7.java_bank.service.AuthenticationService;

public class AuthenticationController {

    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService){
        this.authenticationService = authenticationService;
    }

    public boolean userValidation(String username, String password){
        try{
            return authenticationService.userValidation(username, password);
        } catch(Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
            return false;
        }
    }
}
