import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
//        int[] values = {6, 5, 8, 7, 11};
//        int smallest = smallest(values);
//        System.out.println(smallest);
//int[] values = {6, 5, 8, 7, 11};
//System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
//int[] values = {-1, 6, 9, 8, 12};
//System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//System.out.println(indexOfTheSmallestStartingFrom(values, 4));
int[] values = {3, 2, 5, 4, 8};

System.out.println( Arrays.toString(values) );

swap(values, 1, 0);
System.out.println( Arrays.toString(values) );

swap(values, 0, 3);
System.out.println(Arrays.toString(values)) ;
  
    }
    
        
        public static int smallest(int[] array) {
            int smallest = 0;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i+1] < array[i]) {
                smallest =  array[i+1];
                }
            }
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < smallest) {
                smallest =  array[i];
                }
            }
            return smallest;
        }
        
         public static int indexOfTheSmallest(int[] array) {
            int smallest = smallest(array);
            
            for (int i = 0; i < array.length; i++) {
                if (array[i] ==  smallest) {
                   return i;
                }
            }
            return 0;
        }
         
//        public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
//    // write the code here
//            int smallest = 0;
//            int indexOne;
//            
//            for (int i = index; i < array.length-1; i++) {
//                if (array[i+1] <= array[i]) {
//                smallest =  array[i+1];
//                } else if (array[array.length-1] == array[index]) {
//                    smallest = array[index];
//                }
//            }
//            
//            for (int i = index; i < array.length-1; i++) {
//                if (array[i] < smallest) {
//                smallest = array[i];
//                }
//            }
//            
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] == smallest) {
//                    indexOne = i;
//                }
//                return indexOne;
//            }
//        }


        public static void swap(int[] a, int index1, int index2) {
//            int[] values = {3, 2, 5, 4, 8};
//            swap(values, 0, 3);
            int temp = 0;
            temp = a[index1];  // temp = 3;
            a[index1] = a[index2]; // 4, 2, 5, 4, 8
            a[index2] = temp; // 4, 2, 5, 3, 8
        }
}       

