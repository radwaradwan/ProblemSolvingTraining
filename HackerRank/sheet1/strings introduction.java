import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum =A.length()+B.length();
        System.out.println(sum);
        int a=A.charAt(0);
        int b=B.charAt(0);
        if(a>b)
            System.out.println("Yes");
        else
            System.out.println("No");
        String s1=A.substring(1);
        String s2=B.substring(1);
        System.out.println(A.substring(0,1).toUpperCase().concat(s1)
        +" "+B.substring(0,1).toUpperCase().concat(s2));
        
    }
}



