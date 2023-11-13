package net.learning.java.dataStructure;


//Implement stack using array
public class StackCustom {
	
	private int size = 0;
	private int top = -1;
	private int[] array;
	
	public StackCustom(int size) {
		this.size = size;
		this.top = -1;
		this.array = new int[size];
	}
	
	private boolean isEmpty() {
		return (top == -1);
	}
	
	private boolean isFull() {
		return (top == size -1);
	}
	
	private int pop() {
		if(!isEmpty()) {
			int element = array[top];
			top--;
			System.out.println("Popped element: "+element);
			return element;
		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	} 
	
	private void push(int element) {
		if(!isFull()) {
			top++;
			array[top] = element;
			System.out.println("Pushed element: "+element);
		} else {
			System.out.println("Stack is full !");
		}
	}
	
	private int peek() {
		if(!isEmpty()) {
			return array[top];
		} else {
			System.out.println("Statck is empty !");
			return -1;
		}		
	}
	
	private void printStack(StackCustom stack) {
		if(stack.getTop() != -1) {
			for(int i=0; i<=stack.getTop(); i++) {
				System.out.println(stack.getArray()[i]);
			}
		}
	}
	
	private StackCustom sortStack(StackCustom stack) {
		StackCustom sortedStack = new StackCustom(stack.getSize());
		
		while(!stack.isEmpty()) {
			int currentElement = stack.pop();
			while(!sortedStack.isEmpty() && sortedStack.peek() > currentElement ) {
				stack.push(sortedStack.pop());
			}
			sortedStack.push(currentElement);
		}
		return sortedStack;
	}
	
	public static void main(String[] args) {
		StackCustom stack = new StackCustom(10);
		System.out.println("=====================");
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(50);
		stack.push(40);
		stack.push(60);
		System.out.println("=====================");
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("=====================");
		/*// to test stack sorting
		System.out.println("Stack before sort: ");
		stack.printStack(stack);
		StackCustom sortedStack = stack.sortStack(stack);
		System.out.println("=====================");
		System.out.println("Stack after sort: ");
		sortedStack.printStack(sortedStack);*/
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

}
