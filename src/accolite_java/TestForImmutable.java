package accolite_java;

public class TestForImmutable {
	
	 public static void main(String arg[]){
			ImmutableClassExample obj=new ImmutableClassExample("jay", 26);
			System.out.println(obj.getName());
			System.out.println(obj.getAge());
		//	System.out.println(obj.getClass());
		}

}
