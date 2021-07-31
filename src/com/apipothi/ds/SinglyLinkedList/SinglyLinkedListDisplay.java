package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 3.How to print the element of Singly Linked List in java.
 * */

public class SinglyLinkedListDisplay {

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

				System.out.print(current.data + "->");
				current = current.next;// move forward

			}
			System.out.println(current);

		}

	}

	// 2. Load the data in SLL

	public static void main(String[] args) {

		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);

		// 3. Make the connection in NODE.
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		// 4. Display the SLL

		ListNode.display(head);

	}
}
