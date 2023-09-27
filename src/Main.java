import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthMonth;

        System.out.println("Please enter your birth month: ");

        if (scan.hasNextInt()) {
            birthMonth = scan.nextInt();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You've entered an invalid number: " + birthMonth);
            }
        }
    }
}