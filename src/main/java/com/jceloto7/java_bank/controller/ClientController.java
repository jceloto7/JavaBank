package com.jceloto7.java_bank.controller;

import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.service.ClientService;

public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService=clientService;
    }

    public String getClientName(String input) {
        try {
            return clientService.getClientName(input);
        } catch (Exception ex) {
            System.out.println("An unexpected error has occurred. Please try again.");
        }

        return "";
    }

    public String getClientId(String input) {
        try {
            return clientService.getClientId(input);
        } catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
        }
        return "";
    }

    public String getClientUsername(String input){
        try {
            return clientService.getClientUsername(input);
        } catch (Exception ex) {
            System.out.println("An unexpected error has occurred. Please try again.");
        }

        return "";

    }

    public String getClientPassword(String input) {
        try {
            return clientService.getClientPassword(input);
        } catch (Exception ex) {
            System.out.println("An unexpected error has occurred. Please try again.");
        }
        return "";
    }

    public ClientModel createClientModel(String name, String credentialNumbers, String username, String password){
        try{
            return clientService.createClientModel(name,credentialNumbers, username,password);
        }catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
        }
        return new ClientModel();
    }

    public ClientModel findClientModelByUsername(String username){
        try {
            return clientService.findClientModelByUsername(username);
        }catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
        }
        return new ClientModel();
    }

    public double getDecimalNumber(String input){
        try{
            return clientService.getDecimalNumber(input);
        }catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
        }
        return 0;
    }


}


