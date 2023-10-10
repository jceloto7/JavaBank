package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.util.InputUtil;
import com.jceloto7.java_bank.util.MismatchCorrection;
import com.jceloto7.java_bank.util.ValidationUtil;

public class ClientService {
    private final InputUtil inputUtil;
    private final ValidationUtil validationUtil;
    private final MismatchCorrection mismatchCorrection;
    private boolean validation;

    public ClientService(InputUtil inputUtil, ValidationUtil validationUtil,
                         MismatchCorrection mismatchCorrection, boolean validation){

        this.inputUtil = inputUtil;
        this.validationUtil = validationUtil;
        this.mismatchCorrection = mismatchCorrection;
        this.validation = validation;
    }
    public String getClientName(String input){
        String name;

        input = inputUtil.getInput();
        validation = validationUtil.validationLetters(input);
        name = mismatchCorrection.retypeLetters(validation);

        return name;
    }

    public int getClientId(String input){
        int id;

        input = inputUtil.getInput();
        validation = validationUtil.validationSixNumbers(input);

        //id = mismatchCorrection.retypeSixNumbers(validation);
        return





    }
}
