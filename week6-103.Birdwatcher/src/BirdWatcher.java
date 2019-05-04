import java.util.Scanner;
import java.util.ArrayList;


public class BirdWatcher {
    private ArrayList<Bird> birdWatcher;
    
    public BirdWatcher() {
        this.birdWatcher = new ArrayList<Bird>();
    }
    
    public void Add(Scanner s) {
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Latin Name: ");
        String latinName = s.nextLine();
        this.birdWatcher.add(new Bird(name, latinName));
    }
    
    public void Observation(Scanner s) {
        boolean found = false;
        System.out.print("What was observed:? ");
        String name = s.nextLine();
        for (Bird bird : this.birdWatcher) {
            if (bird.getBirdName().equals(name)) {
                bird.incBirdCount();
                found = true;
            }
        }
        if (!found) {
                System.out.println("Is not a bird!");
            }
    }
    
    public void Statistics() {
        for (Bird a: this.birdWatcher) {
            System.out.println(a);
        }
    }

    public void Show(Scanner s) {
        System.out.print("What? ");
        String bird = s.nextLine();
        for (Bird x : this.birdWatcher) {
            if (x.getBirdName().equals(bird)) {
                System.out.println(x);
            }
        }
    }
    
}
