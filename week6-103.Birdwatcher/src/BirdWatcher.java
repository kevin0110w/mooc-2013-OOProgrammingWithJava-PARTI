import java.util.Scanner;
import java.util.ArrayList;


public class BirdWatcher {
    private ArrayList<Bird> birdWatcher;
    private Bird bird;
    
    public BirdWatcher() {
        this.birdWatcher = new ArrayList<Bird>();
    }
    
    public void Add(Scanner s) {
        System.out.println("Name: ");
        String name = s.nextLine();
        System.out.println("LatinName: ");
        String latinName = s.nextLine();
        Bird bird = new Bird(name, latinName);
        this.birdWatcher.add(bird);
    }
    public void Statistics() {
        for (Bird a: this.birdWatcher) {
            System.out.println(bird.birdName + " (" + bird.latinName + ") :" + bird.birdCount + " observations");
        }
    }
    
}
