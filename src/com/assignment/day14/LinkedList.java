package com.assignment.day14;

public class LinkedList {
	/**
	* add - this method is created to add data to linkedList
	* append - this method is created to append data to linkedList
	* printLinkedList -This method is created to print the list data
	* insert -This method is inserting data between two node
	* removeFirstNode-this method delete the first node of the linked list
	* search- this method search the key element
	* delete -This method deleting the key element
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
	
	
	public void insert(Node node, int new_data)
	{
	
		if (node == null) {
			System.out.println("The given  node cannot be null");
			return;
		}

		Node new_node = new Node(new_data);

			new_node.next = node.next;
		    node.next = new_node;
	}

	
	public void printLinkedList(Node head){
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
	
	public Node  removeFirstNode(Node head)
    {
		 if (head == null)
	            return null;
        Node temp = head;
        return head = head.next;
 
    }
	
	 public boolean search(Node head, int x)
	    {
	        Node current = head;    
	        while (current != null)
	        {
	            if (current.data == x)
	                return true;    
	            current = current.next;
	        }
	        return false;    
	    }
	 void delete(int key)
	    {
	      
	        Node temp = head, prev = null;
	        if (temp != null && temp.data == key) {
	            head = temp.next; 
	            return;
	        }   
	        while (temp != null && temp.data != key) {
	            prev = temp;
	            temp = temp.next;
	        }
	        if (temp == null)
	            return;
	        prev.next = temp.next;
	    }
	 
	    
	 
}
