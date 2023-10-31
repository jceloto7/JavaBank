package com.jceloto7.java_bank.controller;

import com.jceloto7.java_bank.service.ValidationService;

public class ValidationController {

    private final ValidationService validationService;

    public ValidationController(ValidationService validationService){
        this.validationService = validationService;
    }

    public boolean userValidation(String username, String password){
        try{
            return validationService.userValidation(username, password);
        } catch(Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
            return false;
        }
    }
}
