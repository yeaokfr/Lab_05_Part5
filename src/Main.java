import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Enter your first integer.");
        if (scan.hasNextInt()) {
            n1 = scan.nextInt();
            System.out.println("Enter in your second integer");
        }
        else
            System.out.println("Invalid input.");
        if (scan.hasNextInt()) {
            n2 = scan.nextInt();
            if (n1 > n2) {
                System.out.println(n1 + " is greater than " + n2);
            }
            else if (n2 > n1) {
                System.out.println(n2 + " is greater than " + n1);
            }
            else if (n2 == n1) {
                System.out.println(n1 + " is equal to " + n2);
            }
        }
        else
            System.out.println("Invalid input.");
    }
}