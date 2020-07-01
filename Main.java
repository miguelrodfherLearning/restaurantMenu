package com.restaurant;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
	Menu menu = new Menu("Bay Eatery");

        MenuItem BlueCrabPatty = new MenuItem("BlueCrab Patty", "#1 in Bikini Bottom", 5, "Main Course");
        MenuItem cheesecake = new MenuItem("Cheese Cake", "My favorite!", 1.99, "Dessert");
        MenuItem macAndCheese = new MenuItem("Mac & Cheese", "Better served cold!", 4.99, "Main Course");
        MenuItem pizza = new MenuItem("Pizza", "Thin Crust, Light Sauce", 5.99, "Main Course");
        MenuItem friedRice = new MenuItem("Fried Rice", "Egg with no Cat.", 3.99, "Main Course");
        MenuItem sugarCookie = new MenuItem("Sugar Cookie", "Me like cookies", 1.99, "Dessert");
        MenuItem onionRings = new MenuItem("Onion Rings", "Meh...", 1, "Appetizer");

        menu.addItem(BlueCrabPatty);
        menu.addItem(cheesecake);
        menu.addItem(macAndCheese);
        menu.addItem(pizza);
        menu.addItem(friedRice);
        menu.addItem(sugarCookie);
        menu.addItem(onionRings);


        String lastUpdated = menu.lastUpdated();
        Boolean isNew = menu.isNew(BlueCrabPatty.getName());


        menu.menu();
        System.out.println(lastUpdated);
    }
    }

