import java.util.*;
//1 to 100 Prime No or 1 to N prime No
public class PrimeRange {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    try{
   int n=sc.nextInt();
   int count=0;
   boolean flag=true;
if(n<=1){
    System.out.println("Prime no does not Exist ");
}
if(n>=2){
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            flag=false;   // it is not a prime no
            break;
              
        
    }
    if(flag){
        count++;
    }
    
}   

}
System.out.println(count);
    }


    




    

    catch(Exception e){
        e.printStackTrace();
    }
}
}
