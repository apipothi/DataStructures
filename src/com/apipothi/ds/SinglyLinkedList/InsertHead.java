package com.apipothi.ds.SinglyLinkedList;

public class InsertHead {

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

		public static ListNode createHead(ListNode sll, int i) {

			ListNode current = sll;
			int data = i;

			ListNode newhead = new ListNode(data);
			newhead.next = current;
			return newhead;

		}

		public static void createTail(ListNode sll, int i) {
			
			ListNode current = sll;
			int data = i;
			//ListNode tail= sll;
			
			ListNode newtail = new ListNode(data);
			newtail.next = null;
			
			current.next=newtail;
			//current.next=newtail;
			current=newtail;
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

		// 5. Insert HEAD
		ListNode newHeadSLL = ListNode.createHead(head, 70);

		// 4. Display the SLL
		ListNode.display(newHeadSLL);

		// 5. Insert HEAD
		ListNode.createTail(head, 90);

		// 4. Display the SLL
		ListNode.display(head);

	}

}
