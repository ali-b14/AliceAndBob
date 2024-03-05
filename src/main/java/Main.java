/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */


import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args ){
         // create a new object of class Main
        Main object = new Main();
        // call the compute() method on that new object
        //String username = compute();
        String userinput = object.compute();
    }

    public String compute() {
        // Get input string of name from user
        // Create conditional to check name against Alice and Bob
        // Print greeting to screen if Alice or Bob are true
        // Print "You are neither Alice nor Bob." otherwise

        System.out.println("what is your first name?");
        String name = s.nextLine();
        
        if(name.equals("Alice") || (name.equals("Bob"))){
            System.out.println("Hello " + name);
        } else {
            System.out.println("You are neither Alice nor Bob. ");
        }
        return name;

        


    }
} //made a comment
