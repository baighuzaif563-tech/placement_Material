import java.util.*;
public class FiboUptoN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          try{

            int n=sc.nextInt();
            int a=0;
            int b=1;
            int c;
            System.out.println("The FiboNacci of The Terms are");
            if(n<1){
                System.out.println(a);
            }
                    if (n==1) {
                        System.out.println("The Fibo of the terms is "+a+" "+b);
                    }
if(n>=2){

    System.out.println(a);
    System.out.println(b);
    for(int i=2;i<=n;i++){


        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
    }
    
}
          }
          catch(Exception e){
            e.printStackTrace();
          }
    }
    }

