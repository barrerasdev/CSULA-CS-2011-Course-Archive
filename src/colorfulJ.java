import java.util.Scanner;
public class javaPlayground {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Say something: ");
//String s1 = input.next();
String s1 = input.nextLine();
//String s2 = input.next();
String s2 = input.nextLine();
System.out.println(s1);
//System.out.println(s2);
System.out.println(s2.length());
}
}
