package com.apipothi.ds.SinglyLinkedList;

import java.util.ArrayList;
import java.util.List;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 8.How to Print the Middle element of a Singly Linked List[Even/ODD] in JAVA.
 * */
public class SinglyLinkedListMiddleElement {

	// 1.Create the SLL
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

		public static void getMiddleElement(ListNode head, Integer index) {

			ListNode current = head;
			Integer userIndex = index;
			int counter = 0;

			if (head == null) {
				counter = 0;
			} else {
				counter = 1;

				while (current != null) {
					counter++;
					current = current.next;

					if (userIndex == counter) {
						System.out.println("Middle Element-> " + current.data + " at Index " + userIndex);
					}
				}
			}
		}

	}

	public static void main(String[] args) {

		// 2. Load the DATA
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);
		ListNode sixth = new ListNode(60);

		// 3. Nonnect the NODE
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;/* Comment this Line if you need ODD SLL */

		// 4. Display the SLL
		ListNode.display(head);

		// 5. Get the Length of SLL
		int length = ListNode.length(head);
		System.out.println("Length-> " + length);

		List<Integer> midElement = new ArrayList<Integer>();

		// 6. Identify the SLL is ODD or EVEN
		// 7. Get the Index value for Either Even or ODD SLL
		if (length % 2 == 0) {

			System.out.println("Given SLL is Even");

			midElement.add(length / 2);
			midElement.add((length / 2) + 1);

		} else {
			System.out.println("Given SLL is ODD");
			midElement.add((length / 2) + 1);
		}

		// 8. Get the middle value with respect to the index value.

		for (Integer index : midElement) {

			ListNode.getMiddleElement(head, index);
		}

	}
}
