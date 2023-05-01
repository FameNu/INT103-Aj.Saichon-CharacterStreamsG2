package CharatorStreamsG2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab4 {
    public static void main(String[] args) {

        try {
            InputStreamReader key = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(key);
            System.out.print("Enter your name : ");
            String name = input.readLine();
            System.out.println("Hello " + name);
            System.out.print("Enter your weight : ");
            String w = input.readLine();
            System.out.print("Enter your height : ");
            String h = input.readLine();
            System.out.println(Double.parseDouble(w) * Double.parseDouble(h));
        } catch (IOException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
