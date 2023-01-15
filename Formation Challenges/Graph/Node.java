package Graph;
import java.util.*;
public class Node {
    public List<Node> children;
    public int value;

    public Node() {
        this.value = -1;
        this.children = new ArrayList<>();
    }

    public Node(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public Node(int value, List<Node> children) {
        this.value = value;
        this.children = new ArrayList<>(children);
    }
}
