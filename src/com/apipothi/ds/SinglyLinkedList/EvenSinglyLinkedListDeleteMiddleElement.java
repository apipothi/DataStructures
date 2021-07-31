package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 14.How to delete the middle Node/Element of given Even Singly Linked List in java.
 * OUTPUT    :
	 * 			Size of Linked List is =>6
				Before deleting the node Linked List is 
					18=>28=>38=>48=>58=>68=>null
				After deleting the node Linked List is 
					18=>28=>58=>68=>null
Recommendation :7.How to Print the Middle element of a EVEN Singly Linked List in JAVA.

 */
public class EvenSinglyLinkedListDeleteMiddleElement {

	// 1. Create the SLL

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {

			this.data = data;
			this.next = null;
		}

		public static void display(ListNode head) {

			ListNode curent = head;

			while (curent != null) {

				System.out.print(curent.data + "=>");
				curent = curent.next;

			}
			System.out.println(curent);

		}

		public static int size(ListNode head) {

			ListNode current = head;
			int conter = 0;

			while (current != null) {

				current = current.next;
				conter++;
			}

			return conter;
		}

		public static void delete(ListNode head, int index) {
			ListNode previous = head;
			int position = index;
			int counter = 1;

			while (counter < position - 1) {

				previous = previous.next;
				counter++;
			}
			ListNode current = previous.next;// 38
			previous.next = current.next;
			current.next = null;

		}

	}

	public static void main(String[] args) {

		// 2. Load the DATA in to SLL
		ListNode head = new ListNode(18);
		ListNode second = new ListNode(28);
		ListNode third = new ListNode(38);
		ListNode fourth = new ListNode(48);
		ListNode fifth = new ListNode(58);
		ListNode sixth = new ListNode(68);

		// 3. Link the NODE
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		System.out.println("Before Deleting the Middle Node form SLL");
		// 4. Display the SLL.
		ListNode.display(head);

		// 5. Get the Size.
		int size = ListNode.size(head);
		System.out.println("Size of SLL is -> " + size);

		// 6. Identify the SLL is Even
		if (size % 2 == 0) {
			// 7. Get the middle Index SLL
			int index = size / 2;

			// 8. Delete the Middle NODE
			for (int i = 1; i <= 2; i++) {

				ListNode.delete(head, index);
			}
		}

		System.out.println("After Deleting the Middle Node form SLL");
		// 9. Display the SLL.
		ListNode.display(head);
	}

}
