import java.util.ArrayList;

public class Bashtable<T> {
    private Node<T> head;

    public Bashtable() {
        head = new Node<T>();
    }

    public void put(String key, T value) {
        Node<T> temp = head, tail = null;
        Link list;
        char val;
        for (int i = 0; i < key.length(); i++) {
            val = key.charAt(i);
            list = new Link<T>();
            if (temp.exist(val) == false) {
                if (i != key.length() - 1) {
                    list.setidLink(val);
                    temp.setLink(list);
                    temp = list.nextNode();
                } else {
                    list.setidLink(val);
                    list.nextNode().setnodeVal(value);
                    temp.setLink(list);
                }
            } else {
                tail = temp.nodeFinder(val);
                temp = tail;

            }
        }
    }

    public T get(String key) {
        Node<T> current = head, tempNode = null;
        char val;
        for (int i = 0; i < key.length(); i++) {
            val = key.charAt(i);
            if (current.exist(val)) {
                tempNode = current.nodeFinder(val);
                current = tempNode;
            }
        }
        return current.getnodeVal();
    }

}
