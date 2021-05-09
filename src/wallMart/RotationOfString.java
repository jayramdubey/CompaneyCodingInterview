package wallMart;

public class RotationOfString {

	public static void main(String[] args) {
       String s1="banana";
       String s2="anaban";
       boolean resul=isRotationOrNot(s1,s2);
       System.out.println("S2 is rotatation os S1: "+resul);
	}

	private static boolean isRotationOrNot(String s1, String s2) {
		
		if((s1+s1).contains(s2)){
			return true;
		}
		return false;
        	
	}

}
