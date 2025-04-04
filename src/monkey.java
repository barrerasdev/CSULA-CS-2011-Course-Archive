
public class monkey {
    public static void main(String[] args) {
        int monkeyNumber = 0;
        boolean hamlet = false;
        for (char h = 'a'; h <= 'z'; h++) {
            for (char a = 'a'; a <= 'z'; a++) {
                for (char m = 'a'; m <= 'z'; m++) {
                    for (char l = 'a'; l <= 'z'; l++) {
                        for (char e = 'a'; e <= 'z'; e++) {
                            for (char t = 'a'; t <= 'z'; t++) {
                                String word = "" + h + a + m + l + e + t;
                                monkeyNumber++;
                                if (word.equals("hamlet")) {
                                    System.out.println("Combination: " + word);
                                    System.out.println("Combination Number: " + monkeyNumber);
                                    hamlet = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
