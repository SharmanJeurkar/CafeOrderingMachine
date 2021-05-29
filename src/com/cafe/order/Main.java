package com.cafe.order;

import java.util.Scanner;

public class Main {

    /*
     TODO Ask the number of member visiting in variable customerNumber
     TODO menu option for the customers
     TODO Use arrays to store the order
     TODO Show the total bill .......   (optional)
     FIXME Eliminate space while taking orders
     FIXME Dynamically increase array length
     */

    public static void main(String[] args) {
        String option;
        boolean cont;
        Scanner sc = new Scanner(System.in);
        MenuCard mc = new MenuCard();
        mc.menuCard();
        TakeOrder to = new TakeOrder();
        System.out.println("Please give your order from above items");
        do {
            String c_order = sc.nextLine();/*.next() that is used for taking input without space */
            //.nextLine() that accepts space
            to.push(c_order);
            System.out.println("Do you want anything more?");
            option = sc.nextLine();
            if (option.equalsIgnoreCase("yes")) {

                System.out.println("Next....");
            } else {
                System.out.println("Sir final bill processing......");
                System.out.println();
                to.show();
                break;
            }

        } while (cont = true);


    }
}