import java.util.Scanner;
public class reverse
{
  public static void main(String[]args)
  {
    System.out.println("Reverse!");

    System.out.print("Please input a number[100-999]:");
    Scanner input=new Scanner(System.in);
    int number = input.nextInt();
    System.out.println("You entered "+number);

    int reversed = 0;
    reversed = number%10;
    number=number/10;

    reversed = (reversed*10)+(number%10);
    number=number/10;

    reversed=(reversed*10)+number;

    System.out.println("Reversed: "+reversed);
    System.out.println("Number: "+ number);
  }
}
