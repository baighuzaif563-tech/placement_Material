import java.util.*;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;

        System.out.println("Enter the range");
      try{

        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
      if(i%2==0){
        System.out.println(i);
        count++;
      }
        }
      }
      catch(Exception e){
        e.printStackTrace();
      }
      System.out.println("The  No of even no are"+" "+count);
    }
}
