
import java.util.*;
public class fibbonaci {
   
    public static void main(String[] args) {
        int a=0, b=1, c , n;
         Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        n =sc.nextInt();
        System.out.print(a +" " + b+" ");
          for(int i=2 ;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
          }
    }
  }
