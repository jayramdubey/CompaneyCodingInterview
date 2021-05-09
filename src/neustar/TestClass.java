package neustar;

public class TestClass {

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		obj.m1(null);
		

	}
	public  void m1(String str){
		System.out.println(" String m1");
	}
	public  void m1(Object str){
		System.out.println(" Object m1");
	}

}
