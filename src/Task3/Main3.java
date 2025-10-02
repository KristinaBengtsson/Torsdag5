package Task3;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args){
        //3.g - mindst 3 forskellige rum
        Room bedroom = new Room(3,2);
        Room livingroom = new Room (4,3);
        Room kidsroom = new Room (2,1);
        Room bathroom = new Room (1,1);

        //3.h - Læg dem i en collection ( samme datatyper som som jeg har brugt til rooms
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(bedroom);
        rooms.add(livingroom);
        rooms.add(kidsroom);
        rooms.add(bathroom);

        //3.i - instantier en bygning med rummene
        Building normalBuilding = new Building(rooms, 2);

        //3.j - tælle-metoder
        System.out.println("Lamps: " + countLampsInBuilding(normalBuilding));
        System.out.println("Windows: " + countWindowsInBuilding(normalBuilding));
        System.out.println("Rooms: " + countRoomsInBuilding(normalBuilding));

        //3.k - isNormal () normal og ikke normal bygning
        System.out.println("The building have more rooms than floors, its " + isNormal(normalBuilding));
        Building weirdBuilding = new Building(rooms, 10); //flere etager end rum
        System.out.println("The buiolding have less rooms than floors, its" + isNormal(weirdBuilding));


        }

    //3.j - total antal lamper i hele bygningen
    public static int countLampsInBuilding(Building b){
        int total = 0; //variabel til at samle antallet
        for (Room r : b.getRooms()){ //loop igennem ale rum i bygningen
            total += r.getNumberOfLamps(); //Læg antallet af lamper i hvert rum til total
        }
        return total; //retuner samlet antal
        }
    public static int countWindowsInBuilding(Building b){
        int total = 0;
        for (Room r : b.getRooms()){
            total += r.getNumberOfWindows();
        }
        return total;
    }
    public static int countRoomsInBuilding(Building b){
        return b.getRooms().size();

        }
    //.3.k normal hvis antal etager er mindre end antal rum
    public static boolean isNormal(Building b){
        return b.getNumberOfFloors() <= b.getRooms().size();
    }
}
