package Task3;

import java.util.ArrayList;
//3.d - Rooms skal indeholde flere objekter
public class Building {
    private ArrayList<Room> rooms;
    private int numberOfFloors;
//3.e - Constructor
    public Building(ArrayList <Room> rooms, int numberOfFloors){
        this.rooms = new ArrayList <> (rooms);
        this.numberOfFloors = numberOfFloors;
    }
//3.f - Getters and Setters
    public ArrayList<Room> getRooms(){
        return rooms;
    }
    public void setRooms(ArrayList <Room> rooms) {
        this.rooms = new ArrayList<> (rooms); //new fordi det er en liste af objekter
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public void setNumberOfFloors(int numberOfFloors){
        this.numberOfFloors = numberOfFloors; // new bruges kun til objekter, ikke primitive typer som int
    }
}
