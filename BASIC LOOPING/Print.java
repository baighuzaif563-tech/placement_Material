// print Numbers
import java.util.*;
public class Print{
    public static void main(String[] args) {
        
    
Scanner sc=new Scanner(System.in);

try{
int n=sc.nextInt();
System.out.println("Enter the no");
for(int i=0;i<=n;i++){
    System.out.println(i);
}
}
catch(Exception e){
    e.printStackTrace();

}


}
}