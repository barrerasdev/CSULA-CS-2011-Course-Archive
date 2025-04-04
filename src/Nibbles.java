// Diego Barreras - L06: Char Datatype

//This program simulates a hungry monster in the terminal window. This monster
//has a very strict diet. This Monster only eats certain characters.
//He will eat the first character of what you offer (input into) him.
//He only eats the numbers 1-9, and the letters A-F, he is not cAsE sensitive.

import java.util.Scanner; //import scanner
public class Nibbles { //class name
  public static void main(String[] args) { //main method

    Scanner input = new Scanner(System.in); //open scanner
    System.out.println("\"I am a Monster. Give me a nibble\""); //request input
    char Nibble = input.next().charAt(0); //input = char valure for variable Nibble

    if (Nibble >= '0' && Nibble <= '9') { //if 0 <= Nibble <= 9,
      System.out.println("\"What a Delicious Number!\"");} // eat the nibble (input)

    else if ((Nibble >= 'A' && Nibble <= 'F') || (Nibble >= 'a' && Nibble <= 'f')){ // or if Nibble in A-F,
      System.out.println("\"YUM! My mother used to make alphabet soup!\"");} // eat the nibble (input)

    else { // after failing all conditions,
      System.out.println("\"I can't eat that!\"");} //reject nibble (input).
  }
}
