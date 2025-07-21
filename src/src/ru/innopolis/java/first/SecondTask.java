package ru.innopolis.java.first;

import java.util.Random;

public class SecondTask {
    public static void main(String[] args){
        System.out.println(win());
    }

    public static String win() {
        String[] results = {"Камень", "Ножницы", "Бумага"};
        Random rnd = new Random();
        var vasya = rnd.nextInt(3);
        var petya = rnd.nextInt(3);
        var str = vasya + "," + petya;

        String result = "Вася: " + results[vasya] + "\n" + "Петя: " + results[petya] + "\n";

        if (vasya == petya)
            return result + "Ничья";
        if (str.equals("0,1") || str.equals("1,2") || str.equals("2,0"))
                return result + "Выиграл Вася";
        else
            return result + "Выиграл Петя";
    }
}
