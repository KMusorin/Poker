package ru.mirea.lab4.Ex3;

import java.util.Scanner;

public class User {
    private String userName;
    private String password;
    private boolean isAuthenticated = false;
    private Trash trash = new Trash();

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }

    public String authenticate(String login, String pass){
        if (userName.equals(login) && password.equals(pass)){
            isAuthenticated = true;
            return "Вход успешно выполнен!";
        }else {
            return "Логин или пароль неверный!";
        }
    }
}