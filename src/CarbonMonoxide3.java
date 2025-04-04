// This Program will replicate our original CarbonMonoxide table using a method
// called barGraph.

// First we declare our ANSI codes.

// Then, in our main method, we print our header.
// We then use a method titled "barGraph".
// This will print Name, bar graph, and value identical to our original table.

// In our method barGraph,
// We format it as ( value (double),  location (string),  color (int)  )

// First, we use a switch statement to assign the bar's color to an integer,
// We will use 6 colors, so there will be 6 cases.
// An example would be Azusa, we use a red code, so we would use "1" for case 1.

// Second, we use a for loop to determine the bar's length.
// We multiply the value plugged into the main method by 10 to get a whole int
// The loop will be ran for value*10 amount of times, each time adding a bar.
// For Example, Azusa = 0.6. 0.6 * 10 = 6. The loop will run 6 times.

// Finally, our location is simply a string, which we did not manipulate.

public class CarbonMonoxide3 {
  static final String ANSI_CLEAR="\u001B[2J";
  static final String ANSI_REPOSITION="\u001B[H";
  static final String ANSI_RESET="\u001B[0m";
  static final String ANSI_BLACK="\u001B[30m";
  static final String ANSI_BLACK_BKGRND="\u001B[40m";
  static final String ANSI_RED="\u001B[31m";
  static final String ANSI_RED_BKGRND="\u001B[41m";
  static final String ANSI_GREEN="\u001B[32m";
  static final String ANSI_GREEN_BKGRND="\u001B[42m";
  static final String ANSI_YELLOW="\u001B[33m";
  static final String ANSI_YELLOW_BKGRND="\u001B[43m";
  static final String ANSI_BLUE="\u001B[34m";
  static final String ANSI_BLUE_BKGRND="\u001B[44m";
  static final String ANSI_PURPLE="\u001B[35m";
  static final String ANSI_PURPLE_BKGRND="\u001B[45m";
  static final String ANSI_CYAN="\u001B[36m";
  static final String ANSI_CYAN_BKGRND="\u001B[46m";
  static final String ANSI_WHITE="\u001B[37m";
  static final String ANSI_WHITE_BKGRND="\u001B[47m";


  public static void main(String[] args) {

    System.out.println(ANSI_CLEAR);
    System.out.println(ANSI_REPOSITION);
    System.out.println(ANSI_RESET + "Carbon Monoxide Concentrations Across LA County 1/21/2021");

    barGraph(0.6, "           Azusa", 1);
    barGraph(0.4, "        Glendora", 2);
    barGraph(0.6, "West Los Angeles", 3);
    barGraph(0.7, "     Los Angeles", 4);
    barGraph(0.7, "          Reseda", 5);
    barGraph(0.8, "         Compton", 6);
    barGraph(0.7, "     Pico Rivera", 1);
    barGraph(0.9, "          Pomona", 2);
    barGraph(0.7, "        Pasadena", 3);
    barGraph(0.4, "    LAX Hastings", 4);
    barGraph(0.4, "   Santa Clarita", 5);
    barGraph(0.7, "       Lancaster", 6);
  }

  public static void barGraph(double value, String location, int color) {

    String colorCode;
    switch (color) {
      case 1:
        colorCode = ANSI_RED_BKGRND;
        break;
      case 2:
        colorCode = ANSI_YELLOW_BKGRND;
        break;
      case 3:
        colorCode = ANSI_GREEN_BKGRND;
        break;
      case 4:
        colorCode = ANSI_BLUE_BKGRND;
        break;
      case 5:
        colorCode = ANSI_CYAN_BKGRND;
        break;
      case 6:
        colorCode = ANSI_PURPLE_BKGRND;
        break;
      default:
        colorCode = ANSI_BLACK_BKGRND;
        break;}
  System.out.print(ANSI_RESET + location + colorCode);

  int barLength = (int) (value * 10);
  for (int i = 0; i < barLength; i++) {
    System.out.print(" ");}
  System.out.println(ANSI_RESET + value);
  }
}
