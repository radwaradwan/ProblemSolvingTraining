import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d =scan.nextDouble();
        scan.nextLine(); // consume new line
        String s = scan.nextLine();
        
        /*if i want to read string using nextLine Method after nesxtInt 
            you should call nextLine to consume new line
        */
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
