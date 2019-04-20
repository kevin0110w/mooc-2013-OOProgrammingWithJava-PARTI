import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine() {
        Random random = new Random();
        for (int i = 0; i < this.width; i++) {
            double r = random.nextDouble();
            if (r > this.density) {
                System.out.print(" ");
            } else {
                System.out.print("*");
                this.starsInLastPrint++;
            }
        }
        System.out.println("");
    }
    
    public void print() {
        for (int i = 0; i < this.height; i++) {
            this.printLine();
        }
    }
    
    public int starsInLastPrint() {
        int temporary = this.starsInLastPrint;
        this.starsInLastPrint = 0;
        return temporary;
    }
}
