public class Link<T> {
    private char idLink;
    private Node<T> nextNode;

    public Link() {
        nextNode = new Node<T>();
        idLink = (char) 0;
    }

    public void setidLink(char obj) {
        idLink = obj;
    }

    public char getidLink() {
        return idLink;
    }

    public Node<T> nextNode() {
        return nextNode;
    }

}