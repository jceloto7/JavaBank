package com.jceloto7.java_bank.util;

public class MismatchCorrectionUtil {
    private  final ValidationUtil validationUtil;
    private final InputUtil inputUtil;
    public MismatchCorrectionUtil(ValidationUtil validationUtil, InputUtil inputUtil){
        this.validationUtil = validationUtil;
        this.inputUtil = inputUtil;
    }

    public String retypeLetters(boolean validation, String input){
        while(!validation){
            System.out.println("Invalid input. Please just type letters:");
            input = inputUtil.getInput();
            validation = validationUtil.validationLettersAndSpaces(input);
        }

        return input;

    }

    public String retypeSixNumbers(boolean validation,String input){
        while(!validation){
            System.out.println("Invalid input. Please just type six integer numbers.");
            input = inputUtil.getInput();
            validation = validationUtil.validationSixNumbers(input);
        }

        return input;
    }

    public String retypeLowerCaseLettersAndNumbers(boolean validation, String input ){
        while(!validation){
            System.out.println("Invalid input. Please just type lower case letters and/or numbers.");
            input = inputUtil.getInput();
            validation = validationUtil.validationLowerCaseLettersAndNumbers(input);
        }

        return input;

    }

    public String retypeFourNumbers(boolean validation, String input){
        while(!validation){
            System.out.println("Invalid input. Please just type four integer numbers.");
            input = inputUtil.getInput();
            validation = validationUtil.validationFourNumbers(input);
        }

        return input;
    }

    public String retypeDecimalNumbers(boolean validation, String input){
        while(!validation){
            System.out.println("Invalid input. Please just type integer or decimal numbers.");
            input = inputUtil.getInput();
            validation = validationUtil.validationDecimalNumbers(input);
        }

        return input;

    }

}
