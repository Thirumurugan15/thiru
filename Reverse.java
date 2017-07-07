import java.util.*;
class Reverse {
public static void main(String args[]) throws Exception{ 
      Scanner  n=new Scanner(System.in);
      int s,k=1,i;
    
  String a=n.nextLine();
   char aa[]=a.toCharArray();
     char b[]=new char[100];
  
      if(a.length()!=0) {
         for(i=0;k<=a.length();i++) {
                 
           b[i]=aa[a.length()-k]; 
               k++;
               System.out.print(b[i]);
           }
           }
      else {
       
         System.out.println("Enter the valid String "); 
          
      } 
      
}
}
