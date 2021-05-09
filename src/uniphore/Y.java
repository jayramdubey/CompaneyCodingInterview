package uniphore;

class X {

	int count = 10;

	void print() {
		System.out.println("From class x");
	}
}

public class Y extends X {

	int count = 20;

	void print() {
		System.out.println("From class Y");
	}

	public static void main(String[] args) {

		X a = new Y();
		a.print();

	}

}
