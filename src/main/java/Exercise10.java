/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        //create Scanner
        Scanner in = new Scanner(System.in);
        //prompt for the price and the quantity of item 1
        System.out.print("Enter the price of item 1: ");
        int i1p = in.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int i1q = in.nextInt();
        //prompt for the price and the quantity of item 2
        System.out.print("Enter the price of item 2: ");
        int i2p = in.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int i2q = in.nextInt();
        //prompt for the price and the quantity of item 3
        System.out.print("Enter the price of item 3: ");
        int i3p = in.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int i3q = in.nextInt();
        //calculate the total cost of all items
        double ttl_i1 = i1p * i1q;
        double ttl_i2 = i2p * i2q;
        double ttl_i3 = i3p * i3q;
        //now calculate the subtotal
        double subtotal = ttl_i1 + ttl_i2 + ttl_i3;
        //calculate the tax
        double tax = subtotal * 0.055;
        //add the tax to the subtotal
        double total = tax + subtotal;
        //give the user the information
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f", total);
    }
}
