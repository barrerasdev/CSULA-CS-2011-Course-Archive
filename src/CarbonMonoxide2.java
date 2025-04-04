
class CarbonMonoxide2 {
//  codes
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
    System.out.println(ANSI_RESET+"Carbon Monoxide Concentrations Across LA County 1/21/2021");

//Azusa
    System.out.print(ANSI_RESET+"           Azusa"+ANSI_RED_BKGRND);
    for (int i=0; i<0.6*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.6");

//Glendora
    System.out.print(ANSI_RESET+"        Glendora"+ANSI_YELLOW_BKGRND);
    for (int i=0; i<0.4*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.4");

//WestLA
    System.out.print(ANSI_RESET+"West Los Angeles"+ANSI_GREEN_BKGRND);
    for (int i=0; i<0.6*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.6");

//LA
    System.out.print(ANSI_RESET+"     Los Angeles"+ANSI_BLUE_BKGRND);
    for (int i=0; i<0.7*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.7");

//Reseda
    System.out.print(ANSI_RESET+"          Reseda"+ANSI_CYAN_BKGRND);
    for (int i=0; i<0.7*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.7");

//Compton
    System.out.print(ANSI_RESET+"         Compton"+ANSI_PURPLE_BKGRND);
    for (int i=0; i<0.8*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.8");

//Pico Rivera
    System.out.print(ANSI_RESET+"     Pico Rivera"+ANSI_RED_BKGRND);
    for (int i=0; i<0.7*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.7");

//Pomona
    System.out.print(ANSI_RESET+"          Pomona"+ANSI_YELLOW_BKGRND);
    for (int i=0; i<0.9*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.9");

//Pasadena
    System.out.print(ANSI_RESET+"        Pasadena"+ANSI_GREEN_BKGRND);
    for (int i=0; i<0.7*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.7");

//LAX
    System.out.print(ANSI_RESET+"    LAX Hastings"+ANSI_BLUE_BKGRND);
    for (int i=0; i<0.4*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.4");

//SC
    System.out.print(ANSI_RESET+"   Santa Clarita"+ANSI_CYAN_BKGRND);
    for (int i=0; i<0.4*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.4");

//Lancaster
    System.out.print(ANSI_RESET+"       Lancaster"+ANSI_PURPLE_BKGRND);
    for (int i=0; i<0.7*10; i++) {
      System.out.print(" ");
    }
    System.out.println(ANSI_RESET+"0.7");



    System.out.print(ANSI_RESET);
  }
}
