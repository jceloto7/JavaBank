package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.util.InputUtil;

public class MismatchCorrectionService {
    private final InputUtil inputUtil;
    private final ValidationService validationService;

    public MismatchCorrectionService(InputUtil inputUtil, ValidationService validationService){
        this.inputUtil = inputUtil;
        this.validationService = validationService;
    }

    public boolean retypeData(){
        int tries = 2;
        boolean validationSucessful = false;
        String username;
        String password;

        while(!validationSucessful && tries <4){
            System.out.println("""
                            The username or the password are incorrect. Please try again or create your account.
                            WARNING: For security reasons you will be disconnected if the errors persist.
                            Please, type your username:""");
            username = inputUtil.getInput();
            System.out.println("Now, type your password:");
            password = inputUtil.getInput();
            validationSucessful=validationService.userValidation(username,password);
            tries ++;
        }
        return validationSucessful;
    }
}
