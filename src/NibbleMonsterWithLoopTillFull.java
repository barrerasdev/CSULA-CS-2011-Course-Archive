//This program generates a number 0 - 500 at the beginning, which corresponds
//to how hungry the monster is. The program keeps asking the user to feed the
//monster until the random number falls to zero.
//Each time the user feeds the monster a nibble, hunger decreases by the decimal
//value of the character . But when the user feeds the monster some character
//that isn't a nibble, the hunger increases by the decimal value of the character.

import java.util.Scanner;

public class NibbleMonsterWithLoopTillFull {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hunger = (int) (Math.random() * 501);
        System.out.println("\"I'm a Monster and I'm Hungry!\"");
        System.out.println("Hunger: " + hunger);

        while (hunger > 0) {
            System.out.print("Feed Monster a Nibble: ");
            char nibble = input.next().charAt(0);
            int numberValue = (int) nibble;

            if (numberValue >= 48 && numberValue <= 57)  {
                hunger -= numberValue;
                System.out.println("\"Delicious!\"Hunger decreased to: " + hunger);}

            else if (numberValue >= 65 && numberValue <= 70){
              hunger -= numberValue;
              System.out.println("\"YUM!\" Hunger decreased to: "+ hunger);}

            else if (numberValue >= 97 && numberValue <= 102){
              hunger -= numberValue;
              System.out.println("\"Scrumptious!\" Hunger decreased to: " +hunger);}

             else {
                hunger += numberValue;
                System.out.println("Oh no, the monster got sick! Hunger increased to: " + hunger);}
        }

        System.out.println("\"Thanks for all the snacks! Im sleepy now!\"");
        System.out.println("zzzZzZzzZzZzzZ");
    }
}
