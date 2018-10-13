package com.MyStack;
class Node <type> {
	type data;
	Node<type> next;
	Node(type data, Node<type> next) {
		this.data = data;
		this.next = next;
	}
}

public class Queue <type> {

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

