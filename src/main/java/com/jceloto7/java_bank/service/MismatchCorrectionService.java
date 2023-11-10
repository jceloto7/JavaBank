package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.util.InputUtil;

public class MismatchCorrectionService {
    private final InputUtil inputUtil;
    private final AuthenticationService authenticationService;

    private String username;

    public MismatchCorrectionService(InputUtil inputUtil, AuthenticationService authenticationService){
        this.inputUtil = inputUtil;
        this.authenticationService = authenticationService;
    }

    public boolean retypeData(){
        int tries = 2;
        boolean validationSuccessful = false;
        String password;

        while(!validationSuccessful && tries <4){
            System.out.println("""
                            The username or the password are incorrect. Please try again or create your account.
                            WARNING: For security reasons you will be disconnected if the errors persist.
                            Please, type your username:""");
            username = inputUtil.getInput();
            System.out.println("Now, type your password:");
            password = inputUtil.getInput();
            validationSuccessful= authenticationService.userValidation(username,password);
            tries ++;
        }
        return validationSuccessful;
    }

    public String getUsername(){
        return username;
    }
}
