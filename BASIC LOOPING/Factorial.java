import java.util.*;

public class Factorial {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int fact=1;
    

    try{
int n=sc.nextInt();
for(int i=1;i<=n;i++){
fact=fact*i;

}
System.out.println("The factorial of the No is "+fact);



    }
    catch(Exception e){
        e.printStackTrace();


    }
   } 
}
