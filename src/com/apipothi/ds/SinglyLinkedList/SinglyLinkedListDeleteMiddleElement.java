package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 15.How to delete the middle of given Singly Linked List in java.
 * OUTPUT    :
 * -------
 * ODD SLL
 * -------
 * 			 *Size of Linked List is =>7
			 *Before deleting the node Linked List is 
			 *18=>28=>38=>48=>58=>68=>78=>null
			 *After deleting the node Linked List is 
			 *18=>28=>38=>58=>68=>78=>null
 * --------
 * EVEN SLL
 * --------	
			 * Size of Linked List is =>8
			 * Before deleting the node Linked List is 
			 * 18=>28=>38=>48=>58=>68=>78=>88=>null
			 * After deleting the node Linked List is 
			 * 18=>28=>38=>68=>78=>88=>null
 */
public class SinglyLinkedListDeleteMiddleElement {

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

		public static int length(ListNode head) {

			ListNode current = head;
			int counter = 0;
			while (current != null) {

				current = current.next;
				counter++;
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

			ListNode current = previous.next;
			previous.next = current.next;
			current.next = null;
		}

	}

	public static void main(String[] args) {

		// 2. Load the Data in to SLL
		ListNode head = new ListNode(18);
		ListNode second = new ListNode(28);
		ListNode third = new ListNode(38);
		ListNode fourth = new ListNode(48);
		ListNode fifth = new ListNode(58);
		ListNode sixth = new ListNode(68);
		ListNode seventh = new ListNode(78);
		ListNode eight = new ListNode(88);

		// 3. Make a Connection between NODE
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		/* Uncomment this line of code to make SLL is EVEN */
		//seventh.next=eight;

		System.out.println("Before Deleting the Middle Element from SLL");
		// 4. Display the SLL
		ListNode.display(head);

		// 5. Find the Length of the SLL
		int lenght = ListNode.length(head);
		System.out.println("Length of SLL is ->" + lenght);

		// 6. Check SLL is EVEN or ODD
		if (lenght % 2 == 0) {
			// 7. Find the Middle INDEX
			System.out.println("SLL is EVEN");
			int index = lenght / 2;

			for (int i = 1; i <= 2; i++) {
				// 8. Delete the NODE from the SLL at given INDEX
				ListNode.delete(head, index);
			}
			System.gc();

		} else {
			System.out.println("SLL is ODD");
			// 7. Find the Middle INDEX
			int index = (lenght / 2) + 1;
			// 8. Delete the NODE from the SLL at given INDEX
			ListNode.delete(head, index);
			System.gc();
		}

		System.out.println("After Deleting the Middle Element from SLL");
		// 9. Display the SLL
		ListNode.display(head);
	}

}
