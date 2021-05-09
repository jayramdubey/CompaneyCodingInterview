package accolite_java;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCollable implements Callable {
	int num;

	MyCollable(int num) {
		this.num = num;
	}

	public Object call() throws Exception {
		int sum = 0;
		System.out.println(Thread.currentThread().getName() + ".. is responsible to find the sum of the number: " + num);
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}

}

public class MythreadpoolDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCollable [] jobs = {new MyCollable(10),new MyCollable(20),new MyCollable(30),
				              new MyCollable(40),new MyCollable(50),new MyCollable(60)};
		ExecutorService serviceObj= Executors.newFixedThreadPool(3);
		
		for(MyCollable job:jobs){
		Future f=	serviceObj.submit(job);
		System.out.println(f.get());
		}
	
		serviceObj.shutdown();
	}

}
