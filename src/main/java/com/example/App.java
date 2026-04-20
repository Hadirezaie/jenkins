package com.example;

public class App {
    public static String greet(String name) {
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        System.out.println(greet("\n\n Hello Jenkins \n\n"));
    }
}