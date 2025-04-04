//This program is a Letter Grade calculator
//The problem with this code was that the range of each letter grade was not
//capped, leading to anything over 60 being a D. Using && ( and ) I was able
//to add another condition ( the range's cap ) and it ran successfully.
import java.util.Scanner;

public class LetterGrade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //this was all fine

    System.out.print("What is your score out of 100? ");
    int score = input.nextInt(); //this is fine too

    String letterGrade; //opens string letterGrade looks fine
    if (score >= 60 && score <= 69)
      letterGrade = "D"; //sets range 60+, D , but did not cap the range at 69.
    else if (score >= 70 && score <= 79 )
      letterGrade = "C"; //sets range 70+, C, same case scenario, 79
    else if (score >= 80 && score <= 89)
      letterGrade = "B"; //sets range 80+, B, same case scenario, 89
    else if (score >= 90 && score <= 100)
      letterGrade = "A"; //sets range 90+, A, same case scenario, 100
    else
      letterGrade = "F"; //all else, F, this was fine

    System.out.println("Your grade is " + letterGrade);// this looks fine too

    // this code should run as intended now. Onto the Terminal!
    //code works!
  }
}
