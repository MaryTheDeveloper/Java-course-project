package ru.innopolis.java.first;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args){
        System.out.println(returnHelloName());
    }

    public static String returnHelloName(){
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return "Привет, " + name;
    }
}
