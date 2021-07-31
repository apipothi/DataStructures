package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-SinglyLinkedList
 * JAVA      : 1.8
 * Program   : 4.How to find the length of the Singly Linked List in java.
 * */

public class SinglyLinkedListLength {

	// 1. Create the SLL.
	private static class LinkedNode {

		private int data;
		private LinkedNode next;

		public LinkedNode(int data) {

			this.data = data;
			this.next = null;

		}

		public static void display(LinkedNode head) {

			LinkedNode current = head;

			if (current != null) {

				while (current != null) {

					System.out.print(current.data + "->");
					current = current.next;
				}
				System.out.println(current);
			}

		}

		public static void length(LinkedNode head) {

			LinkedNode current = head;
			int countr = 0;

			if (current != null) {

				while (current != null) {

					current = current.next;
					countr++;
				}

				System.out.println("Length of SLL->" + countr);
			}

		}

	}

	public static void main(String[] args) {

		// 2. Load the DATA
		LinkedNode head = new LinkedNode(10);
		LinkedNode second = new LinkedNode(20);
		LinkedNode third = new LinkedNode(30);
		LinkedNode fourth = new LinkedNode(40);
		LinkedNode fifth = new LinkedNode(50);

		// 3. Link the NODE
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		// 4. Display the Created SLL
		LinkedNode.display(head);

		// 5. Get the Length of SLL
		LinkedNode.length(head);
	}
}
