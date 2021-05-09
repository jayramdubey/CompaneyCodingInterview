package accolite_java;

public class SingltonDerivelass {
	
	public static void main(String arg[]){
		//intatiating of singlton class of variable X
		SingltonExample x=SingltonExample.getInstance();
		
		//intatiating of singlton class of variable Y
		SingltonExample y=SingltonExample.getInstance();
		
		//intatiating of singlton class of variable Z
		SingltonExample z= SingltonExample.getInstance();
		
		//changing the variables of instantiat 
		x.str=((String) x.str).toUpperCase();
		System.out.println("String from x is: "+x.str);
		System.out.println("String from x is: "+y.str);
		System.out.println("String from x is: "+z.str);
		
		//changing the variable of instance z
		
		z.str=((String) z.str).toLowerCase();
		System.out.println("String from x is: "+x.str);
		System.out.println("String from x is: "+y.str);
		System.out.println("String from x is: "+z.str);
		
		
	}

}
