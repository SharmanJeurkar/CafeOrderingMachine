package com.cafe.order;

public class MenuCard {

    public void menuCard() {
        ShowArray abc = new ShowArray();
        String[] menuCard = new String[4];
        menuCard[0] = "Coffee";
        menuCard[1] = "Tea";
        menuCard[2] = "Noodles";
        menuCard[3] = "Pizza";

        abc.showArray(menuCard);
    }

}
