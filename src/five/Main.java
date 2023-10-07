package five;

import java.util.*;

class Market{
	int fruitNo;
	ArrayList<String> fruits;
	Market(int fruitNo){
		this.fruitNo = fruitNo;
		this.fruits = new ArrayList<>(fruitNo);
	}
	
	public synchronized boolean isFull() {
		return fruits.size() == fruitNo;
	}
	public synchronized boolean isEmpty() {
		return fruits.isEmpty();
	}
	public synchronized void farmer(String fruit) {
		if(isFull()) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		fruits.add(fruit);
		notifyAll();
	}
	public synchronized String consumer() {
		if(isEmpty()) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		String consumed = fruits.remove(0);
		notifyAll();
		return consumed;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Market m = new Market(5);
		Thread farmerthread = new Thread(new Runnable()
				{
					public void run() {
						for(int i=1; i<=10; i++) {
							String f = "Fruit " + i;
							m.farmer(f);
							System.out.println("Added "+ f);
						}
					}
				});
		Thread consumerthread = new Thread(new Runnable() {
			public void run() {
				for(int i=1; i<=10; i++) {
					String c = m.consumer();
					System.out.println("Consumed "+ c);
					
				}
			}
		});
		farmerthread.start();
		consumerthread.start();
	}

}
