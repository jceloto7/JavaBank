package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.Bootstrap;
import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.util.MismatchCorrectionUtil;
import com.jceloto7.java_bank.util.ValidationUtil;

import java.util.List;

public class ClientService {
    private final ValidationUtil validationUtil;
    private final MismatchCorrectionUtil mismatchCorrectionUtil;
    private boolean validation;


    public ClientService(ValidationUtil validationUtil,
                         MismatchCorrectionUtil mismatchCorrectionUtil){

        this.validationUtil = validationUtil;
        this.mismatchCorrectionUtil = mismatchCorrectionUtil;

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

    public ClientModel createClientModel(String name, String credentialNumbers, String username, String password){
        name = getClientName(name);
        credentialNumbers = getClientId(String.valueOf(credentialNumbers));
        username = getClientUsername(username);
        password = getClientPassword(String.valueOf(password));

        return new ClientModel(name,credentialNumbers,username,password);

    }

    public ClientModel findClientModelByUsername(String username) {
        List<ClientModel> clientModelList = Bootstrap.clientModelList.getClientModelList();
        for (ClientModel clientModel : clientModelList) {
            if (clientModel.getUsername().equals(username)) {
                return clientModel;
            }

        }
        return new ClientModel();

    }

    public double getDecimalNumber(String input){
        double balance ;
        String toConvert;

        validation = validationUtil.validationDecimalNumbers(input);
        toConvert = mismatchCorrectionUtil.retypeDecimalNumbers(validation, input);
        balance = Double.parseDouble(toConvert);

        return balance;

    }

}
