package accolite_java;

public final class ImmutableClassExample {
	final String name;
	final int age;
	

	public ImmutableClassExample(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

