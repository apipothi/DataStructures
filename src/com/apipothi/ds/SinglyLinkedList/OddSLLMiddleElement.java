package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 6.How to Print the Middle element of a ODD Singly Linked List in JAVA.
 * */
public class OddSLLMiddleElement {

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
				current = current.next;
			}
			System.out.println(current);
		}

		public static int length(ListNode head) {

			ListNode current = head;
			int counter = 0;

			while (current != null) {
				current = current.next;
				counter++;

			}
			return counter;

		}

		public static void getMiddleElement(ListNode head, int middleIndex) {

			ListNode current = head;
			int midIndex = middleIndex;
			int counter = 0;

			if (head == null) {
				counter = 0;
			} else {
				counter = 1;

				while (current != null) {

					counter++;
					current = current.next;
					if (counter == midIndex) {
						System.out.println("Middle Element->" + current.data + " Middle index->" + midIndex);
					}

				}
			}
		}

	}

	public static void main(String[] args) {

		// 2. Load the Data in to SLL
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);

		// 3. Link the NODE
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		// 4. Display the SLL
		ListNode.display(head);

		// 5. Find the Length of SLL
		int length = ListNode.length(head);
		System.out.println("Lenth of SLL is -> " + length);

		int middleIndex = 0;
		// 6. Identify the SLL is ODD
		if (length % 2 == 0) {

			System.out.println("LL is Even");

		} else {
			System.out.println("LL is Odd");
			// 6.1 to get the middle index
			middleIndex = (length / 2) + 1;
		}

		// 7. FInd the Middle Element
		ListNode.getMiddleElement(head, middleIndex);

	}
}
