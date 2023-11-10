package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.model.ClientModel;

import java.util.List;

public class AuthenticationService {
    private final List<ClientModel> clientModelList;

    public AuthenticationService(List<ClientModel> clientModelList) {
        this.clientModelList = clientModelList;
    }

    public boolean userValidation(String username, String password) {
        boolean validation;

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
