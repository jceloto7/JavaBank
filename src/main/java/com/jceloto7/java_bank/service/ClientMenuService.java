package com.jceloto7.java_bank.service;

import com.jceloto7.java_bank.Bootstrap;
import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.util.InputUtil;

import java.util.List;

public class ClientMenuService {
    public void clientMenu(ClientModel clientModel) {
        String personalData;
        String name;
        char[] option = new char[6];
        InputUtil inputUtil = Bootstrap.inputUtil;
        String input;
        personalData = clientModel.getPersonalData();
        name = clientModel.getName();

        while (option[0] !='3'){
            System.out.println("Hello " + name + "!" + "\n" +"""
                   Welcome to your menu.
                   What do you want to do?
                   Please, choose an option.
                   
                   1- I want to see my balance.
                   2- I need to withdraw money.
                   3- I want to see my personal data.
                   4- I'm gonna make a deposit.
                   5- I want to erase my account.
                   6- Return to main menu.
                   """);
            input = inputUtil.getInput();
            option = input.toCharArray();

            switch (option[0]){
                case '1' ->{
                    System.out.println("I want to see my balance");
                }

                case '2' ->{
                    System.out.println("I need to withdraw money.");
                }

                case '3' ->{
                    System.out.println("No problem!");
                    System.out.println(personalData);
                }

                default -> System.out.println("Invalid option. Please try again.");
            }
        }




    }


}