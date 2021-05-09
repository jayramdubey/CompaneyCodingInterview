package uniphore;

class Employee {
	
	  String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee() {

	}
}

public class A {

	private int x;

	public static void main(String[] args) throws CloneNotSupportedException {
		int x = 10;

			    Employee emp;

			    A a = new A();

			    Employee e = new Employee();

			    e.setName("Jayaram");

/*			    a.setEmp(e);

			    a.setEmp(e);*/

			    A a1 = (A)a.clone();

			    a.x = 20;

			    e.setName("Dubey");

			  //  a1.x;


	}

}
