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

    public ClientModel getClientData(String name, String id, String username, String password){
        try{
            return clientService.getClientData(name,id, username,password);
        }catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
        }
        return new ClientModel();
    }


}


