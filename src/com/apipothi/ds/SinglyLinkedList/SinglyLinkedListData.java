package com.apipothi.ds.SinglyLinkedList;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : DS-JAVA-SLL
 * JAVA      : 1.8
 * Program   : 2.How to create the Singly Linked List in Java.
 * */

public class SinglyLinkedListData {

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;

		}

	}

	public static void main(String[] args) {

		ListNode head = new ListNode(10);/* First node is also called as HEAD */
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

	}
}
