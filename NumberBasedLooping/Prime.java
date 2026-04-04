import java.util.*;


public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    Boolean flag=true;
        try{
  int n=sc.nextInt();
  if(n<=1){
    System.out.println("It is Not A Prime Number");
  }
  if(n>=2){
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            flag=false;
            break;
        }
    }
        if(flag){
            System.out.println("It is a Prime No");
        }
        else{
            System.out.println("It is Not A prime No");
        }
    
  }


        }

        catch(Exception e){
e.printStackTrace();
        }
    }
}
