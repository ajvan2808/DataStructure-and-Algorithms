public class binaryTree {
	class Node {
		int key;
		String value;
		Node left, right; // left - right pointers


		public Node(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public Node min() {
			if (left == null) {
				return this;
			}
			else {
				return left.min();		// recursion: keep pointing to the left nodes till it's null
			}
		}
	}

	Node root;

	public binaryTree() {
		root = null;
	}

	// FIND
	public String find(int key) {
		// find Node
		Node node = findNode(root, key);

		// return node value
		return node == null ? null : node.value;
	}

	// find node method
	private Node findNode(Node node, int key) {
		if (node == null || node.key == key) {
			return node;
		}
		else if( key < node.key) {
			// recursion
			return findNode(node.left, key);
		}
		else if( key > node.key) {
			return findNode(node.right, key);
		}

		return null;
	}
	
	// INSERT
	public void insert(int key, String value) {
		root = insertItems(root, key, value);
	}

	private Node insertItems(Node node, int key, String value) {
		// create new Node
		Node newNode = new Node(key, value);

		if(node == null) {
			node = newNode;
			return node;
		}
		else if( key < node.key) {
			return insertItems(node.left, key, value);
		}
		else if( key > node.key) {
			return insertItems(node.right, key, value);
		}

		return node;
	}

	// DELETE
	public void delete(int key) {
		root = deleteNode(root, key);
	}

	public Node findMin(Node node) {
		return node.min();
	}

	private Node deleteNode(Node node, int key) {
		if(node == null) {
			return null;
		}

		else if( key < node.key) {
			return deleteNode(node.left, key);
		}
		else if( key > node.key) {
			return deleteNode(node.right, key);
		}
		else {
			// found node.key == key
			// 0 child
			if (node.left == null && node.right == null) {
				node = null;
			}
			// 1 child
			else if (node.left == null) {
				node = node.right;
			}
			else if (node.right == null) {
				node = node.left;
			}

			// 2 child
			// delete a node with 2 childs by copy the items of one of the node on left or right then delete that child node
			else {
				Node minRight = findMin(node.right);

				// duplicate it by copying its value
				node.key = minRight.key;
				node.value = minRight.value;

				// then delete that node 
				node.right = deleteNode(node.right, key);
			}
		}
		return node;
	}
}
