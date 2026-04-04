
import java.util.*;


public class ProductOfDigits {

    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int product=1;


    System.out.println("Enter the No");
   

    try{
        int n=sc.nextInt();
       while(n>0){
        int digit=n%10;
        product=product*digit;
        n=n/10;

       }
       System.out.println(product);

    }
    catch(Exception e){
        e.printStackTrace();


    }

}
}
