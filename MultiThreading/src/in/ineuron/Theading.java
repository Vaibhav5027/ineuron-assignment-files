package in.ineuron;

import java.util.ArrayList;
import java.util.List;

class EvenThread implements Runnable {

	@Override
	public void run() {
		List<Integer> list =new ArrayList<>();
		System.out.println("Even thred executing");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0)
				list.add(i);
				
		}
		System.out.println("even number between 1 to 10 are ::" + list);

	}

}

class OddThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Odd thred executing");
  List<Integer> list =new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0)
				list.add(i);
		}
		System.out.println("odd number between 1 to 10 are ::" + list);

	}

}

public class Theading {

	public static void main(String[] args) {
		EvenThread et = new EvenThread();
		Thread t1 = new Thread(et);
		t1.start();
		
//		if you want to execute first even number then un
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
		OddThread ot =new OddThread();
		Thread t2=new Thread(ot);
		t2.start();
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
