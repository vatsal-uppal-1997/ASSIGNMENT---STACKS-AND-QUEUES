package com.MyStack;
class Node <type> {
	type data;
	Node<type> next;
	Node(type data, Node<type> next) {
		this.data = data;
		this.next = next;
	}
}

public class Stack <type> {

	Node<type> head;

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
