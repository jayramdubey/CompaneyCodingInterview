package neustar;

public class OutputShow implements Runnable{

	Integer id =1;
	public static void main(String[] args) {
		new Thread(new OutputShow()).start();
		new Thread(new OutputShow()).start();
		new Thread(new OutputShow()).start();
		
	}
	@Override
	public void run() {
		press(id);
	}
	synchronized void press(Integer id2) {
		 System.out.print(id.intValue());
		 System.out.print((++id).intValue());
	}

}
