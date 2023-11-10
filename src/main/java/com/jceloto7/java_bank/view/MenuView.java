package com.jceloto7.java_bank.view;

import com.jceloto7.java_bank.Bootstrap;
import com.jceloto7.java_bank.controller.ClientController;
import com.jceloto7.java_bank.controller.MismatchCorrectionController;
import com.jceloto7.java_bank.controller.AuthenticationController;
import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.util.InputUtil;
import com.jceloto7.java_bank.model.ClientModelList;

import static com.jceloto7.java_bank.Bootstrap.authenticationService;

public class MenuView {

    public void mainMenu(){
        String switchOption = "1";
        InputUtil inputUtil = Bootstrap.inputUtil;
        ClientController clientController = new ClientController(Bootstrap.clientService);
        ClientModel clientModel;
        String clientInput;
        String name;
        String credentialNumbers;
        String username;
        String password;
        ClientModelList clientModelList = Bootstrap.clientModelList;
        AuthenticationController authenticationController = new AuthenticationController(authenticationService);
        boolean validationSuccessful;
        boolean validationRetry;
        MismatchCorrectionController mismatchCorrectionController = new MismatchCorrectionController(Bootstrap.mismatchCorrectionService);
        ClientMenuView clientMenuView = new ClientMenuView();

        System.out.println("""
            Welcome to  Java Bank ^-^
            This is the main menu. What would you like to do?
           """);
        while (!switchOption.equals("3")){

            System.out.println("""
                Please choose an option:
                1- I wanna to create my account.
                2- I wanna to enter in my account.
                3- I want to go out.
                """);
        switchOption = inputUtil.getInput();
        switch (switchOption) {
            case "1" -> {
                System.out.println("""
                            We are glad for you decision :)
                            First of all we need to know your name.""");
                clientInput = inputUtil.getInput();
                name = clientController.getClientName(clientInput);
                System.out.println("""
                        What a pretty name :)
                        Now, please type your credential numbers (it contains six integer numbers.).""");
                clientInput = inputUtil.getInput();
                credentialNumbers = clientController.getClientId(clientInput);
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
                clientModel = clientController.createClientModel(name,credentialNumbers, username,password);
                clientModelList.addClient(clientModel);
                System.out.println("""
                        All done! Welcome to our family.
                        We hope you get satisfied with our services.
                        """);
            }

            case "2" -> {
                System.out.println("Please enter your username:");
                username = inputUtil.getInput();
                System.out.println("Great! Now, please, type your password");
                password = inputUtil.getInput();
                validationSuccessful = authenticationController.userValidation(username,password);
                if(!validationSuccessful){
                    validationRetry = mismatchCorrectionController.retypeData();
                    if(!validationRetry){
                        System.out.println("Your tries are over. You have been disconnected.");
                    } else {
                        username= mismatchCorrectionController.getUsername();
                        clientModel = clientController.findClientModelByUsername(username);
                        clientMenuView.clientMenu(clientModel);
                    }
                } else{
                    clientModel = clientController.findClientModelByUsername(username);
                    clientMenuView.clientMenu(clientModel);
                }
            }
            case "3" -> {
                inputUtil.closeScanner();
                System.out.println("Thanks for using the Java Bank :)");
            }
                default -> System.out.println("Invalid option. Please try again.");
        }
    }

}

}