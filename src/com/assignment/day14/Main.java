package com.assignment.day14;

public class Main {

	/**
	* Main method for manipulation linkedList
	*
	*/
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	/*
	* PROCEDURE
	* 1. Creating Lined list
	* 2. Adding nodes to linkedList
	* 3.Appending data to linkedList
	
	*/

	/*
	* 1. Creating Linked list
	*/
	LinkedList list = new LinkedList();

	/*
	* 2. Adding nodes to linkedList
	*/
	list.add(70);
	list.add(30);
	list.add(56);
	
	/*
	* 3. Appending data to linkedList
	*/
	list.append(56);
	list.append(30);
	list.append(70);
	
	list.printLinkedList();
	System.out.println();

	}
}
