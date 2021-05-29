package com.cafe.order;


import java.util.Scanner;

public class MenuCard {
    ShowArray abc = new ShowArray();
    Scanner sc = new Scanner(System.in);
    String[] beverages = new String[4];
    String[] snacks = new String[4];
    String[] main_menu = new String[4];
    String[] desserts = new String[4];

    public void menuCard() {

        {
            beverages[0] = "tea";
            beverages[1] = "coffee";
            beverages[2] = "ice tea";
            beverages[3] = "milkshake";
        }

        {
            snacks[0] = "dosa";
            snacks[1] = "idli";
            snacks[2] = "poha";
            snacks[3] = "upma";
        }

        {
            main_menu[0] = "Butter Roti";
            main_menu[1] = "Paneer Butter Masala";
            main_menu[2] = "Jeera Rice";
            main_menu[3] = "Dal Tadka";
        }

        {
            desserts[0] = "ice cream";
            desserts[1] = "gulabjam";
            desserts[2] = "ras malai";
            desserts[3] = "kulfi";
        }

        System.out.println("Sir what would you like?- Beverages Snacks Main Menu Deserts");
        String option = sc.nextLine();
        if (option.equalsIgnoreCase("Beverages")) {
            abc.showArray(beverages);
        } else if (option.equalsIgnoreCase("Snacks")) {
            abc.showArray(snacks);
        } else if (option.equalsIgnoreCase("main menu")) {
            abc.showArray(main_menu);
        } else if (option.equalsIgnoreCase("Desserts")) {
            abc.showArray(desserts);
        } else {
            System.out.println("Sir option not available");
            System.exit(0);
        }

    }


}
