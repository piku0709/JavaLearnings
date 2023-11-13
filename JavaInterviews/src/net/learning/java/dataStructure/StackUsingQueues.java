package net.learning.java.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
	
	Queue<Integer> firstQueue;
	Queue<Integer> secondQueue;
	
	public StackUsingQueues() {
		firstQueue = new LinkedList<Integer>();
		secondQueue = new LinkedList<Integer>();
	}
	
	private void push(int value) {
		if(firstQueue.isEmpty()) {
			firstQueue.add(value);
		} else {
			//copy elements of queue 1 to queue 2
			//add new element to queue 1
			//copy elements from queue 2 to queue 1
			int sizeOfFirstQueue = firstQueue.size();
			
			//copy elements from queue 1 to queue 2
			for(int j = 0;  j < sizeOfFirstQueue; j++) 
				secondQueue.add(firstQueue.remove());
			
			//add new element to queue 1
			firstQueue.add(value);
			
			//copy elements in queue 2 back to queue 1
			for(int k = 0; k < sizeOfFirstQueue; k++)
				firstQueue.add(secondQueue.remove());
		}
		
	}

	//pop elemnst from queue 1
	private int pop() {
		if(firstQueue.isEmpty())
			throw new EmptyQueueException("Queue underflow");
		return firstQueue.remove();
	}
	
	class EmptyQueueException extends RuntimeException {
		 
		public EmptyQueueException() {
			super();
		}
		
		public EmptyQueueException(String message) {
			super(message);
		}
	}
	
	public static void main(String[] args) {
		StackUsingQueues stack = new StackUsingQueues();
		stack.push(10);
		stack.push(80);
		stack.push(60);
		stack.push(70);
		stack.push(20);
		stack.push(40);
		stack.push(50);
		stack.push(30);
		System.out.println("Removed elenent: "+stack.pop());
		System.out.println("Removed element: "+stack.pop());
		stack.push(110);
		stack.push(55);
		System.out.println("Removed element: "+stack.pop());
		
		
		
	}
}
