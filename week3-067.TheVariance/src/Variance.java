import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        int counter = 0;
        while (counter < list.size()) {
            sum = sum + list.get(counter);
            counter++;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        double average = (double) sum/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        int counter = 0;
        double sum = 0;
        double average = average(list);
        while (counter < list.size()) {
            sum = sum + ((list.get(counter) - average)*(list.get(counter) - average));
            counter++;
        }
        double variance = sum/(list.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
