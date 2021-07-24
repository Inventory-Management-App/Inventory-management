package com.example.pos_ui.Model;

public class RegisterCashierCredentials {

    private String Name;
    private String Username;
    private String Password;
    private String ConfirmPassword;

    public RegisterCashierCredentials(String name, String username, String password, String confirmPassword) {
        this.Name = name;
        this.Username = username;
        this.Password = password;
        this.ConfirmPassword = confirmPassword;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }
}
