package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 12.How to delete the node from a Singly Linked List at a given position in Java.
 * INPUT     : 
 * 			   SLL   -> 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
 * 			   INDEX -> 4		
 * OUTPUT    :
 * 			   After Deleting the First Node
			   10 -> 20 -> 30 -> 50 -> 60 -> null
 */
public class SinglyLinkedListDeletePositionElement {

	// 1. Create the SLL
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

				System.out.print(current.data + " -> ");
				current = current.next;
			}
			System.out.println(current);

		}

		public static void delete(ListNode head, int position) {

			ListNode previous = head;
			int index = position;
			System.out.println("Index t to delete -> "+index);
			int counter = 1;

			while (counter < index - 1) {
				previous = previous.next;
				counter++;
			}

			ListNode current = previous.next;

			previous.next = current.next;

			current.next = null;

		}
	}

	public static void main(String[] args) {

		// 2. Load the Data
		ListNode head = new ListNode(10);
		ListNode first = new ListNode(20);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(40);
		ListNode fourth = new ListNode(50);
		ListNode fifth = new ListNode(60);

		// 3.Make a Connection
		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("Before Deleting the NODE");
		// 4.Display the SLL
		ListNode.display(head);

		// 5.Delete the NODE/Element form the given Index
		int index = 4;
		ListNode.delete(head, index);

		System.out.println("After Deleting the NODE");
		// 6.Display the SLL
		ListNode.display(head);
	}
}
