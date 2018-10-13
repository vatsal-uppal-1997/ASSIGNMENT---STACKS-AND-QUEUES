import com.MyStack.Queue;

class StackUsingQueues<type> {

	private Queue<type> q1;
	private Queue<type> q2;

	StackUsingQueues() {
	
		this.q1 = new Queue<>(); 
		this.q2 = new Queue<>(); 
		
	}

	void add(type data) {
		
		this.q1.add(data);
		type tempDat; 
		while ((tempDat=this.q2.pop()) != null) 
			this.q1.add(tempDat);
		Queue<type> temp = this.q1;
		this.q1 = this.q2;
		this.q2 = temp; 

	}

	type pop() {
		return this.q2.pop();
	}

	type peek() {
		return this.q2.peek();
	}

	public String toString() {
		return this.q2.toString();
	}

}

public class Main {
	public static void main(String args[]) {
		
		StackUsingQueues <Integer> suq = new StackUsingQueues<>();
		for (int i=0; i<11; i++)
			suq.add(i);
		System.out.println("Stack : "+suq);
		System.out.println("Popping all elements");
		for (int i=0; i<11; i++)
			System.out.println("["+suq.pop()+"] popped !");
		System.out.println("Stack is empty. Peek ? "+suq.peek());
		System.out.println("Adding 9 to the Stack....");
		suq.add(9);
		System.out.println("Peek Stack : "+suq.peek());
		suq.pop();
		if (suq.peek() == null) 
			System.out.println("The Stack is empty afer popping 9 !");
	}
}
