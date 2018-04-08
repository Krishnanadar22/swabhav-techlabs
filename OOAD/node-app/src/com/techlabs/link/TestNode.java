package com.techlabs.link;

public class TestNode {
	public static void main(String agrs[]) {
		Node<Integer> node1 = new Node<Integer>(5);
		Node<Integer> node2 = new Node<Integer>(15);
		Node<Integer> node3 = new Node<Integer>(20);

		node1.setNext(node2);
		node2.setNext(node3);

		printDetails(node1);
	}

	public static <T> void printDetails(Node<T> node) {
		while (node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
}
