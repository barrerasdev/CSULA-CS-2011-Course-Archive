
import java.util.Scanner;
public class inputValPract
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    int value = 0;


    System.out.println("Enter a value");
    value= input.nextInt();
    System.out.println("You entered: "+ value);


    if(value > 0 ){
      System.out.println("Value is Positive");

    }
    else
    {System.out.println("Value is Negative");}





}

}
