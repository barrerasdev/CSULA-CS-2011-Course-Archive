//This program prints the numbers 1-100, where if the number is divisible by
//3, it prints a "Beep". If divisible by 5, prints "Boop". Finally, if the
//number is divisble by both 3 and 5, it will print out "BeepBoop". If the
//number is not divisible by either, it prints out the number value.

//This program uses a for loop to initialize the count from i = 1 to i = 100
//It takes into account some conditionals in order to fulfill the parameters
//mentioned above. It uses i % x == 0 in order to check if the number is
//divisble by x with no remainder. If the number is not divisible by 3 or 5,
//The program simply prints out its number value. The for loop is counting
//number by number from 1 to 100, while the if/else if/else conditinals
//are checking if the number fulfills the programs requirements.

public class BeepBoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("BeepBoop");}
            else if (i % 3 == 0) {
                System.out.println("Beep");}
            else if (i % 5 == 0) {
                System.out.println("Boop");}
            else {
                System.out.println(i);}
        }
    }
}
