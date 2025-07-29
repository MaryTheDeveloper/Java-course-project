package ru.innopolis.java.third;

import java.util.Scanner;

public class FirstTask {

    private static String KEYBOARD_ALPHABET = "qwertyuiopasdfghjklzxcvbnm";

    public static void main(String[] args){
        String previousLetter;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите английскую букву");
        String letter = scanner.nextLine();

        int index = KEYBOARD_ALPHABET.indexOf(letter);
        if (index == 0)
            previousLetter = String.valueOf(KEYBOARD_ALPHABET.charAt(KEYBOARD_ALPHABET.length()-1));
        else
            previousLetter = String.valueOf(KEYBOARD_ALPHABET.charAt(index - 1));

        System.out.printf("Предыдущая буква на клавиатуре: %s", previousLetter);
    }
}
