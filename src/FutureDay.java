import java.util.Scanner; //import scanner
public class FutureDay {
  public static void main(String[] args) {

    Scanner input=new Scanner(System.in); //open scanner
    System.out.println("What day is it today?");
    System.out.println("Enter 0 for Sunday" +
                       "\n      1 for Monday" +
                       "\n      2 for Tuesday" +
                       "\n      3 for Wednesday" +
                       "\n      4 for Thursday" +
                       "\n      5 for Friday" +
                       "\n      6 for Saturday");

    System.out.print("\ntoday is:"); //asking for input
    int today=input.nextInt(); //makes variable today = input
    System.out.println("You entered: "+ today); //shows you your input

    System.out.print("\nhow many days into the future? "); //asks 2nd input
    int numDays=input.nextInt(); //makes variable numDays = input
    System.out.println("You Entered: "+numDays); //shows you your input

    int futureDay=(today+numDays)%7; //adds both inputs and uses remainder 7 for 7 days in a week
    System.out.println("\nIn "+ numDays //saying in (2nd input) days
     + " days it will be day "+ futureDay ); //gives final output. 
  }
}
