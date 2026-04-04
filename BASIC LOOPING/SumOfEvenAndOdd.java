
import java.util.*;
public class SumOfEvenAndOdd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0;
        int odd=0;
        try{
int n=sc.nextInt();
for(int i=0;i<=n;i++){
    if(i%2==0){

        even=even+i;
    }
    else{

        odd=odd+i;
    }
    
}
System.out.println("The sum of Even is "+" "+even+"The sum of Odd is "+" "+odd);


        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
