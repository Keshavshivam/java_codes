// import java.util.*;
// public class functions2 {
//     public static int calculateproduct(int a , int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();

//         System.out.println();
//     }
// }

import java.util.*;
public class functions2{
    public static int calculateproduct(int a , int b){
    int product = a*b;
    return product;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int product= calculateproduct(a,b);
        System.out.println(product);
    }

}