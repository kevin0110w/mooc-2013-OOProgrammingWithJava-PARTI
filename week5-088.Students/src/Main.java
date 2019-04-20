
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
//         Student pekka = new Student("Pekka Mikkola", "013141590");
//        System.out.println("name: " + pekka.getName());
//        System.out.println("studentnumber: " + pekka.getStudentNumber());
//        System.out.println(pekka);
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        System.out.print("name: ");
        String name = reader.nextLine();
            while (!name.equals("")) {
                System.out.print("studentnumber: ");
                String studentNumber = reader.nextLine();
                list.add(new Student(name, studentNumber));
                System.out.print("name: ");
                name = reader.nextLine();
            } 
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));                
            }
            System.out.println("");
            System.out.print("Give search term: ");
            String searchTerm = reader.nextLine();
            System.out.println("Result: ");
           for (int i = 0; i < list.size(); i++) {
               if (list.get(i).getName().contains(searchTerm)) {
                   System.out.println(list.get(i));
               }
           }
    }
}

                
            
    
