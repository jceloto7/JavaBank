package com.jceloto7.java_bank.util;

public class ValidationUtil {
    private final InputUtil inputUtil;

    public ValidationUtil(InputUtil inputUtil){
        this.inputUtil = inputUtil;
    }
    public char validationSingleOption(String number){
        char[] singleOption = number.toCharArray();

        while (singleOption.length > 1 || singleOption[0] != '0') {
            System.out.println("Invalid option. Please try again");
            number = inputUtil.getInput();
            singleOption = number.toCharArray();
        }
        return singleOption[0];

    }
}
