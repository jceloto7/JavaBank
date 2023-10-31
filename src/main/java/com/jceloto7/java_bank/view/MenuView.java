package com.jceloto7.java_bank.view;

import com.jceloto7.java_bank.Bootstrap;
import com.jceloto7.java_bank.controller.ClientController;
import com.jceloto7.java_bank.controller.ClientMenuController;
import com.jceloto7.java_bank.controller.MismatchCorrectionController;
import com.jceloto7.java_bank.controller.ValidationController;
import com.jceloto7.java_bank.model.ClientModel;
import com.jceloto7.java_bank.util.InputUtil;
import com.jceloto7.java_bank.model.ClientModelList;

import static com.jceloto7.java_bank.Bootstrap.validationService;

public class MenuView {

    public void mainMenu(){
        String input;
        char[] option = new char[3];
        InputUtil inputUtil = Bootstrap.inputUtil;
        ClientController clientController = new ClientController(Bootstrap.clientService);
        ClientModel clientModel;
        String clientInput;
        String name;
        String credentialNumbers;
        String username;
        String password;
        ClientModelList clientModelList = Bootstrap.clientModelList;
        ValidationController validationController = new ValidationController(validationService);
        boolean validationSucessful;
        MismatchCorrectionController mismatchCorrectionController = new MismatchCorrectionController(Bootstrap.mismatchCorrectionService);
        ClientMenuController clientMenuController = new ClientMenuController(Bootstrap.clientMenuService);

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

            case '2' -> {
                System.out.println("Please enter your username:");
                username = inputUtil.getInput();
                System.out.println("Great! Now, please, type your password");
                password = inputUtil.getInput();
                validationSucessful = validationController.userValidation(username,password);
                if(!validationSucessful){
                    mismatchCorrectionController.retypeData();
                }else {
                    clientModel = clientController.findClientModelByUsername(username);
                    clientMenuController.clientMenu(clientModel);
                }

            }
            case '3' -> System.out.println("Thanks for using the Java Bank :)");
            default -> System.out.println("Invalid option. Please try again.");
        }
    }
}


}