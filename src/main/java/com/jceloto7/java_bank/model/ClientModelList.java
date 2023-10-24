package com.jceloto7.java_bank.model;

import java.util.LinkedList;
import java.util.List;

public class ClientModelList {
    private final List<ClientModel>clientModelList = new LinkedList<>();

    public void addClient(ClientModel clientModel){
        clientModelList.add(clientModel);
    }

    public List<ClientModel>getClientModelList(){
        return clientModelList;
    }
}
