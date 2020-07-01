package com.restaurant;

import java.time.Month;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Menu {
    private String restaurant;
    private static ArrayList<LocalDateTime> dates = new ArrayList<>();
    private static ArrayList<MenuItem> items = new ArrayList<>();

    public Menu(String restaurant) {
        this.restaurant = restaurant;
    }

    public void menu() {
        for (MenuItem item: this.items){
            System.out.println(item.getName());
        }
    }

    public String lastUpdated() {
        LocalDateTime date = dates.get( dates.size() - 1 );
        return date.toString();
    }

    public boolean isNew(String itemname) {
        int idx = -1;
        for (MenuItem item: this.items) {
            idx += 1;
            if (item.getName() == itemname) {
                LocalDateTime date = dates.get(idx);
                if (date.getMonth() == LocalDateTime.now().getMonth()) {
                    return true;
                } // end if
            } // end if
        } // end for
        return false;
    }

    public String getDate(String itemname) {
        int idx = -1;
        for (MenuItem item: this.items) {
            idx += 1;
            if (item.getName() == itemname) {
                Integer day = this.dates.get(idx).getDayOfMonth();
                Month month = this.dates.get(idx).getMonth();
                Integer year = this.dates.get(idx).getYear();
                String message = itemname + " was added to the " + this.restaurant + " " + day + ", " + month + ", " + year;
                return message;
            } // end if
        }
        return itemname + " has yet to be added.";
    }

    public void addItem(MenuItem item) {
        if (this.items.contains(item)) {
            System.out.println("Item already exist in menu");
        }
        else {
            this.items.add(item);
            this.dates.add(LocalDateTime.now());
        }
    }

    public void removeItem(String itemname) {
        int idx = -1;
        for (MenuItem item: this.items) {
            idx += 1;
            if (item.getName() == itemname) {
                this.items.remove(idx);
                this.dates.remove(idx);
            } // end if
        } // end for
    } // end method
}