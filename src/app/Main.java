package app;
public class Main {
    public static void main(String[] args) {


        var namesTree = new NamesTree();



        namesTree.insert("aaa");
        namesTree.insert("aab");
        namesTree.insert("aac");
        namesTree.insert("aad");


        printTree((BinaryTree)namesTree.trees[0][1]);


    }

    public static void printTree(BinaryTree tree) {
        if (tree.getLeft() != null) {
            printTree(tree.getLeft());
        }
        System.out.println(tree.getData());
        if (tree.getRight() != null) {
            printTree(tree.getRight());
        }
    }




}