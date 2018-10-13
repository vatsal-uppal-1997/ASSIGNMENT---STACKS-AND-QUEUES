class Node <type> {
	type data;
	Node<type> next;
	Node(type data, Node<type> next) {
		this.data = data;
		this.next = next;
	}
}

class Stack <type> {

	private Node<type> head;

	public void add(type data) {
		
		this.head = new Node<type>(data, this.head);
	
	}

	public type pop() {
		
		if (this.head != null) {
			type data = this.head.data;
			this.head = this.head.next;
			return data;
		} else {
			return null;
		}

	}

	public type peek() {
	
		if (this.head != null)
			return this.head.data;
		else 
			return null;

	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		Node<type> temp = this.head;

		while (temp != null) {
			if (temp != null) {
				sb.append(temp.data).append(" ");
				temp = temp.next;
			}
		}

		return sb.toString();

	}

}

class Queue <type> {

	private Node<type> head;
	private Node<type> tail;
	private Node<type> prev;

	public Queue() {
		this.head = null;
		this.tail = null;
	}

	public void add(type data) {
		
		Node<type> temp = new Node<>(data, null);
		if (head == null)
			this.head = temp;
		else
			this.tail.next = temp;
		this.tail = temp; 

	}

	public type pop() {
		
		if (this.head != null) {
			
			type data = this.head.data;

			if (this.tail == this.head) {
				this.head = null;
				this.tail = null;
			} else {
				this.head = this.head.next;
			}
			
			return data;

		} 
	
		return null;

	}
	
	public type peek() {

		if (this.head != null) {

			return this.head.data;

		}

		return null;
	
	}

	public String toString() {
	
		StringBuilder sb = new StringBuilder();
		Node<type> temp = this.head;

		while (temp != null) {

			if (temp != null) {
	
				sb.append(temp.data).append(' ');
				temp = temp.next;

			}

		}

		return sb.toString();

	}
}

public class Main {

	public static void main(String []args) {

		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new Queue<>();

		for (int i=0; i<7; i++) {

			stack.add(i);
			queue.add(i);

		}

		System.out.println("Stack : " + stack);
		System.out.println("Queue : " + queue);

		// pop all

		for (int i=0; i<7; i++) {

			stack.pop();
			queue.pop();
	
		}

		System.out.println("Stack Popped All : " + stack);
		System.out.println("Queue Popped All : " + queue);
		
		// Add one element

		stack.add(9);
		queue.add(10);
		System.out.println("Stack was empty added 9 to stack and 10 to Queue");
		System.out.println("Stack peek() : " + stack.peek());
		System.out.println("Queue peek() : " + queue.peek());

		// Pop one

		System.out.println("Stack popped() : " + stack.pop());
		System.out.println("Queue popped() : " + queue.pop());

		if (stack.peek() == null && queue.peek() == null)
			System.out.println("Stack and Queue are both empty !");

	}

}
