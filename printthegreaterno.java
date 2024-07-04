import java.util.*;
public class printthegreaterno {
    public static int getgreater(int a , int b){
        if(a>b){
        return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        int a = sc. nextInt();
        int b = sc. nextInt();
        System.out.println(getgreater(a,b));
    }
}
