package com.jceloto7.java_bank.view;

import com.jceloto7.java_bank.Bootstrap;
import com.jceloto7.java_bank.controller.ClientController;
import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.util.InputUtil;
import java.util.LinkedList;
import java.util.List;

public class MenuView {

    public void mainMenu(){
        String input;
        char[] option = new char[3];
        InputUtil inputUtil = Bootstrap.inputUtil;
        ClientController clientController = new ClientController(Bootstrap.clientService);
        ClientModel clientModel;
        String clientInput;
        String name;
        int id;
        String username;
        int password;
        List<ClientModel> clientModelList = new LinkedList<>();

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
                name = clientController.getClientName(clientInput);
                System.out.println("""
                        What a pretty name :)
                        Now, please type your id""");
                clientInput = inputUtil.getInput();
                id = clientController.getClientId(clientInput);
                System.out.println("""
                        All right! Now, you will need to create your username.
                        You will use it to enter in your account, so keep in mind.""");
                clientInput=inputUtil.getInput();
                username = clientController.getClientUsername(clientInput);
                System.out.println("""
                        We are almost finishing.
                        For the last step, create a password for your account.
                        You won't want than anyone has access to your data.
                        Remember: The password must contain just four numbers.""");
                clientInput = inputUtil.getInput();
                password = clientController.getClientPassword(clientInput);
                clientModel = clientController.getClientData(name,id, username,password);
                clientModelList.add(clientModel);


            }

            case '2' -> System.out.println("test2");
            case '3' -> System.out.println("Thanks for using the Java Bank :)");
            default -> System.out.println("Invalid option. Please try again.");
        }
    }
}
}