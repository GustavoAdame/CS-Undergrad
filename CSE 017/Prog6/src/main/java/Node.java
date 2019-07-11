import java.util.LinkedList;
import java.util.List;

public class Node<T> {
    private T nodeVal;
    private List<Link> links;

    public Node() {
        nodeVal = null;
        links = new LinkedList<Link>();
    }

    public void setnodeVal(T nodeVal) {
        this.nodeVal = nodeVal;
    }

    public T getnodeVal() {
        return nodeVal;
    }

    public void setLink(Link obj) {
        links.add(obj);
    }

    public List<Link> getLink() {
        return links;
    }

    public boolean exist(char obj) {
        for (int i = 0; i < links.size(); i++) {
            if (links.get(i).getidLink() == obj) {
                return true;
            }
        }
        return false;
    }

    public Node<T> nodeFinder(char obj) {
        for (int i = 0; i < links.size(); i++) {
            if (links.get(i).getidLink() == obj) {
                return links.get(i).nextNode();
            }
        }
        return null;
    }

}
