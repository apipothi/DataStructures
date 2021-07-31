package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 11.How to delete Last Node from a given Singly Linked List in Java
 * OUTPUT    :
 * 			   Before Deleting the First Node
			   10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
			   After Deleting the First Node
			   10 -> 20 -> 30 -> 40 -> 50 -> null
 */
public class SinglyLinkedListDeleteLastElement {

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

		public static void delete(ListNode node) {

			ListNode head = node;
			ListNode beforehead = null;

			while (head.next != null) {

				beforehead = head;
				head = head.next;
			}
			// 10->20->30->40->50->60->null
			//System.out.println(beforehead.data);// 50
			//System.out.println(head.data);// 60
			beforehead.next = null;/*
									 * if the Referance of the current node in
									 * NULL that is called LAST NODE
									 */
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

		// 3. Make a Connection between the NODE
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;

		System.out.println("Beofore Delete the LAST NODE");
		// 4. Display the SLL
		ListNode.display(head);

		// 5. Delete the LAST NODE
		ListNode.delete(head);

		System.out.println("After Delete the LAST NODE");
		// 6. Display the SLL
		ListNode.display(head);
	}
}
