import java.util.Scanner;

public class Echo2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String userInput;
    System.out.println("I am a long underpass, scream something at me and I shall reply.");
    userInput = scan.nextLine();

    if (userInput.length() < 3 ||
      !Character.isLetter(userInput.charAt(userInput.length() - 1)) ||
      !Character.isLetter(userInput.charAt(userInput.length() - 2)) ||
      !Character.isLetter(userInput.charAt(userInput.length() - 3)))

      {System.out.println("Your screams fell on deaf ears...");}



    else {
      String upperCaseInput = userInput.toUpperCase();
      String lastThreeUpper = upperCaseInput.substring(userInput.length() - 3);
      String lastTwoLower = userInput.substring(userInput.length() - 2).toLowerCase();
      String lastOneLower = userInput.substring(userInput.length() - 1).toLowerCase();

      System.out.println(upperCaseInput);
      System.out.println(lastThreeUpper);
      System.out.println(lastThreeUpper.toLowerCase());
      System.out.println(lastTwoLower);
      System.out.println(lastOneLower);
}

}

}
