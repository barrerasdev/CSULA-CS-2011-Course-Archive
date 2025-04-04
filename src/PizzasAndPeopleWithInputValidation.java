// This Program Determines how many slices will be leftover if pizzas are
//split evenly.
//It uses java.util.scanner to receive input.
//It will ask for 3 inputs, which can NOT be negative.

import java.util.Scanner;                                                        //open scanner
public class PizzasAndPeopleWithInputValidation                                  //class
{
  public static void main(String[] args)                                         //main method
  {
    Scanner input=new Scanner(System.in);                                        //sets scanner variable to input
    int pizzas = 0;                                                              //sets integer to 0

    do {                                                                         //begins do
        System.out.println("How Many Pizzas?");                                  //ask for input
        pizzas=input.nextInt();                                                  //make input a variable

        if (pizzas<=0) {                                                         //if input is not positive,
          System.out.println("Call The Pizza Place!");}                          //decline and repeat input inquiry

        else {                                                                   //once input is positive,
          System.out.println("There are "+pizzas+" pizzas.");}}                  //repeat input
azx
    while (pizzas<=0);                                                           //ends do once integer is positive

    int slices = 0;                                                              //sets integer to 0

    do {                                                                         //begins do
        System.out.println("How Many Slices In Each Pizza?");                    //ask for input
        slices=input.nextInt();                                                  //make input a variable

        if(slices<=0){                                                           //if input is not positive,
                      System.out.println("That's Not Possible!");}               //decline and repeat input inquiry

        else {                                                                   //once input is positive,
              System.out.println("There Are " +slices+
                                 " Slices In Each Pizza");}}                     //repeat input

    while(slices<=0);                                                            //ends do once integer is positive


    int totalSlices=(slices*pizzas);                                             //new variable is a product of variables
    System.out.println("There Are "+totalSlices+" Total Slices Of Pizza.");      //repeat the product of integers

    int people=0;                                                                //sets integer to 0

    do {                                                                         //begins do
        System.out.println("How Many People?");                                  //ask for input
        people=input.nextInt();                                                  //make input a variable

        if(people<=0) {                                                          //if input is not positive
          System.out.println("Invite Some Friends Over!");}                      //decline and repeat input inquiry

        else {                                                                   //once input is positive
          System.out.println("There Are "+people+" Hungry People.");}}           //repeat input

    while (people<=0);                                                           //ends do once integer is positive


    int leftOvers=totalSlices%people;                                            //new variable is quotient of variables
    System.out.println("If You Split "+pizzas+" Pizzas with "+slices+
                       " Slices Each Between " +people+
                       " People, There Will Be "  +leftOvers +
                       " slices left over");

}
