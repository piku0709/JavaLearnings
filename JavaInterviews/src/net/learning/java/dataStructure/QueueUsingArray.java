package net.learning.java.dataStructure;

public class QueueUsingArray {
	
	private int front = 0; //used to dequeue
	private int rear = 0; //used to enqueue
	private int total = 0;//total elements in queue
	private int size = 10;//capacity of queue
	private int[] queue = new int[10];
	
	private boolean isFull() {
		return (size == total);
	}
	
	private boolean isEmpty() {
		return (total == 0);
	}
	
	private void enqueue(int item) {
		if(!isFull()) {
			queue[rear] = item;
			rear++;
			total++;
		}
	}
	
	private int dequeue() {
		if(!isEmpty()) {
			int item = queue[front];
			total--;
			front++;
			return item;
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		QueueUsingArray customQueue = new QueueUsingArray();
		
		customQueue.enqueue(1);
		customQueue.enqueue(2);
		customQueue.enqueue(3);
		customQueue.enqueue(4);
		customQueue.enqueue(5);
		
		System.out.println("Items out of the queue: ");
		System.out.println(customQueue.dequeue());
		System.out.println(customQueue.dequeue());
		System.out.println(customQueue.dequeue());
		System.out.println(customQueue.dequeue());
		System.out.println(customQueue.dequeue());
	}

}
