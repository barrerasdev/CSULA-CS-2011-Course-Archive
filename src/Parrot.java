//This program imitates a Parrot repeating whatever you input into it.
//It uses a scanner to receive input and prints the input with an "!" at the end.

import java.util.Scanner; // import scanner

public class Parrot { // class name
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // open scanner

        System.out.print("Enter something: "); // ask for input

        String userInput = scanner.nextLine(); // scan input and set as variable  userInput

        System.out.println(userInput + "!"); // returns input as output
    }
}
