import java.io.*;
public class Rev {
       public static void main(String args[]) throws Exception {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          int n=Integer.parseInt(br.readLine());
          int a=0,i=0;
    String rev="";
          while(n>0){
                a=n%10;
                n=n/10;
              rev=rev+a;
                i++;
            }
             System.out.println(rev);
         }
  }
