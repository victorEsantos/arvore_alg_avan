package app;

public class NamesTree {

    public Object[][] trees = new Object[26][2];

    NamesTree() {
        for (int i = 0; i < 26; i++) {
            char word = (char) (i + 97);
            trees[i][0] = Character.toString(word);
            trees[i][1] = new BinaryTree();
        }
    }
    public void insert(String name) {
        int index = getFirstLetterIndex(name);

        BinaryTree tree = (BinaryTree) trees[index][1];

        tree.insert(name);

    }

    private int getFirstLetterIndex(String nome) {
        String letter = nome.substring(0, 1);
        return letter.charAt(0) - 'a';
    }


}
