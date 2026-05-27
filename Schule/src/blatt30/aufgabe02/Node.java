package blatt30.aufgabe02;

public class Node {
    private int wert;
    private Node left;
    private Node right;

    public Node(int wert, Node left, Node right) {
        this.wert = wert;
        this.left = left;
        this.right = right;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


}
