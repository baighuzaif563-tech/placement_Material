import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No");
        
        int digit;
        int sum=0;
        int n=sc.nextInt();
        int temp=n;
        try{
while(temp!=0){
    
    
      digit=temp%10;
      sum=sum+digit*digit*digit;
      temp=temp/10;

        }
        if(sum==temp){
            System.out.println("It is a Armsotong No");
        }
        else{
            System.out.println("It is not a Armstong No");
        }

    }

   


        catch(Exception e){
            e.printStackTrace();
        }
    }
}
