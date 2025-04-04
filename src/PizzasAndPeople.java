import java.util.Scanner; //import Scanner
public class PizzasAndPeople
 {
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in); //opens scanner

    System.out.println("How many pizzas?"); //asks for input
    int pizzas=input.nextInt(); //gets input
    System.out.println("There are: "+ pizzas+ " pizzas"); //shows input


    System.out.println("How many slices per pizza?"); //asks for input
    int slices=input.nextInt(); //gets input
    int totalSlices=(slices*pizzas); // multiplies both inputs
    System.out.println("There are "+totalSlices+" total slices of pizza"); //shows you new input


    System.out.println("How many people?"); //asks another imput
    int people=input.nextInt(); //gets input with new variable
    System.out.println("There are "+people+ " hungry people!");//shows imput for variable

    int leftOvers=totalSlices%people; //new variable = original multiplied inputs remainder other input people


  System.out.println("If you split this pizza between " +people+ //shows you original input
  " People, There will be "+leftOvers +" slices left over"); //gives you final output
  }
}
