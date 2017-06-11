package com.task;

public class SingleLinkedList<Integer> {

	Node head;
	Node tail;
	int size;
	
	public SingleLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	/**
	 * Check if linkedlist is empty
	 * @return
	 */
	public boolean isEmpty(){
		boolean isEmpty = false;
		if (head == null){
			isEmpty = true;
			return isEmpty;
		}
		return isEmpty;
	}
	
	
	/**
	 * Return the size of the linkedlist
	 * @return
	 */
	public int getSize(){
		return this.size;
	}
	
	/**
	 * Append a new node at the end of the linkedlist
	 * @param value
	 */
	public void appendAtEnd(int value){
		Node newNode = new Node(null, value);
		this.size++;
		
		if(head == null){
			head = newNode;
			tail = head;
		}else{
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	
	/**
	 * Append a new node at the start of the linkedlist
	 * @param value
	 */
	public void appendAtStart(int value){
		Node newNode = new Node(null, value);
		this.size++;
		
		if(head == null){
			head = newNode;
			tail = head;
		}else{
			newNode.setNext(head);
			head = newNode;
		}
		
	}
	
	/**
	 * Append node at specific position
	 * @param value
	 * @param position
	 */
	public void appendAtPosition(int value, int position){
		Node newNode = new Node(null, value);
		Node ptr = head;
		position = position - 1;
		
		for(int i=1 ; i<position; i++){
			if(i == position){
				Node tmp = ptr.getNext();
				ptr.setNext(newNode);
				newNode.setNext(tmp);
				break;
			}
			ptr = ptr.getNext();
		}
		this.size++;
	}
	
	/**
	 * Remove the tail element of the linkedlist
	 */
	public void removeTailNode(){
		if(tail == null){
			return;
		}else{
			if(head == tail){
				head = null;
				tail = null;
			}else{
				Node preTail = head;
				while(preTail.getNext() != tail){
					preTail = preTail.getNext();
				}
				tail = preTail;
				tail.setNext(null);
			}
		}
	}
	
	
	/**
	 * Remove all element in the linkedlist that is great than a target value
	 * @param value
	 */
	public void removeNodeGreaterThanSpecificValue(int value){
		if(head == null){
			return;
		}
		Node tmpNode = head;
		Node prevNode = null;
		while(tmpNode != null){
			if(tmpNode.data > value){
				if(tmpNode == head){
					head = head.getNext();
				}else{
					prevNode.setNext(tmpNode.getNext());
				}
			}else{
				prevNode = tmpNode;
			}
			tmpNode = tmpNode.getNext();
		}
	}
	
}
