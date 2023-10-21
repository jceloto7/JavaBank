package com.jceloto7.java_bank.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtil {
    private  boolean validation;
    private  Pattern pattern;
    private  Matcher matcher;


    public ValidationUtil(){
    }

    public boolean validationFourNumbers(String input){
        pattern = Pattern.compile("^[0-9]{4}$");
        matcher = pattern.matcher(input);
        validation = matcher.find();

        return  validation;

    }

    public boolean validationSixNumbers(String input){
        pattern = Pattern.compile("^[0-9]{6}$");
        matcher = pattern.matcher(input);
        validation = matcher.find();

        return  validation;
    }

    public boolean validationLetters(String input){
        pattern = Pattern.compile("^[A-Z][a-z]+$");
        matcher = pattern.matcher(input);
        validation = matcher.find();

        return  validation;
    }





}
