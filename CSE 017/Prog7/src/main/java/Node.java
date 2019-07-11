public class Node {
    String val;
    Node left;
    Node right;

    public Node() {
        left = null;
        right = null;
        val = null;
    }

    public void createNode(String val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public String getVal() {
        return val;
    }
}