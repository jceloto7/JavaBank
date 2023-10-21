package com.jceloto7.java_bank.util;

public class MismatchCorrectionUtil {
    private  final ValidationUtil validationUtil;
    private final InputUtil inputUtil;
    private String input;
    public MismatchCorrectionUtil(ValidationUtil validationUtil, InputUtil inputUtil){
        this.validationUtil = validationUtil;
        this.inputUtil = inputUtil;
    }

    public String retypeLetters(boolean validation){
        while(!validation){
            System.out.println("Invalid input. Please just type letters:");
            input = inputUtil.getInput();
            validation = validationUtil.validationLetters(input);
        }

        return input;

    }

    public String retypeSixNumbers(boolean validation){
        while(!validation){
            System.out.println("Invalid input. Please just type six integer numbers.");
            input = inputUtil.getInput();
            validation = validationUtil.validationSixNumbers(input);
        }

        return input;
    }

    public String retypeFourNumbers(boolean validation){
        while(!validation){
            System.out.println("Invalid input. Please just type six integer numbers.");
            input = inputUtil.getInput();
            validation = validationUtil.validationSixNumbers(input);
        }

        return input;
    }

}
