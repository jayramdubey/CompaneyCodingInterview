package accolite_java;

public class SingltonExample {

	private static SingltonExample single_instance = null;
	public Object str;
	private SingltonExample() {
	}

	public static SingltonExample getInstance() {

		if (single_instance == null) {
			single_instance = new SingltonExample();
		}
		return single_instance;

	}
}
