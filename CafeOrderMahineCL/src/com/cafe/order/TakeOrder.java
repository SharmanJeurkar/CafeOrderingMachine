package com.cafe.order;

import java.util.Scanner;

public class TakeOrder {
    //String c_order;
    //DynamicArrayTakeOrder to = new DynamicArrayTakeOrder();
    public void executeOrder() {
         DynamicArrayTakeOrder to = new DynamicArrayTakeOrder();
        Scanner sc = new Scanner(System.in);
        String option;
        System.out.println("Please give your order from above items");
        boolean cont;
        do {
           String c_order = sc.nextLine();//.next() that is used for taking input without space
            //.nextLine() that accepts space
            to.push(c_order);
            System.out.println("Do you want anything more?");
            option = sc.nextLine();
            if (option.equalsIgnoreCase("yes")) {

                System.out.println("Next....");
                //to.push(c_order);
            } else {
                System.out.println("Sir final bill processing......");
                System.out.println();
                to.show();
                break;

            }

        } while (cont = true);

    }

}
