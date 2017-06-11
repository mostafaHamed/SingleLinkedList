package com.task;

public class Node<Integer> {
	
	Node next;
	int data;
	
	public Node(Node next, int data) {
		super();
		this.next = next;
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}

}
