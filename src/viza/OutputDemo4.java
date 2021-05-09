package viza;

public class OutputDemo4 {

	public OutputDemo4() {
		super();
		//this(10);
	}

	public OutputDemo4(int data) {
		this.data = data;
	}

	public void display() {
		class Decrementer {
			public void decrement() {
				data--;
			}
		}
		Decrementer d = new Decrementer();
		d.decrement();
		System.out.println("data = " + data);

	}

	private int data;

	public static void main(String[] args) {
		int data = 0;
		OutputDemo4 t = new OutputDemo4();
		t.display();
		System.out.println("data = " + data);

	}

}
