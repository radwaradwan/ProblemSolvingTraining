import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=a;
            for(int j=0;j<n;j++){
                sum=(power(j)*b)+sum;
                // or use sum=((int)Math.pow(2,j)*b)+sum;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
    public static int power(int pow){
        int Acc=1;
        for(int i=0;i<pow;i++)
        {
            Acc*=2;
        }
        return Acc;
    }
}
