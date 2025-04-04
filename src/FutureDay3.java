//This program calculates what day of the week it will be using user inputs
//I know it was not part of the question, but I decided to add input validation
//if the first input is in the range inquired, the entire program will run.
//Otherwise, it will reject the input and close the program.

import java.util.Scanner;                                                         //import scanner
public class FutureDay3                                                           //name
{
  public static void main(String[] args)                                          //method
  {
    Scanner input=new Scanner(System.in);                                         //open scanner

    System.out.println("What day is it today?");                                  //inquiry
    System.out.println("Enter 1 for Sunday" +
                       "\n      2 for Monday" +
                       "\n      3 for Tuesday" +
                       "\n      4 for Wednesday" +
                       "\n      5 for Thursday" +
                       "\n      6 for Friday" +
                       "\n      7 for Saturday");                                 //options

    System.out.print("\ntoday is:");
    int today=input.nextInt();                                                    //sets variable today as input
    System.out.println("You entered: "+ today);                                   //output input

    if (today >=1 && today <=7){                                                  //input validation

      System.out.print("\nhow many days into the future? ");                      //inquiry 2
      int numDays=input.nextInt();                                                //sets variable numDays as input 2
      System.out.println("You Entered: "+numDays);                                //outputs input

      int futureDay=(today+numDays)%7;                                            //new integer futureDay calculates sum of inputs/7
      String nameDay;                                                             //opens string for nameDay

        if (futureDay == 1) {                                                     // if remainder = 1, sunday
            nameDay = "Sunday";
        } else if (futureDay == 2) {                                              //if remainder = 2, monday
            nameDay = "Monday";
        } else if (futureDay == 3) {                                              //if remainder = 3, tuesday
            nameDay = "Tuesday";
        } else if (futureDay == 4) {                                              //if remainder = 4, wednesday
            nameDay = "Wednesday";
        } else if (futureDay == 5) {                                              //if remainder = 5, thursday
            nameDay = "Thursday";
        } else if (futureDay == 6) {                                              //if remainder = 6, friday
            nameDay = "Friday";
        } else {                                                                  //if != to any remainders, saturday ( 7 )
            nameDay = "Saturday";
        }

      System.out.println("\nIn " + numDays + " days it will be " + nameDay);}     //output

  else{
  System.out.println("Im Sorry, but I don't recognize your input.");}             //if input today is not between 1-7, exit

  }

}
