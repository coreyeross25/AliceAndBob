/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        Main main = new Main();
        main.compute();
        // call the compute() method on that new object
    }

    public void compute() {
        // Get input string of name from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Hello " + name + "!");
        } else {
            System.out.println("You are neither Alice nor Bob.");
        }
        scanner.close();
        // Create conditional to check name against Alice and Bob

        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise
    }
}
