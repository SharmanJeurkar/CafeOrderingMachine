package com.cafe.order;

import java.util.Scanner;

public class Main {

    /*
     TODO Ask the number of member visiting in variable customerNumber
     TODO menu option for the customers
     TODO Use arrays to store the order
     TODO Show the total bill .......   (optional)
     */

    public static void main(String[] args) {

        //title board
        System.out.println("Welcome to our cafe");

        //taking input
        Scanner sc = new Scanner(System.in);


        String[] menu = new String[5];// menu of the cafe
        menu[0] = "Noodles";
        menu[1] = "Pizza";
        menu[2] = "Burger";
        menu[3] = "Sandwiches";
        menu[4] = "Coffee";

        System.out.println("Menu: ");// Printing the menu

        for (String food : menu)//printing the menu array
            System.out.print(food + " ");

        System.out.println();

        System.out.println("Sir please tell your number of orders");
        int numOrder = sc.nextInt();
        System.out.println("Please place your order from the above menu");
        //Allowing the user to store input in the customerOrder array
        String[] customerOrder = new String[numOrder];
        for (int i = 0; i < numOrder; i++) {
            customerOrder[i] = sc.next();
        }
        for (String order : customerOrder) {
            System.out.print(order + " ");
        }
        System.out.println();
        System.out.println("Thank you for selecting our cafe");
    }
}
