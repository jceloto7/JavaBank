package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.model.ClientModel;

import java.util.List;

public class ValidationService {
    private final List<ClientModel> clientModelList;

    private boolean validation;

    public ValidationService(List<ClientModel> clientModelList){
        this.clientModelList = clientModelList;
    }

    public boolean userValidation(String username, String password) {
        validation = false;
        for (ClientModel clientModelIteration : clientModelList) {
            if (clientModelIteration.getUsername().equals(username) &&
                    clientModelIteration.getPassword().equals(password)) {
                validation = true;
                break;
            }

        }
        return validation;

    }

}


