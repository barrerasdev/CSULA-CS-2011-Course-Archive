import java.util.Scanner;
public class PizzasForThePeople
 {
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);

    System.out.println("How many pizzas?");
    int pizzas=input.nextInt();
    System.out.println("There are: "+ pizzas+ " pizzas");


    System.out.println("How many slices per pizza?");
    int slices=input.nextInt();
    int totalSlices = slices*pizzas;
    System.out.println("There are "+ totalSlices +" total slices of pizza");


    System.out.println("How many people?");
    int people=input.nextInt();
    System.out.println("There are "+ people + " hungry people!");
//up until this point, same code as PizzasAndPeople, lets see whats new oh yea i love coding
    int slicesPerPerson=totalSlices/people; //determines how many slices each person can while distrubiting equally
    System.out.println("Slices Per Person: " + slicesPerPerson);//shows u slices per person
    int wholePizzas = slicesPerPerson/slices;//figure out how many pizzas were whole, slices per person over slices determines if there was any left whole
    int leftSlices= totalSlices-(slicesPerPerson*people); // total slices-(slices per person * people ) will subtract the total slices minus how many slices-
    //-were distributed, giving you the remaining slices

  System.out.println("If you split this pizza evenly among "+ people +" people,"+ //shows you input
  "you will have " + wholePizzas + " whole pizzas and "+ leftSlices +" slices left over."); //gives you output
  }
}
  //since this ones tricky, ill do an example
  //5 pizzas 10 slices, totalSlices = 50
  //people = 8 so 50/8 = 6.25 so 6 slices per person will be distrubuted evenly
  //now, was there any pizzas whole? 6 slices per person / slices per pizza (10) = 0.6 NONE whole Pizzas
  //whats the remainding amount of slices though?? oh its easy, we go total slices (50) mines (slices per person (6)*people (8)=48) so 50-48=2
  //fin
