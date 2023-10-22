package com.jceloto7.java_bank.model;

public class ClientModel {
    private String name;
    private int id;
    private String username;
    private int password;


    public ClientModel(){
        this("", 0, "", 0);
    }

    public ClientModel(String name, int id, String username, int password) {
        this.name = name;
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}