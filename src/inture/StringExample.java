package inture;

public class StringExample {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		System.out.println("s1 == s2 is "+(s1==s2));
		System.out.println("s1 == s2 is "+s1.equals(s2));
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println("s3 == s4 is "+(s3==s4));
		System.out.println("s3 == s4 is "+s3.equals(s4));
		String s5="Hel"+"lo";
		String s6="He"+"llo";
		System.out.println("s5 == s6 is "+(s5==s6));
		System.out.println("s5 == s6 is "+s5.equals(s6));
		String s="lo";
		String s7="Hel"+s;
		String s8="He"+"llo";
		System.out.println("s7 == s8 is "+(s7==s8));
		System.out.println("s7 == s8 is "+s7.equals(s8));
		System.out.println("s7 == s8 is "+s8.equals(s7));
		
		Integer[][] ints={{1,2,3},{null},{7,8,9}};
		System.out.println("values of "+ints[1][1].intValue());
		

	}

}
