package com.jceloto7.java_bank.view;

import com.jceloto7.java_bank.Bootstrap;
import com.jceloto7.java_bank.controller.ClientController;
import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.model.ClientModelList;
import com.jceloto7.java_bank.util.InputUtil;

public class ClientMenuView {
    public void clientMenu(@org.jetbrains.annotations.NotNull ClientModel clientModel) {
        String personalData;
        String name;
        String switchOption = "0";
        InputUtil inputUtil = Bootstrap.inputUtil;
        String input;
        name = clientModel.getName();
        ClientModelList clientModelList = Bootstrap.clientModelList;
        double balance =0;
        double deposit;
        double withdraw;
        ClientController clientController = new ClientController(Bootstrap.clientService);

        while (!switchOption.equals("6")){
            System.out.println("Hello " + name + "!" + "\n" +"""
                   Welcome to your menu.
                   What do you want to do?
                   Please, choose an option.
                   
                   1- I want to see my balance.
                   2- I need to withdraw money.
                   3- I want to see my personal data.
                   4- I'm gonna make a deposit.
                   6- Return to main menu.
                   """);
            switchOption = inputUtil.getInput();

            switch (switchOption){
                case "1" -> {
                    String formatted;

                    formatted = String.format("%.2f",balance);
                    System.out.println("Your balance is " + formatted + "\n");
                }

                case "2" ->{
                    System.out.println("How much money do you want to withdraw?");
                    input = inputUtil.getInput();
                    withdraw = clientController.getDecimalNumber(input);
                    if (balance < withdraw){
                        System.out.println("Insufficient funds. Please see your balance.\n");
                    } else{
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful. You're not getting the dirty name, are you?\n");
                    }
                }

                case "3" ->{
                    System.out.println("No problem!\n");
                    personalData = clientModel.getPersonalData();
                    System.out.println(personalData + "\n");
                }

                case "4" ->{
                    System.out.println("How much money do you want do deposit?");
                    input = inputUtil.getInput();
                    deposit = clientController.getDecimalNumber(input);
                    balance = balance + deposit;
                    System.out.println( "Deposit made successfully. You are getting rich!\n");
                }

                case "5" ->{
                    System.out.println("What a pity. We will miss you.");
                    clientModelList.removeClient(clientModel);
                    switchOption = "6";

                }

                case "6" -> System.out.println("Bye");

                default -> System.out.println("Invalid option. Please try again.");
            }
        }




    }


}