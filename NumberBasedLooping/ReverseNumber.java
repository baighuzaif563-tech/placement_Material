import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int rev=0;
int temp;
System.out.println("Enter the No");
        try{
int n=sc.nextInt();
temp=n;


while(n>0){
rev=rev*10+n%10;
n=n/10;
}
System.out.println("The rev of the no is"+rev);


if(rev==temp){
    System.out.println("It is a palindrome No");
}

else{
    System.out.println("It is not a Palindrome no");
}
        }

        catch(Exception e){
e.printStackTrace();
        }
    }
}
