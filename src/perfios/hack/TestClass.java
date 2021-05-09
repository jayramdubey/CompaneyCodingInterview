package perfios.hack;

import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String inp[] = br.readLine().split(" ");
            long S = Long.parseLong(inp[0]);
            long X = Long.parseLong(inp[1]);

            int out_ = getMonthNumber(X, S);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static int getMonthNumber(long X, long S){
    	        long val = X/S;
    	        int result = 0;
    	        if(val>S){
    	            long tmp=val%S;
    	            result = (int) tmp;
    	        }else{
    	         result = (int) val;
    	        }
    	        
    	        int fnlResult=0;
    	        if(result>12){
    	            return  fnlResult=result%12;
    	           }else 
    	           return result;
    	           // Write your code here
    	       
    	       }
    	}