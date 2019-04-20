public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int counter = 1;
            
        while (counter <= amount) {
            System.out.print("*");
            counter++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int counter = 1; 
        
        while (counter <= amount) {
            System.out.print(" ");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int counter = 1;
        
        while (counter <= size) {
        printWhitespaces(size - counter);
        printStars(counter);
        counter++;
    }
    }
    public static void xmasTree(int height) {
        // 40.3
        int counter = 1;
        int rowCounter = 1;
        int baseCounter = 1;
        
        while (counter <= height) {
            printWhitespaces(height - counter);
            printStars(rowCounter * 2 - 1);
            counter++;
            rowCounter++;
        }
        
        while (baseCounter <= 2) {
            printWhitespaces(height - 2);
            printStars(3);
            baseCounter++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

//        printTriangle(5);
//        System.out.println("---");
//        printTriangle(4);
//        System.out.println("---");
          xmasTree(4);
          System.out.println("---");
          xmasTree(10);
          System.out.println("---");
    }
}
