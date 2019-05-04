import java.util.Scanner;

public class Bird {
    private int birdCount;
    private String birdName;
    private String latinName;
    private Scanner s;
    
    public Bird(String name, String latinName) {
        this.birdName = name;
        this.latinName = latinName;
        this.birdCount = 0;
    }
    
    public String getBirdName() {
        return this.birdName;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public int getBirdCount() {
        return this.birdCount;
    }
    
    public void incBirdCount() {
        this.birdCount++;
    }
    
    public String toString() {
        return this.birdName + " (" + this.latinName + ") : " + this.birdCount + " observations";
    }
}
