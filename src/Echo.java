//This program imitates a tunnel echoing input back at the user.
//It has input validation, rejecting input that is less than 3 characters in length
//or if the last 3 characters of input are numbers

import java.util.Scanner; //import scanner

public class Echo { //class name
  public static void main(String[] args) { //main method
    Scanner scan = new Scanner(System.in); //open scanner

    System.out.println("I am a long underpass, scream something at me and I shall reply."); //ask for input
    String scream = scan.nextLine(); // takes input as variable

    if (scream.length() < 3 || //conditions for input validation
      !Character.isLetter(scream.charAt(scream.length() - 1)) ||
      !Character.isLetter(scream.charAt(scream.length() - 2)) ||
      !Character.isLetter(scream.charAt(scream.length() - 3)))
      {System.out.println("Your screams fell on deaf ears...");} // reject input

    else { // once program conditions are met,
      String inputUppercase = scream.toUpperCase(); //input in uppercase
      String lastThreeCharUppercase = inputUppercase.substring(scream.length() - 3); //last 3 char in uppercase
      String lastTwoCarLowercase = scream.substring(scream.length() - 2).toLowerCase(); // last 2 char in lowercase
      String lastCharLowercase = scream.substring(scream.length() - 1).toLowerCase(); // last char in lowercase

      System.out.println(inputUppercase); //repeat input in uppercase
      System.out.println(lastThreeCharUppercase); // repeat last three in uppercase
      System.out.println(lastThreeCharUppercase.toLowerCase()); //repeat last three in lowercase now
      System.out.println(lastTwoCarLowercase); // repeat last two in lowercase
      System.out.println(lastCharLowercase); // repeat last character in lowercase
    }
  }
}
