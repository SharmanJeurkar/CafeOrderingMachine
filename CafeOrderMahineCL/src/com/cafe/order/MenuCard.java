package com.cafe.order;



public class MenuCard {

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
            desserts[2] = "rasmalai";
            desserts[3] = "kulfi";
        }

        Menu_Options mo = new Menu_Options();
        mo.menu_option(beverages, snacks, main_menu, desserts);

    }


}
