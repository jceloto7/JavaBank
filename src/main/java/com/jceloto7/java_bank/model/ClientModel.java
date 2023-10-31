package com.jceloto7.java_bank.model;

public class ClientModel {
    private String name;
    private String credentialNumbers;
    private String username;
    private String password;


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

    public void setName(String name) {
        this.name = name;
    }

    public String getCredentialNumbers() {
        return credentialNumbers;
    }

    public void setCredentialNumbers(String credentialNumbers) {
        this.credentialNumbers = credentialNumbers;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPersonalData(){
        String name;
        String credentialNumbers;
        String personalData;
        //double initialBalance = 0;

        name = getName();
        credentialNumbers = getCredentialNumbers();

        personalData = """
               Your personal data: 
               
               Name: """ + name + "\n" +
               "Credential Numbers: " + credentialNumbers;
            //   "Initial Balance: " + initialBalance;
        return personalData;

    }

}
