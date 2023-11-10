package com.jceloto7.java_bank.model;

public class ClientModel {
    private final String name;
    private final String credentialNumbers;
    private final String username;
    private final String password;


    public ClientModel(){
        this("", "", "", "");
    }

    public ClientModel(String name, String credentialNumbers, String username, String password) {
        this.name = name;
        this.credentialNumbers = credentialNumbers;
        this.username = username;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public String getCredentialNumbers() {
        return credentialNumbers;
    }


    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


    public String getPersonalData(){
        String name;
        String credentialNumbers;
        String personalData;

        name = getName();
        credentialNumbers = getCredentialNumbers();

        personalData = """
               Your personal data:
               
               Name:""" + name + "\n" +
               "Credential Numbers: " + credentialNumbers;

        return personalData;

    }

}
