package Trees.FromCollegeWallah;

public class Implimentation {

    public static class Node {
        int data;     //0
        Node left;    // null
        Node right;   // null

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class binarytree {

    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;

        Node c = new Node(2);

    }
}
