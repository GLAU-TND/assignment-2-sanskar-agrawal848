package problem4.element;

public class Element<T> {
    private T node;
    private T preOrderSuccessor;
    private Element next;
    public Element(T node, T preOrderSuccessor) {
        this.node = node;
        this.preOrderSuccessor = preOrderSuccessor;
    }
}
