package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 10.How to delete first node from a given Singly Linked List in Java
 * OUTPUT    :
 * 			   Before Deleting the First Node
			   10 -> 20 -> 30 -> 40 -> 50 -> 60 -> null
			   After Deleting the First Node
			   20 -> 30 -> 40 -> 50 -> 60 -> null
 */
public class SinglyLinkedListDeleteFirstElement {

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

	/*	public static ListNode delete(ListNode head) {

			// 10->20->30->40->50->60->null

			ListNode current = head;
			// System.out.println(current.data);//10
			current = current.next;
			// System.out.println(current.data);//20
			return current;
		}*/

		/*Use below API to make HEAD as NULL so Memory will not be occupied from OLD HEAD*/
		public static ListNode delete(ListNode node) {

			ListNode current = node;
			/*Start- Initializing HEAD as NULL*/
			ListNode tmp = current;
			tmp = null;
			/*END- Initializing HEAD as NULL*/
			current = current.next;

			return current;
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

		// 3. Connect the NODE
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		
		System.out.println("Before Deleting the HEAD");
		// 4. Display the SLL
		ListNode.display(head);
	
		// 5. Delete the NODE (HEAD)
		ListNode newHead = ListNode.delete(head);
		
		System.out.println("After Deleting the HEAD");
		// 6. Display the SLL
		ListNode.display(newHead);
	
	}
}
