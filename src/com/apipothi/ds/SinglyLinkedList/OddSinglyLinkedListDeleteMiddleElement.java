package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 13.How to delete the middle Node of given ODD Singly Linked List in java.
 * OUTPUT    :
 * 			   Before Deleting the First Node
			   	18=>28=>38=>48=>58=>68=>78=>null
			   After Deleting the Middle Node
			   	18=>28=>38=>58=>68=>78=>null
Recommendation : 6.How to Print the Middle element of a ODD Singly Linked List in JAVA.
 */
public class OddSinglyLinkedListDeleteMiddleElement {

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

				System.out.print(current.data + "=>");
				current = current.next;
			}
			System.out.println(current);
		}

		public static int size(ListNode head) {

			ListNode current = head;
			int counter = 0;

			while (current != null) {

				current = current.next;
				counter = counter + 1;
			}

			return counter;
		}

		public static void delete(ListNode head, int index) {

			ListNode previous = head;
			int position = index;
			int counter = 1;

			while (counter < position - 1) {
				previous = previous.next;
				counter++;
			}

			// System.out.println(previous.data);// 38
			ListNode currrent = previous.next;
			// System.out.println(currrent.data);// 48
			// System.out.println(currrent.next.data);// 58
			previous.next = currrent.next;
			currrent.next = null;
		}

	}

	public static void main(String[] args) {

		// 2. Load the DATA
		ListNode head = new ListNode(18);
		ListNode second = new ListNode(28);
		ListNode third = new ListNode(38);
		ListNode fourth = new ListNode(48);
		ListNode fifth = new ListNode(58);
		ListNode sixth = new ListNode(68);
		ListNode seventh = new ListNode(78);

		// 3. Make a connection of NODE
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;

		System.out.println("Before Deleting the Milddle Element form SLL");
		// 4. Display the SLL
		ListNode.display(head);

		// 5. Get the Size of SLL
		int size = ListNode.size(head);
		System.out.println("Size of SLL -> " + size);

		// 6. Identify the Middle NODE
		int index = 0;

		if (size % 2 != 0) {

			index = (size / 2) + 1;

		}
		// 7. Delete the Middle NODE
		ListNode.delete(head, index);

		System.out.println("After Deleting the Milddle Element form SLL");
		// 8. Display the SLL
		ListNode.display(head);
	}

}
