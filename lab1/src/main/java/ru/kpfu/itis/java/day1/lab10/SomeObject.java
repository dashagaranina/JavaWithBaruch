package ru.kpfu.itis.java.day1.lab10;

public class SomeObject{

    @InjectRandomInt(min=2, max = 12)
    public void setRandomInt(int randomInt){
        System.out.println("My random int: "+ randomInt);
    }
}
