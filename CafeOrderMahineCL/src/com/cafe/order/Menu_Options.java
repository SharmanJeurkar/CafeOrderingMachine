package com.cafe.order;

import java.util.Scanner;

public class Menu_Options {

    public void menu_option(String[] obj1, String[] obj2, String[] obj3, String[] obj4) {
        ShowArray abc = new ShowArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Sir what would you like?- Beverages Snacks Main Menu Deserts");
        String option = sc.nextLine();
        DynamicArrayTakeOrder doe=new DynamicArrayTakeOrder();


            if (option.equalsIgnoreCase("Beverages")) {
                abc.showArray(obj1);
            } else if (option.equalsIgnoreCase("Snacks")) {
                abc.showArray(obj2);
            } else if (option.equalsIgnoreCase("main menu")) {
                abc.showArray(obj3);
            } else if (option.equalsIgnoreCase("Desserts")) {
                abc.showArray(obj4);
            } else {
                System.out.println("Sir option not available");
                System.exit(0);
            }
        repeat();


    }
    public void repeat(){
        String order_more;

        Scanner sc=new Scanner(System.in);
        TakeOrder to = new TakeOrder();
        do {

            to.executeOrder();
            System.out.println("Sir do you want to choose again from above menu for ordering other items");
            order_more = sc.nextLine();
        }while(order_more.equalsIgnoreCase("yes"));

    }

}


