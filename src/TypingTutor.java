//this program uses Math.random to generate a random set of characters.
//The user is then asked to retype the word as an input
//The program is case sensitive, and will reject inputs if cased wrong or if there is
//an incorrect character.

import java.util.Scanner; // import scanner

public class TypingTutor { // class name
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // open scanner

        char ch1 = (char) ('a' + (Math.random() * ('z' - 'a' + 1))); //set first character as random
        char ch2 = (char) ('A' + (Math.random() * ('Z' - 'A' + 1))); // set second character as random
        char ch3 = (char) ('a' + (Math.random() * ('z' - 'a' + 1))); // set third character as random
        char ch4 = (char) ('A' + (Math.random() * ('Z' - 'A' + 1))); // set last character as random

        String randomWord = "" + ch1 + ch2 + ch3 + ch4; // add all characters into one variable

        System.out.println("Type the following word: " + randomWord); // spit out variable of random characters

        String userInput = scanner.nextLine(); //scan next line for input

        if (userInput.equals(randomWord)) { //if input = word
            System.out.println("Good Job!"); // confirm
        } else if (userInput.equalsIgnoreCase(randomWord)) { // if word is correct but case is not
            System.out.println("Almost there, the word is cAsE sensitive!"); // case sensitive!
        } else { //finally,
            System.out.println("Sorry, that's not it."); //reject input
        }
    }
}
