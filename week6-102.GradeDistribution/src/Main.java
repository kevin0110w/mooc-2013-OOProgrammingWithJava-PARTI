import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int examScore = 0;
        System.out.println("Type exam scores, -1 completes: ");
        int accepted = 0;
        int counter = 0;
        double acceptance = 0;
        int counterFive = 0;
        int counterFour = 0;
        int counterThree = 0;
        int counterTwo = 0;
        int counterOne = 0;
        int counterZero = 0;
        int j = 0;
        
        while (examScore != -1) {
            examScore = Integer.parseInt(s.nextLine());
            if (examScore == -1) {
                break;
            }
            list.add(examScore);
            counter++;
            if (examScore >29) {
                accepted++;
            }
        }
        
        System.out.println("Grade distribution: ");
        Collections.reverse(list);
        for (int a: list) {
            if (a >= 50 && a <= 60) {
                counterFive++;
        }   if (a >= 45 && a <= 49) {
            counterFour++;
        }   if (a >= 40 && a <= 44) {
            counterThree++;
        }   if (a >= 35 && a<= 39) {
            counterTwo++;
        }   if (a >= 30 && a <= 34) {
            counterOne++;
        }   if (a >= 0 && a <= 29) {
            counterZero++;
        }
       
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i) >= 50 && list.get(i) <= 60) {
                while (j < counterFive) {
                    System.out.print("*");
                    j++;
                }
            }
//             System.out.println();
//             System.out.print("4: ");
//             if (list.get(i) >= 45 && list.get(i) <= 49) {
//                 System.out.print("*");
             }
        
       
    }
         acceptance = 100 * accepted/counter;
        System.out.println("Acceptance percentage: " + acceptance);
}
}
