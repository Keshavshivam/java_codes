import java.util.*;
public class sumofoddno {
    public static void printSum(int n) {
        int Sum = 0;

        for(int i=1; i<=n; i++){
            if(i % 2 != 0) {
                Sum= Sum+i;
            }
        }
        System.out.println(Sum);
    }
    public static void main(String[] args) {
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        printSum(n);
    }
}
