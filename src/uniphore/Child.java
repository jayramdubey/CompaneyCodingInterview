package uniphore;

class Parent {
	public void print(Object obj) {
		System.out.println("Object");
	}

	public void print(String obj) {
		System.out.println("String");
	}

//	public void print(StringBuilder obj) {
//		System.out.println("StringBuffer");
//	}
}

public class Child extends Parent {

	public static void main(String[] args) {

		Parent t1 = new Child();

		t1.print(null);

	}

}
