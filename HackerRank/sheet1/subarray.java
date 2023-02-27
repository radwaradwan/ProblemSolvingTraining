import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int count=0;
        for(int j=0;j<n;j++)
        {
            int sum=0;
            for(int i=j;i<n;i++){
                sum+=arr[i];
                if(sum<0)
                    count++;

            }
        }
        System.out.println(count);
    }
}
