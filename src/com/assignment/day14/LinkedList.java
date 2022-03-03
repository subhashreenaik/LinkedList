package com.assignment.day14;

public class LinkedList {
	/**
	 * Simple Linked List Implementation
	 * Assigning value to the nodes 
	 * 
	 */
	public static void main(String[] args) {
		
	  
		
		Node head=new Node(70);
		Node second=new Node(30);
		Node third=new Node(56);
		
		head.next=second;
		second.next=third;
		third.next=null;
		
		System.out.println(head.data+" "+second.data+" "+third.data);
	}
}
