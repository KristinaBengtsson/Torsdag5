package Task2;

import java.util.ArrayList;

// --- Load coffee menu for a cafe ---
public class Main2 { // public class named Main
    public static void main (String[] args){ // Main method
    Cafe minCafe = new Cafe();
    minCafe.loadMenuData();

    ArrayList<String> menuList = minCafe.getCoffeeMenu();
        System.out.println("Menu List:\n" + menuList);
    }
}