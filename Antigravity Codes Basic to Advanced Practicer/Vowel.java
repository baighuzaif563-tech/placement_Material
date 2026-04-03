import java.util.*;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowel = 0;
        int conso = 0;

        try {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowel++;
                System.out.println("It is a vowel.");
            } else {
                conso++;
                System.out.println("It is a consonant.");
            }

            System.out.println("Vowels counted: " + vowel);
            System.out.println("Consonants counted: " + conso);

        } catch (InputMismatchException e) {
            System.out.println("Input invalid Exception");
        }
    }
}