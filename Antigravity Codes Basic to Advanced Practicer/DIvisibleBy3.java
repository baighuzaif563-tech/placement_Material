
import java.util.Scanner;

public class DIvisibleBy3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0 && n%3==0 ){

            System.out.println("divisible");
        }
        else{
            System.out.println("Not divisible");
        }
    }
    
}
