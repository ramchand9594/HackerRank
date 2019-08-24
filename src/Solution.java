import java.util.*;
import java.io.*;
import java.lang.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String result[] = new String[t];
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            StringBuilder res = new StringBuilder();
            int temp = 0;
            for(int j = 0; j < n; j++) {
            	if(j == 0) 
            		temp = a;
            	temp = (int) (temp + ((Math.pow(2,j)*b)));
                res.append(temp);
                if(j != n-1) {
                	res.append(" ");
                }
            }
            result[i] = res.toString();
        }
        for(int i=0;i<t;i++) {
        	System.out.println(result[i]);
        }
        in.close();
    }
}

