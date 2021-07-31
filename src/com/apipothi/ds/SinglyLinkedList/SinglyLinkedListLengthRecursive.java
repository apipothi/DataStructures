package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-SinglyLinkedList
 * JAVA      : 1.8
 * Program   : 5.How to find the length of the Singly Linked List in JAVA , Recursive way.
 * */

public class SinglyLinkedListLengthRecursive {

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

		public static int length(ListNode head) {

			ListNode current = head;

			if (current == null) {

				return 0;

			} else {
				// Length should be one or grater then one
				// But should not be less then one
				return 1 + length(current.next);
			}

		}

	}

	public static void main(String[] args) {

		// 2. Load the data in to SLL.
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);

		// 3. Link the NODE of SLL.
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		// 4. Display the SLL.
		ListNode.display(head);

		// 5. To get the Lenght of SLL
		int length=ListNode.length(head);
		System.out.println("Length of SLL is ->"+length);

	}

}
