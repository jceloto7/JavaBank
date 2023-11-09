package com.jceloto7.java_bank.view;

import com.jceloto7.java_bank.Bootstrap;
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

        while (!switchOption.equals("6")){
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
            switchOption = inputUtil.getInput();

            switch (switchOption){
                case "1" -> System.out.println("Your balance is %.2f" + balance);

                case "2" ->{
                    System.out.println("How much money do you want to withdraw?");
                    input = inputUtil.getInput();
                    withdraw = Double.parseDouble(input);
                    if (balance < withdraw){
                        System.out.println("Insufficient funds. Please see your balance.");
                    } else{
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful. You're not getting the dirty name, are you?");
                    }
                }

                case "3" ->{
                    System.out.println("No problem!");
                    personalData = clientModel.getPersonalData();
                    System.out.println(personalData);
                }

                case "4" ->{
                    System.out.println("How much money do you want do deposit?");
                    input = inputUtil.getInput();
                    deposit = Double.parseDouble(input);
                    balance = balance + deposit;
                    System.out.println( "Deposit made successfully. You are getting rich!");
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