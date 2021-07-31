package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 9.How to search the specific element in a given Singly Linked List in java
 * Singly Linked List : 10 -> 20 -> 30 -> 40 -> 50
			  Element : 10  Output : Found
			  Element : 150 Output : Not Found
 */
public class SinglyLinkedListSearchElement {

	// 1. Create the SLL.
	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;

		}

		public static void display(ListNode head) {

			ListNode current = head;

			while (current != null) {

				System.out.print(current.data + "->");

				current = current.next;
			}
			System.out.println(current);
		}

		public static void search(int element, ListNode head) {

			int search = element;
			ListNode current = head;
			
			boolean isFound = false;

			while (current != null) {

				if (current.data == search) {
					isFound = true;
				}
				current = current.next;
			}

			if (isFound == true) {
				System.out.println(search+" Found");
			} else {
				System.out.println(search+" NOT Found");
			}

		}

	}

	public static void main(String[] args) {

		// 2. Load the data.
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourt = new ListNode(40);
		ListNode fifth = new ListNode(50);

		// 3. Make the connection between the NODE
		head.next = second;
		second.next = third;
		third.next = fourt;
		fourt.next = fifth;

		// 4. Display the SLL
		ListNode.display(head);
		
		//int element = 150;
		int element = 10;
		// 5. Search the specific Element form SLL
		ListNode.search(element, head);

	}

}
