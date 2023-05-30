package in.ineuron;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Producer implements Runnable {
	public static final int maxSize = 4;
	public static final List<Integer> list = new ArrayList<>();

	@Override
	public void run() {
		while (true) {
			try {
				produce();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

	public synchronized void produce() throws InterruptedException {
		while (list.size() == maxSize) {
//		  if queue is full then need to wait till the same space created 
			wait();

		}
		Random rand = new Random();
		for (int i = 0; i < maxSize; i++) {
			list.add(rand.nextInt(1000));
		}
//	  used for sent insrtuction to consumer some data is added
		notify();
	}

	public synchronized List<Integer> consume() throws InterruptedException {
		notify();
		while (list.size() == 0 || list.isEmpty()) {
			wait();
		}
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<>();
		for (Integer integer : list) {
			System.out.println(integer);
			list2.add(integer);
		}
//		for (Integer integer : list) {
//			System.out.println(integer);
//			list.remove(integer);
//		}
		list.clear();
		System.out.println(list2);
		return list2;
	}
}

class Consumer implements Runnable {
	private Producer producer;

	public Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		while (true) {
			try {
				List<Integer> consume = producer.consume();
				System.out.println(consume.toString());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class ProducerConsumer {

	public static void main(String[] args) {
		Producer producer = new Producer();
		Thread produceThread = new Thread(producer);
		produceThread.start();
		Consumer consumer=new Consumer(producer);
		Thread consumerThread=new Thread(consumer);
		consumerThread.start();
	}

}
