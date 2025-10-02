package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList; //import så jeg kan bruge en ArrayList
import java.util.Scanner;

public class Cafe { //class called Cafe
    private ArrayList<String> coffeeMenu = new ArrayList<>(); //attribute called coffeeMenu of type ArrayList<String>

    public ArrayList<String> getCoffeeMenu() { //getter-metode der giver variablen tilbage
        return coffeeMenu;
    }

    void loadMenuData() {
        try {
            File file = new File("coffees.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }
}

