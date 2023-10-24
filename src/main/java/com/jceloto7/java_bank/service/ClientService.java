package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.util.ConverterUtil;
import com.jceloto7.java_bank.util.MismatchCorrectionUtil;
import com.jceloto7.java_bank.util.ValidationUtil;

public class ClientService {
    private final ValidationUtil validationUtil;
    private final MismatchCorrectionUtil mismatchCorrectionUtil;

    private final ConverterUtil converterUtil;
    private boolean validation;

    private String toConvert;

    public ClientService(ValidationUtil validationUtil,
                         MismatchCorrectionUtil mismatchCorrectionUtil, ConverterUtil converterUtil){

        this.validationUtil = validationUtil;
        this.mismatchCorrectionUtil = mismatchCorrectionUtil;
        this.converterUtil = converterUtil;

    }
    public String getClientName(String input){
        String name;

        validation = validationUtil.validationLettersAndSpaces(input);
        name = mismatchCorrectionUtil.retypeLetters(validation,input);

        return name;
    }

    public String getClientId(String input){
        String id;

        validation = validationUtil.validationSixNumbers(input);
        id = mismatchCorrectionUtil.retypeSixNumbers(validation,input);

        return id;

    }

    public String getClientUsername(String input){
        String username;

        validation = validationUtil.validationLowerCaseLettersAndNumbers(input);
        username = mismatchCorrectionUtil.retypeLowerCaseLettersAndNumbers(validation,input);

        return username;
    }

    public String getClientPassword(String input){
        String password;

        validation = validationUtil.validationFourNumbers(input);
        password = mismatchCorrectionUtil.retypeFourNumbers(validation,input);

        return password;
    }

    public ClientModel getClientData(String name, String id, String username, String password){
        name = getClientName(name);
        id = getClientId(String.valueOf(id));
        username = getClientUsername(username);
        password = getClientPassword(String.valueOf(password));

        return new ClientModel(name,id,username,password);

    }
}
