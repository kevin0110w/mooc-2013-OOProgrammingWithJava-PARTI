
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] values = {6, 5, 8, 7, 11};
//        System.out.println("smallest: " + smallest(values));
//        int[] values = {6, 5, 8, 7, 11};
//        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
//        int[] values = {-1, 6, 9, 8, 12};
//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
//        int[] values = {3, 2, 5, 4, 8};
//
//        System.out.println(Arrays.toString(values));
//
//        swap(values, 1, 0);
//        System.out.println(Arrays.toString(values));
//
//        swap(values, 0, 3);
//        System.out.println(Arrays.toString(values));
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= temp) {
                temp = array[i];
            }
        }
        return temp;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                temp = i;
            }
        }
        return temp;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int temp = array[index];
        int lowest = 0;
        for (int i = index; i < array.length; i++) {
            if (array[i] <= temp) {
                temp = array[i];
                lowest = i;
            }
        }
        return lowest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallest);
            System.out.println(Arrays.toString(array));

        }
    }
}
