package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 1. How to represent a Singly Linked List in Java?
 * */

public class SinglyLinkedList {

	/* This is Inner class which represent the SLL */
	private static class ListNode {

		/*
		 * It has two private member 1. Data i.e data 2. Address of the next
		 * node i.e next
		 */
		private int data;
		private ListNode next;

		/*
		 * It has once public constructor which is responsable to initialized
		 * the node/data and the adress of the next node. Since by default the
		 * address of the next node is NULL
		 */
		public ListNode(int data) {
			this.data = data;
			this.next = null;

		}

	}

	public static void main(String[] args) {
		
		ListNode node =new ListNode(10);
		
	}
}
