//This program asks the user how many snacks they have for the monster,
//and uses a while loop that will run for that number of iterations.

import java.util.Scanner;

public class NibbleMonsterWithLoopCounter {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("\"I'm a Monster and I'm Hungry!\"\n\"How many snacks you got?\"");
    int snackCount = input.nextInt();

    int count = 0;
    while (count<snackCount){
      Scanner input2 = new Scanner(System.in);
      System.out.println("\"Feed Me Your Nibbles!\"");
      char Nibble = input2.next().charAt(0);

      if (Nibble >= '0' && Nibble <= '9') {
        System.out.println("\"What a Delicious Number!\"");}

      else if ((Nibble >= 'A' && Nibble <= 'F')){
        System.out.println("\"YUM! My mother used to make alphabet soup!\"");}

      else if((Nibble>= 'a' && Nibble <= 'f')){
        System.out.println("\"I love lowercase Nibbles!\"");}

      else {
        System.out.println("\"I can't eat that!\"");}
    count++;

    }
  }
}
