package CharatorStreamsG2;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Enter your weight : ");
        double w = sc.nextDouble();
        System.out.println("Enter your height : ");
        double h = sc.nextDouble();
        System.out.println(w*h);
    }
}
