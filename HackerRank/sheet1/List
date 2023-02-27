import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        List list=new ArrayList();
        for(int i=0;i<n;i++){
            list.add(input.nextInt());
        }
        int q=input.nextInt();
        for(int i=0;i<q;i++){
            String query = input.next();
            if(query.equals("Insert")){
                int x=input.nextInt();
                int y=input.nextInt();
                list.add(x,y);
            }
            else if(query.equals("Delete")){
                int x=input.nextInt();
                list.remove(x);
            }
        }
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
