public class BinaryTree {

    private Node root;

    class Node {
        Object data;
        Node left;
        Node right;

        Node(Object data) {
            left = null;
            right = null;
            this.data = data;
        }
    }

}