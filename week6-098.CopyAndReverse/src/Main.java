
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

    // change the copied
        copied[0] = 99;

    // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        
        int[] originalTwo = {1, 2, 3, 4};
        int[] reverse = reverseCopy(originalTwo);

    // print both
    System.out.println( "original: " +Arrays.toString(originalTwo));
    System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array) {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        return copiedArray;
    }
    
    public static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int counter = 0;
        for (int i = array.length-1; i >= 0; i--) {
            reversedArray[counter] = array[i];
            counter++;
        }
        return reversedArray;
    }
}
