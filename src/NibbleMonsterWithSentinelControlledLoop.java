//In this program, the Nibble Monster keeps asking for nibbles until
//the user enters 'Q' or 'q' to quit the program

import java.util.Scanner;
public class NibbleMonsterWithquitControlledLoop {
  public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            char quit = 'Q';

            System.out.println("\"I'm a Nibble Monster! Feed me nibbles!\"");
            System.out.println("Input 'Q' or 'q' to quit");

            char nibble;
            do {
                System.out.print("Feed Monster a Nibble: ");
                nibble = input.next().charAt(0);

                if (Character.toUpperCase(nibble) != quit) {
                    int numberValue = (int) nibble;
                    if (numberValue >= 48 && numberValue <= 57){
                      System.out.println("YUM!");
                    }
                    else if(numberValue >= 97 && numberValue <= 102){
                      System.out.println("Delicious!");
                    }
                    else if(numberValue >= 65 && numberValue <= 70){
                      System.out.println("Scrumptious!");
                    }
                }
            }
            while (Character.toUpperCase(nibble) != quit);

            System.out.println("\"Thanks for the Nibbles! Goodbye!\"");
        }
    }
