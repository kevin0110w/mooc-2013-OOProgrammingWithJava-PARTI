
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Freckles
 */
public class RemoveFirst {
public static void print(ArrayList<String> printed) {
    for (String word : printed) {
        System.out.println( word );
    }
}

public static void removeFirst(ArrayList<String> list) {
    list.remove(0);  // removes the first item (indexed 0)
}

public static void main(String[] args) {
    ArrayList<String> programmingLanguages = new ArrayList<String>();
//    programmingLanguages.add("Pascal");
//    programmingLanguages.add("Java");
//    programmingLanguages.add("Python");
//    programmingLanguages.add("Ruby");
//    programmingLanguages.add("C++");
//
//    print(programmingLanguages);

    removeFirst(programmingLanguages);

    System.out.println();  // prints an empty line

   print(programmingLanguages);

    }
}
