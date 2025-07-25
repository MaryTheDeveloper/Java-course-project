package ru.innopolis.java.second;

import java.util.Scanner;

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
