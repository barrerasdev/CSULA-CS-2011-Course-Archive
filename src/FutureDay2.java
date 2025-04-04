import java.util.Scanner; //import scanner
public class FutureDay2
{
  public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    System.out.println("What day is it today?");
    System.out.println("Enter 0 for Sunday" +
                       "\n      1 for Monday" +
                       "\n      2 for Tuesday" +
                       "\n      3 for Wednesday" +
                       "\n      4 for Thursday" +
                       "\n      5 for Friday" +
                       "\n      6 for Saturday");

    System.out.print("\ntoday is:");
    int today=input.nextInt();
    System.out.println("You entered: "+ today);

    System.out.print("\nhow many days into the future? ");
    int numDays=input.nextInt();
    System.out.println("You Entered: "+numDays);
    int futureDay=(today+numDays)%7;
    //up until this point, its the same code as FutureDay
    int weeks=(numDays/7); //sets variable weeks with numDays/7 days in a week
    int remainder=numDays%7;//sets variable remainder with remaining days
    System.out.println("\nIn "+ weeks //shows you new weeks variable
     + " weeks and "+remainder+ " days it will be day "+ futureDay );//gives you final output
  }
}
