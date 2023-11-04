package solution4;

import java.util.ArrayList;
import java.util.List;

public class Bst {
	private TreeNode root;

	public Bst() {
		this.root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public TreeNode addNode(TreeNode root, int key) {
		if (root == null)
			return new TreeNode(key);

		if (key < root.data) {
			root.left = addNode(root.left, key);
		} else {
			root.right = addNode(root.right, key);
		}
		return root;
	}

	public void addNode(int key) {
		this.root = addNode(root, key);
	}

	public void displayPreOrder(TreeNode root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		displayPreOrder(root.left);
		displayPreOrder(root.right);
	}

	public void displayInOrder(TreeNode root) {
		if (root == null)
			return;

		displayInOrder(root.left);
		System.out.print(root.data + " ");
		displayInOrder(root.right);
	}

	public void displayPost(TreeNode root) {
		if (root == null)
			return;

		displayPost(root.left);
		displayPost(root.right);
		System.out.print(root.data + " ");

	}

	public int countLeafNodes(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;

		int c1 = countLeafNodes(root.left);
		int c2 = countLeafNodes(root.right);

		return c1 + c2;
	}

	public int countNonLeafNode(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 0;

		int c1 = countNonLeafNode(root.left);
		int c2 = countNonLeafNode(root.right);

		return c1 + c2 + 1;
	}

	private TreeNode printParentNode(TreeNode parent, TreeNode root, int data) {
		if (root == null)
			return null;
		if (root.data == data)
			return parent;

		TreeNode left = printParentNode(root, root.left, data);
		TreeNode right = printParentNode(root, root.right, data);

		if (left == null)
			return right;
		else
			return left;
	}

	public void printParentNode(int data) {
		TreeNode ans = printParentNode(null, root, data);
		if (ans == null)
			System.out.println("No Parent");
		else
			System.out.println(ans.data);
	}

	private List<Integer> printChildren(TreeNode root, int data) {
		if (root == null)
			return new ArrayList<>();
		if (root.data == data) {
			List<Integer> rootChildren = new ArrayList<>();
			if (root.left != null)
				rootChildren.add(root.left.data);
			if (root.right != null)
				rootChildren.add(root.right.data);
			
			return rootChildren;
		}
		List<Integer> leftchildren = printChildren(root.left, data);
		List<Integer> rightchildren = printChildren(root.right, data);

		List<Integer> rootChildren = new ArrayList<>();

		for (int node : leftchildren) {
			rootChildren.add(node);
		}
		for (int node : rightchildren) {
			rootChildren.add(node);
		}

		return rootChildren;
	}

	public void printChildren(int data) {
		List<Integer> ans=printChildren(root, data);
		
		if(ans.size()==0) {
			System.out.println("No Children");
			return;
		}
		for (int ele :ans) {
			System.out.print(ele + " ");
		}
	}

	public int findLevel(TreeNode root) {
		if (root == null)
			return 0;

		int leftLevel = findLevel(root.left);
		int rightLevel = findLevel(root.right);

		return Math.max(leftLevel, rightLevel) + 1;
	}

	public int findLevel() {
		return findLevel(root);
	}

	public int countNonLeafNodes() {
		return countNonLeafNode(root);
	}

	public int countLeafNodes() {
		return countLeafNodes(root);
	}

	public void display() {
		displayPost(root);
	}

}
