package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-SinglyLinkedList
 * JAVA      : 1.8
 * Program   : 4.How to find the length of the Singly Linked List in java.
 * */

public class SinglyLinkedListInsert {

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
				current = current.next;// move forward

			}
			System.out.println(current);

		}

		public static void length(ListNode head) {

			ListNode current = head;
			int count = 0;
			while (current != null) {
				count++;
				current = current.next;
			}
			System.out.println("Length-> " + count);

		}

		public static ListNode insert(int i, ListNode head) {

			int userHead = i;
			ListNode nodeHead = head;

			ListNode newHead = new ListNode(userHead);

			head = newHead;

			return newHead.next = nodeHead;

		}

		 public ListNode head = null;  
		 public ListNode tail = null;  
		    
		public void addAtStart(int data) {
			// Create a new node
			ListNode newNode = new ListNode(data);

			// Checks if the list is empty
			if (head == null) {
				// If list is empty, both head and tail will point to new node
				head = newNode;
				tail = newNode;
			} else {
				// Node temp will point to head
				ListNode temp = head;
				// newNode will become new head of the list
				head = newNode;
				// Node temp(previous head) will be added after new head
				head.next = temp;
			}
		}

	}

	// 2. Load the data in SLL
	public static void main(String[] args) {

		ListNode head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);

		// 3. Make the connection in NODE.
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		// 4. Display the SLL
		ListNode.display(head);

		// 5. Get the Length
		ListNode.length(head);

		// 6. Insert the Node before HEAD
		ListNode newHead = ListNode.insert(1, head);

		System.out.println("After Creating the New NODE");

		// 4. Display the SLL
		ListNode.display(newHead);

		// 5. Get the Length
		ListNode.length(newHead);

	}
}
