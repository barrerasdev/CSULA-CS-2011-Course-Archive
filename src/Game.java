import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int points = 0; // Declare points variable

    System.out.print(
        "Well well well, looks like after applying to many different majors fate has chosen computer science as your major.\n One of your beloved subjects you picked up in high school!");
    System.out.println("---------Day 1: Orientation---------");
    System.out.println(
        "You drop off near ECST courtyard looking around confused about where to go; in the distance, you see someone with a table for orientations");
    System.out.println("You walk to it...");
    System.out.println(
        "\"Hello, I'm Ernesto\", Greets the man behind the table \"I'm the ECST advisor!\"\n*Forwarding a hand to shake*");
    System.out.println(
        "*The CSULA spirit speaks to you, and no you're not schizo yet that's for the 4th years, for now* \n\"What is your name?\"");
    String name = input.nextLine();
    System.out.println("*Shakes Hand* My name is " + name
        + "Where should I be headed? I don't know where to go? I'm lost..\n With an all-knowing smile, the advisor replies \"There will be a better time to be lost... (like when you're finishing up this game at 8 am) but today we are taking a campus tour to help out new students");
    System.out.print("");
    // Display schedule
    displaySchedule();
    System.out.print("");
    System.out.println("Where would you like to head?");
    System.out.print("A. King Hall\nB. Salazar Hall\nC. Cafeteria\nD. ECST Library");
    char current_destination = input.next().charAt(0);

    // Call handleChoice method
    handleChoice(current_destination, points);
  }

  public static void handleChoice(char current_destination, int points) {
    switch (current_destination) {
      case 'A':
      case 'a':
        System.out.println(
            "You start heading to the Lecture Hall 2.\n And enter just as the clock strikes 12. \"Just in time\" you sigh");
        points += takeTest("CS 1010",
            new String[] { "What is print() used for? ", "What does CPU stand for?" },
            new String[] { "A.To print something in python", "B. Central Processing Unit" },
            new char[] { 'A', 'B' });
        break;
      case 'B':
      case 'b':
        System.out.println("You are heading to Salazar Hall...");
        points += takeTest("Math 2110",
            new String[] { "What is the square root of 4?", "What is the square root of 25?" },
            new String[] { "A. 2", "B. 5", "C. 2.5", "D. I don't know!" },
            new char[] { 'A', 'B', 'C', 'D' });
        break;
      case 'C':
      case 'c':
        System.out.println("You are heading to the Cafeteria.");
        points += 1; // Earn 1 point for reaching the Cafeteria
        encounterObstacle();
        break;
      case 'D':
      case 'd':
        System.out.println("You are heading to the Programming Lab.");
        points += takeTest("Programming Lab",
            new String[] { "What is the purpose of a loop?", "What is an array in programming?" },
            new String[] { "A. Repeating a set of statements", "B. A data structure to store elements" },
            new char[] { 'A', 'B' });
        break;
      case 'Q':
      case 'q':
        System.out.println("Quitting the game. Goodbye!");
        break;
      default:
        System.out.println("Invalid choice. Try again.");
    }
  }

  public static void displaySchedule() { // show schedule
    System.out.println("----------Your Schedule---------");
    System.out.println("1. CS 1010 LH2  - 12:00 PM");
    System.out.println("2. Math 2110 - 11:00 AM");
    System.out.println("3. Comms 1020 - 2:00 PM");
    System.out.println("4. CLS 1200 - 1:00 PM");
    System.out.println("--------------------------------");
  }

  public static int takeTest(String course, String[] questions, String[] options, char[] correctAnswers) {

          return 0;
      }

      public static void encounterObstacle() {

      }
}
