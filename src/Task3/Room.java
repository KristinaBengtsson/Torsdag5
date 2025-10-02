package Task3;
// --- Room ---
public class Room {
    private int numberOfLamps; //variabel der gemmer hvor mange lamper der er
    private int numberOfWindows; // variabel der gemmer hvor mange vinduer der er

    //3.b - Constructor
    public Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    //3.c - Getters and Setters
    public int getNumberOfLamps(){
        return numberOfLamps;
    }
    public void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }
    public int getNumberOfWindows(){
        return numberOfWindows;
    }
    public void setNumberOfWindows(int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
    }
}
