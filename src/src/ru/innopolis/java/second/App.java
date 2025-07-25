package ru.innopolis.java.second;

import java.util.Scanner;

//Формулировка задания:
//Реализовать класс Телевизор. У класса есть поля, свойства и методы.
//Проверить работу в классе App, методе main.
//Ожидаемый результат:
//        1. Создан класс Телевизор;
//        2. У класса есть поля, свойства и методы. Поля желательно сделать private.
//        3. Задать новые значения полям класса можно через конструктор.
//        4. Создан класс App с методом main.
//        5. В методе main класса App создано несколько экземпляров класса Телевизор.
//        6. Дополнительно. Задавать параметры класса Телевизор с клавиатуры или случайным числом.

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Make TV On/Off: ");
        String tvStatus = scanner.nextLine();
        System.out.println("Set channel number:");
        String channelNumber = scanner.nextLine();

        Televizor tv1 = new Televizor("Off", 1);
        Televizor tv2 = new Televizor(tvStatus, Integer.parseInt(channelNumber));

        System.out.println("TV 1 is " + tv1.getStatus() + "\nChannel is " + tv1.getChannelNumber());
        System.out.println("TV 2 is " + tv2.getStatus() + "\nChannel is " + tv2.getChannelNumber());
    }
}
