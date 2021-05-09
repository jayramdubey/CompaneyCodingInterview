package com.persistent;

public class FindTheBalanceBtree {

	public static void main(String[] args) {

		FindTheBalanceBtree tree = new FindTheBalanceBtree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left = new Node(8);

		if (tree.isBalanced(root))
			System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");

	}

	private boolean isBalanced(Node node) {

		int lh; // height of left subtree
		int rh; // height of right subtree
		if (node == null) {
			return true;
		}
		lh = height(node.left);
		rh = height(node.right);

		if (Math.abs(lh - rh) <= 1 && isBalanced(node.left) && isBalanced(node.right))
			return true;

		return false;
	}

	private int height(Node node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(height(node.left), height(node.right));
		}

	}

}
