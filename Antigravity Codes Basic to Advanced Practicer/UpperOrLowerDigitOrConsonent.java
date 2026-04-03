import java.util.*;

public class UpperOrLowerDigitOrConsonent {
    public static void main(String[] args) {
        int special = 0, lower = 0, digit = 0, upper = 0;
        Scanner sc = new Scanner(System.in);

        try {
            String str = sc.next();

            for (int ch = 0; ch < str.length(); ch++) {
                if (str.charAt(ch) >= 'a' && str.charAt(ch) <= 'z') {
                    lower++;
                } else if (str.charAt(ch) >= '0' && str.charAt(ch) <= '9') {
                    digit++;
                } else if (str.charAt(ch) >= 'A' && str.charAt(ch) <= 'Z') {
                    upper++;
                } else {
                    special++;
                }
            }

            System.out.println("Upper: " + upper);
            System.out.println("Digit: " + digit);
            System.out.println("Lower: " + lower);
            System.out.println("Special: " + special);

        } catch (InputMismatchException e) {
            System.out.println("Invalid");
        }
    }
}