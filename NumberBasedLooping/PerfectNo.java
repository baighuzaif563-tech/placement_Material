import java.util.*;

public class PerfectNo {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
      int sum=0;
      int temp;

    try{

        int n=sc.nextInt();
        temp=n;
        for(int i=1;i<=n/2;i++){  // important condition for the perfect square only  Run till the n/2 times 

            if(n%i==0){

                sum=sum+i;
            }
        }
        if(sum==temp){
System.out.println("It is a Perfect Square");
        }
else{
    System.out.println("It is not a Perfect Square");
}

    }
    catch(Exception e){
        e.printStackTrace();

    }
}
}