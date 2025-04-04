//This program displays the Nibble Monster happily asking for more nibbles
//until the user gives it something that is not a nibble. At that point the
//monster becomes unhappy and the loop ends. It uses a do while loop to
//make sure the monster is happy with the adequate nibbles.

import java.util.Scanner;
public class NibbleMonsterWithLoopWhileHappy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean happy = true;

        System.out.println("\"I'm a Nibble Monster! Keep feeding me nibbles!\"");
        System.out.println("Enter 'q' to quit.");

        do {
            System.out.print("Feed Monster a Nibble: ");
            String nibble = input.next();

          if (nibble.length() == 1) {
                char charNibble = nibble.charAt(0);
                int numberValue = (int) charNibble;

                if (numberValue >= 48 && numberValue <= 57) {
                    System.out.println("\"Delicious!\"");}

                else if (numberValue >= 97 && numberValue <= 102){
                  System.out.println("\"Scrumptious!\"");}

                else if(numberValue >= 65 && numberValue <= 70){
                  System.out.println("\"YUM!\"");}

                else {
                    System.out.println("\"Eww! THATS NOT A NIBBLE!\"");
                    happy = false;}}

          else {
                  System.out.println("\"Eww! THATS NOT A NIBBLE!\"");
                  happy = false;}}
        while (happy);

        System.out.println("\"Thanks for the nibbles! I'm done for now!\"");
    }
}
