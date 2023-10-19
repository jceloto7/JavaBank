package com.jceloto7.java_bank.view;

import com.jceloto7.java_bank.controller.ClientController;
import com.jceloto7.java_bank.service.ClientService;
import com.jceloto7.java_bank.util.InputUtil;
import com.jceloto7.java_bank.util.ValidationUtil;

public class MenuView {

   // private final ClientController clientController;

    //public MenuView(ClientController clientController){
      //  this.clientController=clientController;
    //}

    public void mainMenu(){
        String input;
        char[] option = new char[10];
        InputUtil inputUtil = new InputUtil();
        String clientInput;
        String name;
        int id;
        int password;

        System.out.println("""
            Welcome to  Java Bank ^-^
            This is the main menu. What would you like to do?
           """);
        while (option[0] !='3'){

            System.out.println("""
                Please choose an option:
                1- I wanna to create my account.
                2- I wanna to enter in my account.
                3- I want to go out.
                """);
        input = inputUtil.getInput();
        option = input.toCharArray();
        switch (option[0]) {
            case '1' -> {
                System.out.println("""
                            We are glad for you decision :)
                            First of all we need to know your name.""");
                clientInput = inputUtil.getInput();
                name = clientController.getClientName(input);
            }

            case '2' -> System.out.println("test2");
            case '3' -> System.out.println("Thanks for using the Java Bank :)");
            default -> System.out.println("Invalid option. Please try again.");
        }
    }
}
}