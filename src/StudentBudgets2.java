import java.util.Scanner;

public class StudentBudgets2 {
    private static final int MAX_ENTRIES = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] itemNames = new String[MAX_ENTRIES];
        float[] itemValues = new float[MAX_ENTRIES];
        int entryCount = 0;


        System.out.println("Welcome to Budget Builder! To log an income, enter a positive value. To log an expense, enter a negative value. When you are finished, simply enter \"0\"");
        // Loop to allow the user to enter income or expense
        do {
            System.out.print("Enter an Income or an Expense: ");
            float value = scanner.nextFloat();

            // Check if the user wants to exit or has reached MAX_ENTRIES
            if (value == 0 || entryCount == MAX_ENTRIES) {
                break;
            }
            //Gets value of income/expense
            itemValues[entryCount] = value;
            scanner.nextLine();

            // Ask for name of an income/expense
            if (value != 0 && value > 0) {
                System.out.print("Enter the name of the Income: ");
                itemNames[entryCount] = scanner.nextLine();
            }
            if (value != 0 && value < 0) {
                System.out.print("Enter the name of the Expense: ");
                itemNames[entryCount] = scanner.nextLine();
            }

            entryCount++;
        } while (true);

        // Printing budget, correctly formatted using formatAndPrintLine method
        System.out.println("\nBudget:");
        for (int i = 0; i < entryCount; i++) {
            formatAndPrintLine(itemNames[i], itemValues[i]);
        }

        // Calculating and Printing total using calculateTotal method
        float total = calculateTotal(itemValues, entryCount);
        System.out.printf("Total: $%8.2f%n", total);

        scanner.close();
    }

    // Formatting and Printing so they are lined up correctly
    private static void formatAndPrintLine(String itemName, float itemValue) {
      if (itemValue < 0) {
         System.out.printf("%-12s $(%7.2f)%n", itemName, -itemValue);
     } else {
         System.out.printf("%-12s $%8.2f%n", itemName, itemValue);
     }
 }

    // Calculating Total
    private static float calculateTotal(float[] values, int count) {
        float total = 0;
        for (int i = 0; i < count; i++) {
            total += values[i];
        }
        return total;
    }
}
