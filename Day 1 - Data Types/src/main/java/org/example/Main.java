package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int intTemp = scan.nextInt();
        double doubleTemp = scan.nextDouble();
        String Temp1 = scan.nextLine(); //Catching /n
        String textTemp = scan.nextLine();

        System.out.println(i+intTemp);
        System.out.println(d+doubleTemp);
        System.out.println(s + textTemp);
        }
    }
