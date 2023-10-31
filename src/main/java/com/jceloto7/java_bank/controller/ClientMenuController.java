package com.jceloto7.java_bank.controller;

import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.service.ClientMenuService;

public class ClientMenuController {

    private final ClientMenuService clientMenuService;

    public ClientMenuController(ClientMenuService clientMenuService){
        this.clientMenuService = clientMenuService;
    }

    public void clientMenu(ClientModel clientModel){
        try {
            clientMenuService.clientMenu(clientModel);
        }catch (Exception ex){
            System.out.println("An unexpected error has occurred. Please try again.");
        }
    }
}
