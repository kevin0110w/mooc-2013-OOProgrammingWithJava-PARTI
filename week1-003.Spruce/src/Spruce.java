
public class Spruce {

    public static void main(String[] args) {

        // Write code here
        printSpruce(5);
        printSpruceBase(5);
    }
    
    public static void printSpruce(int numberOfRows) {
            String newWord = "";
            for (int i = 1; i <= numberOfRows; i++) {
//              Print spaces before *. There are 5-i spaces starting each row
                for (int j = 1; j <=numberOfRows-i; j++) {
                    newWord += " ";
                }
//              Print *s 
                for (int j = 1; j <=(i*2)-1; j++) {
                    newWord += "*";
                }
//              New line after each round
                newWord = newWord + "\n";
            }
           System.out.print(newWord);
    }
    
    public static void printSpruceBase(int numberOfRows) {
           String newWord = "";
           for (int i = 1; i <= 1; i++) {
               for (int j = 1; j <= numberOfRows-i; j++) {
                   newWord += " ";
               }
               for (int j = 1; j <= 1; j++) {
                   newWord += "*";
               }
               newWord += "\n";
           }
           System.out.print(newWord);
    }
}
