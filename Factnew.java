import java.util.*;
class Fact {
public static void main(String args[]) throws Exception{ 
      Scanner  n=new Scanner(System.in);
      int s,i,f=1;
      System.out.println("Enter the number");
      s=n.nextInt();
 
       if(s>1) {
         
         for(i=1;i<=s;i++) {
                 
          f=f*i;
          }
               System.out.print("Factorial for "+s+" is "+f);
           }
           else
              System.out.print(0);
          
  }
}
