public class Tree {
    public int data;
    public Tree left, right;

    // Constructor
    public Tree(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void setData() {
        this.data = data;
    }

    public Tree getLeft() {
        return left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public static void main(String[] args) {
        Tree binaryTree = new Tree(12);
        System.out.println(binaryTree.getData());
    }
}
