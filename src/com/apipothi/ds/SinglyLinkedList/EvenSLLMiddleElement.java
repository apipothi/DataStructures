package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 7.How to Print the Middle element of a EVEN Singly Linked List in JAVA.
 * */
public class EvenSLLMiddleElement {

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

		public static void getMiddleElement(ListNode head, int firstMiddleIndex) {

			ListNode current = head;
			int index = firstMiddleIndex;
			int counter = 0;

			if (head == null) {
				counter = 0;
			} else {
				counter = 1;

				while (current != null) {

					counter++;
					current = current.next;
					if (counter == index) {
						System.out.println("Middle Element-" + current.data + " at index " + index);
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		// 2. Load the DATA in to SLL
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);
		ListNode sixth = new ListNode(60);

		// 3. DO the Connection of NODE
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;

		// 4. Display the SLL
		ListNode.display(head);

		// 5. Get the Length of SLL
		int length = ListNode.length(head);
		System.out.println("Length of SLL is -> " + length);

		// 6. Identify whether SLL is EVEN or not

		if (length % 2 == 0) {
			System.out.println("SLL is EVEN");

			// 7. Get the Middle Index value
			int firstMiddleIndex = (length / 2);
			int secondMiddleIndex = (length / 2) + 1;

			System.out.println("First Middle index -> " + firstMiddleIndex);
			System.out.println("second Middle index -> " + secondMiddleIndex);

			// 8. get the Middle Element with respect to Middle Index value
			ListNode.getMiddleElement(head, firstMiddleIndex);
			ListNode.getMiddleElement(head, secondMiddleIndex);

		} else {
			System.out.println("SLL is ODD");
		}

	}

}
