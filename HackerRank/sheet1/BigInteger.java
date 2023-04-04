import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a= input.nextLine();
        String b= input.nextLine();
        // bigInteger takes a string as argument
        BigInteger bi1 = new BigInteger(a);
        BigInteger bi2 = new BigInteger(b);
        BigInteger c=bi1.add(bi2);
        BigInteger d=bi1.multiply(bi2);
        System.out.println(c);
        System.out.println(d);
         
        
    }
}
