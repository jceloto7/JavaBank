package com.jceloto7.java_bank.controller;

import com.jceloto7.java_bank.service.ClientService;

public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService=clientService;
    }

    //public ClientController(){

    //}

    public String getClientName(String input){
        return clientService.getClientName(input);
    }

    public int getClientId(String input){
        return clientService.getClientId(input);
    }

    public int getClientPassword(String input){
        return  clientService.getClientPassword(input);
    }
}
