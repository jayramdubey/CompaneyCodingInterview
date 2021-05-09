package synechron;

public class EqualMathEq {

	public static void main(String[] args) {
		String s1="ram";
		String s2="ram";
		String s3=new String("ram");
		String s4=new String("ram");
		String s5=s3;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s3==s4);
		System.out.println(s3==s5);
		System.out.println(s3.equals(s4));
		

	}

}
