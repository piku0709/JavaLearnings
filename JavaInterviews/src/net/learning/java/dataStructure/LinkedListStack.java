package net.learning.java.dataStructure;

public class LinkedListStack {
	Node head;
	
	private class Node {
		Node next;
		int value;
	}
	
	public LinkedListStack() {
		head = null;
	}
	
	//add value to the beginning of the list to  demonstrate functionality of stack
	public void push(int value) {
		Node oldHead = head;
		head =  new Node();
		head.value = value;
		head.next = oldHead;
	}
	
	//remove value from the beginning of the linked list to demonstrate functionality of stack 
	public int pop() throws LinkedListEmptyException {
		if(head == null) {
			throw new LinkedListEmptyException("Linked List Stack is empty !");
		} else {
			int value = head.value;
			head = head.next;
			return value;
		}
	}
	
	class LinkedListEmptyException extends RuntimeException {
		
		private static final long serialVersionUID = 1L;

		public LinkedListEmptyException() {
			super();
		}
		
		public LinkedListEmptyException(String message) {
			super(message);
		}
	}
	
	private void printLinkedListStack(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}		
	}
	
	public static void main(String[] args) {
		LinkedListStack llStack = new LinkedListStack();
		llStack.push(50);
		llStack.push(10);
		llStack.push(20);
		llStack.push(60);
		llStack.push(40);
		llStack.push(70);
		llStack.push(80);
		System.out.println("Element removed from the list: "+ llStack.pop());
		System.out.println("Element removed from the list: "+ llStack.pop());
		System.out.println("Element removed from the list: "+ llStack.pop());
		llStack.push(75);
		llStack.push(55);
		System.out.println("Element removed from the list: "+ llStack.pop());
		llStack.printLinkedListStack(llStack.head);
	}

}
