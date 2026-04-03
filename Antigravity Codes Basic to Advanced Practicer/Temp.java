import java.util.Scanner;
import java.util.InputMismatchException;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        try {
            int n = sc.nextInt();
            if (n < 25) {
                System.out.println("Cold");
            } else {
                System.out.println("Hot");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please enter a whole number.");
        }
    }
}