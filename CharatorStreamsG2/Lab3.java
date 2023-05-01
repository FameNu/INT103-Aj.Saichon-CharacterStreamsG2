package CharatorStreamsG2;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(60.5);
            output.print(175.0);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("data.txt");
            Scanner sc = new Scanner(file);
            String s = sc.nextLine();
            System.out.println(s);
            int age = sc.nextInt();
            System.out.println(age);
            double weight = sc.nextDouble();
            System.out.println(weight);
            double height = sc.nextDouble();
            System.out.println(height);
        } catch (FileNotFoundException ex){
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
