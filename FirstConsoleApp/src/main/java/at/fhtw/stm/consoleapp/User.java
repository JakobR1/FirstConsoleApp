package at.fhtw.stm.consoleapp;

public class User {
    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    private int id;
    private String login;
    private String passwordHash;
}
