import com.MyStack.Stack;

class QueueUsingStacks <type> {

	private Stack<type> st1;
	private Stack<type> st2;
	
	QueueUsingStacks() {
		this.st1 = new Stack<type>();
		this.st2 = new Stack<type>();
	}

	void add(type data) {
		st1.add(data);
	}

	type pop() {
		while (this.st1.peek() != null)
			this.st2.add(this.st1.pop());
		type data = this.st2.pop();
		while (this.st2.peek() != null)
			this.st1.add(this.st2.pop());
		return data;
	}

	type peek() {
		while (this.st1.peek() != null)
			this.st2.add(this.st1.pop());
		type data = this.st2.peek();
		while (this.st2.peek() != null)
			this.st1.add(this.st2.pop());
		return data;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(st1.toString());
		return ((sb.reverse()).trim()).toString();
	}

}

public class Main {

	public static void main(String args[]) {
		
		QueueUsingStacks <Integer> qus = new QueueUsingStacks<>();
		for (int i=0; i<11; i++)
			qus.add(i);
		System.out.println("Queue : "+qus);
		System.out.println("Popping all elements");
		for (int i=0; i<11; i++)
			System.out.println("["+qus.pop()+"] popped !");
		System.out.println("Queue is empty. Peek ? "+qus.peek());
		System.out.println("Adding 9 to the Queue....");
		qus.add(9);
		System.out.println("Peek Queue : "+qus.peek());
		qus.pop();
		if (qus.peek() == null) 
			System.out.println("The queue is empty afer popping 9 !");
	}
}
