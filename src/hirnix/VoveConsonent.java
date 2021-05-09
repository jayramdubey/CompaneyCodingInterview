package hirnix;

import java.util.Scanner;

public class VoveConsonent {
			
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String str=sc.nextLine();
			String s2=str.toLowerCase();
			
			char[] schar=s2.toCharArray();
			int size=schar.length;
			int m=0, n=0,p=0;
			char[] res=new char[size];
			
			for(int i=0;i<size;i++){
				if(schar[i]>='a'&& schar[i]<='z')
				{
					res[p]=schar[i];p++;
				}
				
			}
			
			int len=res.length-1;
			char []vol=new char[size];
			char []con=new char[size];
			char []result=new char[size];
		for(int i=0;i<=len;i++){
			if(res[i]=='a' || res[i]=='e'||res[i]=='i'||res[i]=='o'||res[i]=='u')
				{
				    vol[m]=res[i];m++;
				   // System.out.print(vol[i]);
				  
			    }
				else
				{	
					con[n]=res[i];n++;
					//System.out.print(con[i]);
				}
			   }
		/*for(int i=0;i<len;i++){
			System.out.print(vol[i]);
		}
		for(int i=0;i<len;i++){
			System.out.print(con[i]);*/
		int i = 0, j = 0, k = 0;
		 while (i<size && j <size)
		    {
		  if(vol[i]!=0 && con[i]!=0)
		    {
		        result[k++] = vol[i++];
		        //result[k++] = con[j++];
		        //result[k++] = con[j++];
		        
		     }
		    }
		for(i=0;i<=len;i++)
		{
			/*if(vol[i]!=0){
				result[i]=vol[i];*/
				System.out.print(result[i]+" ");
			
			
		    }
			

		}

	}
