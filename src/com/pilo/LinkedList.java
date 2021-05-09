package com.pilo;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {

		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public void detectLoop() {
		Node tmp1 = head, tmp2 = head;
		int flag = 0;
		while (tmp1 != null && tmp2 != null && tmp2.next != null) {
			tmp1 = tmp1.next;
			tmp2 = tmp2.next.next;
			if (tmp1 == tmp2) {
				flag = 1;
				System.out.println("Found loop");
				break;
			}
		}
		if (flag == 0) {
			System.out.println("There is no loop");
		}
		int count = 0;
		if (flag == 1) {
			tmp1 = head;
			while (tmp1 != tmp2) {
				count++;
				tmp1 = tmp1.next;
				tmp2 = tmp2.next;
			}
		}
		System.out.println("There is loop in the position " + count);
	}

	public static void main(String args[]) {
		LinkedList llist = new LinkedList();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.push(5);
		llist.push(6);
		llist.head.next.next.next.next.next.next = llist.head.next.next.next;
		llist.detectLoop();
	}
}