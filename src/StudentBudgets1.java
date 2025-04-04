public class StudentBudgets1 {                            //This program creates a budget using formatting and floats.
    public static void main(String[] args) {              //It prints our floats in a budget-style format, where negative
                                                          //values are in parentheses. We use two methods, one is our main
                                                          //method, which uses a function we declared in our second method.
        float myFloat1 = 5.22f;
        float myFloat2 = -10.01f;
        float myFloat3 = 0.05f;
        float myFloat4 = -1.01f;
        float myFloat5 = 7.42f;                           //The code below will declare the values of our floats
        float myFloat6 = -10.50f;
        float myFloat7 = 5000.10f;
        float myFloat8 = -2010.20f;

        formatFloats(myFloat1);
        formatFloats(myFloat2);
        formatFloats(myFloat3);                           //The code below uses the function we will declare in the second method.
        formatFloats(myFloat4);                           //formatFloats distinguishes between positive and negative values
        formatFloats(myFloat5);                           //and prints them here.
        formatFloats(myFloat6);
        formatFloats(myFloat7);
        formatFloats(myFloat8);

    }

    public static void formatFloats(float amount) {       //In this new method, we will be using an if statement to format the
                                                          //floats according to positive or negative


        if (amount < 0) {                                 //if amount is less than 0, format to 9 places and 2 decimal points
            System.out.printf("$ (%9.2f)%n", -amount);}   //%n prints as new line and -amount makes the float negative.


         else {                                           //else, the value is positive or 0, simply format to 10 places and
            System.out.printf("$ %10.2f%n", amount);}     //2 decimal points. The %n also prints a new line here.
                                                          //We use 10 places over 9 to account for the additional "-" character
                                                          //missing, this will line up our decimal points accordingly.

    }
}
