package ru.innopolis.java.third;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args){
        String arrow1 = "<-<<";
        String arrow2 = ">>->";
        int count = 0;

        System.out.println("Введите последовательность:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        for (int i = 0; i < text.length() - 3; i++){
            if (text.substring(i, i + 4).equals(arrow1) || text.substring(i, i + 4).equals(arrow2)){
                count++;
            }
        }
        System.out.printf("Count: %d", count);
    }
}
