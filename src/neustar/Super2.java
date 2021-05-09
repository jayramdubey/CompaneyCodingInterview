package neustar;

class Super2 {
	public int i = 0;

	public Super2(String text) {
		i = 1;
	}
}
 class Sub extends Super2{
	public Sub(String text){
		super("Hello");
		i=2;
	}
	public static void main(String arg[]){
		Sub sub = new Sub("Hello");
		System.out.println(sub.i);
	}
}
