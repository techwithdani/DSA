package dataStructures;

public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildBinaryTree(int nodes[]) {
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);

            newNode.left = buildBinaryTree(nodes);
            newNode.right = buildBinaryTree(nodes);

            return newNode;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 9, 8, 7, -1, -1, 5, -1, -1, 2, -1, 6, -1, -1, 4, -1, 1 };

        Node rootNode = BinaryTree.buildBinaryTree(nodes);
    }
}
