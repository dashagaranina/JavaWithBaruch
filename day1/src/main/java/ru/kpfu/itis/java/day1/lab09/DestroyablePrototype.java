package ru.kpfu.itis.java.day1.lab09;

public class DestroyablePrototype {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void destroy(){
        System.out.println("Finalize object!");
    }
}
