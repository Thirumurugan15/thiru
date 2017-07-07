import java.util.*;
class Fact {
public static void main(String args[]) throws Exception{ 
      Scanner  n=new Scanner(System.in);
      int s,i,f=1;
      System.out.println("Enter the number");
      s=n.nextInt();
 
     
         for(i=1;i<=s;i++) {
                 
          f=f*i;
          }
               System.out.print("Factorial for "+s+" is "+f);
           
          
  }
}
