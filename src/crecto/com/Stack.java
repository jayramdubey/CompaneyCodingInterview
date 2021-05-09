package crecto.com;

public class Stack {

	int top = -1;
	int max = 10;
	int item[] = new int[max];

	void push(int num) {
		if (top == max - 1) {
			System.out.println("Overflow");
			return;
		} else {
			item[++(top)] = num;
		}
	}

	int pop() {
		int num = 0;
		if (top == -1) {
			System.out.println("underflow");

		} else {
			num = item[(top)--];

		}

		return num;

	}

	void print() {
		for (int i = top; i >= 0; i--) {
			System.out.print(" " + item[i]);
		}
	}

	public static void main(String[] args) {

		Stack ob = new Stack();
		ob.push(5);
		ob.push(10);
		ob.push(15);
		ob.print();
		System.out.println();
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		ob.print();

	}

}