import java.util.*;

public class SumOfFibo {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int a=0;
    int b=1;
    int c;
    int sum=0;
    try{
        int n=sc.nextInt();
    if(n==0){
        System.out.println(0);
    }
    if(n==1){
        System.out.println(1);
    }
    if(n>=2){

System.out.println("The first Term is "+a+" "+"The second Term is "+" "+b );
        
        for(int i=2;i<=n;i++){
            c=a+b;
          sum=sum+c;
            
            a=b;
            b=c;
            
        }
        
        System.out.println("The sum of the Fibonacci is"+" "+(sum+1));
    }
    }

    catch(Exception e){
        e.printStackTrace();
    }
}
}
