import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a radius
    System.out.print("Enter a number for radius: ");
    double radius = input.nextDouble();


    //Does not allow negative values
    if(radius<0){
      System.out.println("Radius should be positive. Please Try Again.");

    }
    else

    // Validate input
    if (radius <= 0) {
      System.out.println("Radius must be greater than 0.");
      System.exit(0); // End program
    }

    // Compute area
    double area = radius * radius * 3.14159;

    // Display result
    System.out.println("The area for the circle of radius " +
      radius + " is " + area);
  }
}
