
import java.util.*;

public class PrintReverse {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the No Till you want to Reverse");
    
    try{
int n=sc.nextInt();
for(int i=n;i>=1;i--){

    System.out.println(i);
}


    }
    catch(Exception e){
e.printStackTrace();
    }
}
}
