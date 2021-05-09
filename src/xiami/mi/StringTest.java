package xiami.mi;

public class StringTest {

	public static void main(String[] args) {
		String s1 = null;
		String s2 = "";
		String s3 = "null";
		System.out.println("lenth of s2: " + s2.length() + "\nlenth of s3: " + s3.length());
		
		try {
			System.out.println(s1.toString()+" ");
		}
		finally{
			System.out.println("finally");
		}
	}
}
