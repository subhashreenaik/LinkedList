package com.assignment.day14;

public class LinkedList {
	/**
	* add - this method is created to add data to linkedList
	* append - this method is created to append data to linkedList
	* printLinkedList -This method is created to print the list data
	* @param data - accepting data to put it in linkedList
	*/
	
	Node head;
	public void add(int data) {
		Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
	}
	
	public void append(int new_data)
    {
        
        Node new_node = new Node(new_data);
        if (head == null)
        {
            head = new Node(new_data);
        }
        
        
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }
	
	public void printLinkedList(){
		if (head == null) {
		System.out.println("LinkedList is empty");
		} else {
		Node pointer = head;
		while (pointer != null) {
		System.out.print(pointer.data + " ");
		pointer = pointer.next;
		}
		}
		}
}
