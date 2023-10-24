package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.model.ClientModelList;
import java.util.List;

public class ValidationService {
    private final ClientModelList clientModelList = new ClientModelList();
    private final List<ClientModel> clientModelListIterator = clientModelList.getClientModelList();

    public boolean usernameValidation(String input){
        boolean validation = false;
        for(ClientModel clientModelIteration : clientModelListIterator){
            if (clientModelIteration.getUsername().equals(input)) {
                validation = true;
                break;
            }

        }
        return validation;

    }


}


