package app;

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = null;
    }

    public void insert(String data) {
        var newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            insertRecursive(this.root, newNode);
        }
    }

    private void insertRecursive(Node root, Node newNode) {
        if (newNode.data.compareTo(root.data) < 0) {
            if (root.prev == null) {
                root.prev = newNode;
            } else {
                insertRecursive(root.prev, newNode);
            }
        } else if (newNode.data.compareTo(root.data) > 0) {
            if (root.next == null) {
                root.next = newNode;
            } else {
                insertRecursive(root.next, newNode);
            }
        }
    }

    public BinaryTree getLeft() {
        if (this.root.prev == null) return null;
        return new BinaryTree(this.root.prev);
    }

    public BinaryTree getRight() {
        if (this.root.next == null) return null;

        return new BinaryTree(this.root.next);
    }

    public String getData() {
        return this.root.data;
    }

}