package com.jceloto7.java_bank.util;

import java.util.Scanner;
public class InputUtil {
    private final Scanner scanner;

    public InputUtil(){
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        String input;
        input = scanner.nextLine();
        return input;
    }
    public void closeScanner(){
        scanner.close();
    }
}
