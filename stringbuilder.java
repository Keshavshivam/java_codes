import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // // char at index 0
        // System.out.println(sb.charAt(0));

        // // set charAt at imdex 0
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // sb.insert(2,'N');
        // System.out.println(sb);

        // sb.delete(2, 3);
        // System.out.println(sb);
        sb.append("S"); //str= str+"S";
        sb.append("t"); //str= str+"t";
        sb.append("a"); //str= str+"a";
        sb.append("r"); //str= str+"r";
        sb.append("k"); //str= str+"k";
        System.out.println(sb.length());



    }
    
}
