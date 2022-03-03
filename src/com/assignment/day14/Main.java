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
	* 4.Inserting data between two node
	* 5.Searching key element
	* 6.Deleting element of the list
	
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
	
	/*
	 * 4.Inserting data between two node
	 * */
	
	list.insert(list.head,30);

	/*
	 * 5.Searching element of the list
	 * 
	 * */
	list.search(list.head, 70);
	System.out.println("The element is present   "+list.search(list.head, 70));
	
	
	//Inserting 40 after 30
	list.insert(list.head.next.next,40);
	
	/*
	 * 6.Deleting element of the list
	 * 
	 * */
	list.delete(40);
	
	/*
	 * 7. Removing the first nodefrom the linkedList
	 */
	
	list.printLinkedList(list.removeFirstNode(list.head));
	
	/*
	 * 8 .Sorting element of the list
	 * 
	 * */
	list.sortList();
	
	System.out.println();
	list.printLinkedList(list.head);
	
	
	

	}
}
