package mycompny_interview;

public class Reverse_without_Array {
	
	void reverse()
	 {
		int res=0,n=735924;
		int tmp,div;
		while(n>0)
		 {
		   div=n%100;
			  while(div>0)
			    {
				   tmp=div%10;
				   res=res*10+tmp;
				   div=div/10;
			    }
			n=n/100;
		 }
		
		  System.out.println(res);  
	   }
	

	public static void main(String[] args) {
		Reverse_without_Array ob=new Reverse_without_Array();
		ob.reverse();
	}

}
