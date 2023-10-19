package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.util.ConverterUtil;
import com.jceloto7.java_bank.util.InputUtil;
import com.jceloto7.java_bank.util.MismatchCorrectionUtil;
import com.jceloto7.java_bank.util.ValidationUtil;

import java.util.UUID;

public class ClientService {
    private final InputUtil inputUtil;
    private final ValidationUtil validationUtil;
    private final MismatchCorrectionUtil mismatchCorrectionUtil;

    private final ConverterUtil converterUtil;
    private boolean validation;

    private String toConvert;

    public ClientService(InputUtil inputUtil, ValidationUtil validationUtil,
                         MismatchCorrectionUtil mismatchCorrectionUtil, ConverterUtil converterUtil,
                         boolean validation, String toConvert){

        this.inputUtil = inputUtil;
        this.validationUtil = validationUtil;
        this.mismatchCorrectionUtil = mismatchCorrectionUtil;
        this.converterUtil = converterUtil;
        this.validation = validation;
        this.toConvert = toConvert;

    }
    public String getClientName(String input){
        String name;

        input = inputUtil.getInput();
        validation = validationUtil.validationLetters(input);
        name = mismatchCorrectionUtil.retypeLetters(validation);

        return name;
    }

    public int getClientId(String input){
        int id;

        input = inputUtil.getInput();
        validation = validationUtil.validationSixNumbers(input);
        toConvert = mismatchCorrectionUtil.retypeSixNumbers(validation);
        id = converterUtil.lettersForNumbers(toConvert);

        return id;

    }

    public int getClientPassword(String input){
        int password;

        input = inputUtil.getInput();
        validation = validationUtil.validationSixNumbers(input);
        toConvert = mismatchCorrectionUtil.retypeFourNumbers(validation);
        password = converterUtil.lettersForNumbers(toConvert);

        return password;
    }

    public ClientModel getClientData(String name, int id, int password,String input){
        name = getClientName(input);
        id = getClientId(input);
        password = getClientPassword(input);

        return new ClientModel(name,id,password);

    }
}
