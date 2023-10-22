package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.util.ConverterUtil;
import com.jceloto7.java_bank.util.InputUtil;
import com.jceloto7.java_bank.util.MismatchCorrectionUtil;
import com.jceloto7.java_bank.util.ValidationUtil;

import java.util.UUID;

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

        validation = validationUtil.validationLetters(input);
        name = mismatchCorrectionUtil.retypeLetters(validation);

        return name;
    }

    public int getClientId(String input){
        int id;

        validation = validationUtil.validationSixNumbers(input);
        toConvert = mismatchCorrectionUtil.retypeSixNumbers(validation);
        id = converterUtil.lettersForNumbers(toConvert);

        return id;

    }

    public String getClientUsername(String input){
        String username;

        validation = validationUtil.validationLowerCaseLettersAndNumbers(input);
        username = mismatchCorrectionUtil.retypeLowerCaseLettersAndNumbers(validation);

        return username;
    }

    public int getClientPassword(String input){
        int password;

        validation = validationUtil.validationFourNumbers(input);
        toConvert = mismatchCorrectionUtil.retypeFourNumbers(validation);
        password = converterUtil.lettersForNumbers(toConvert);

        return password;
    }

    public ClientModel getClientData(String name, int id, String username, int password){
        name = getClientName(name);
        id = getClientId(String.valueOf(id));
        username = getClientUsername(username);
        password = getClientPassword(String.valueOf(password));

        return new ClientModel(name,id,username,password);

    }
}
