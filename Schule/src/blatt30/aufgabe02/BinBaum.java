package blatt30.aufgabe02;

public class BinBaum extends Node {
    private Node root;


    public BinBaum(int wert, Node left, Node right, Node root) {
        super(wert, left, right);
        this.root = null;
        this.root = root;
    }

    public Node search(int value,Node current) {
        if (current.getWert() == value) {
            return current;
        }else if (getLeft() != null && value < root.getWert()) {
                current = getLeft();
            search(value,current);
        }else if (getRight() != null && value > root.getWert()) {
            current = getRight();
            search(value,current);
        }
        return null;
    }
    public void add(int wert){
        Node a = this.root;
        if (search(wert,a).equals(wert)) {
            System.out.println("gibts schon");
        }else if (neahsteZahl(wert).getWert() < wert){
            setLeft(new Node(wert,null,null));
        } else if (neahsteZahl(wert).getWert() > wert) {
            setRight(new Node(wert,null,null));
        }
    }
    public Node neahsteZahl(int wert) {
        Node a = this.root;
         if (search(wert,a).equals( wert)){
             return a;
        }else  {
             int temp = wert;
             while (!search(wert,a).equals(null)){
                 wert++;
             }
             Node nahest = search(wert,a);
             wert = temp;
             while (!search(wert,a).equals(null)){
                 wert--;
             }
             Node nahestU = search(wert,a);
             if (Math.abs(nahest.getWert())-temp < Math.abs(nahestU.getWert())-temp) {
                 return nahest;
             }else {
                 return nahestU;
             }

        }
    }
    public Node[] findInOrderNeighbour() {
        Node[] result = new Node[2];
        result[1] =neahsteZahl(this.root.getWert()-1);
        result[0] =neahsteZahl(this.root.getWert()+1);
        return result;
    }
    public Node remove(int wert) {
        Node a = search(wert,this.root);
        if (a.getRight() == null&& a.getLeft() == null){
            a = null;
        }if (a.getLeft().getLeft() == null && a.getRight().getRight() == null) {
        if (a.getRight() != null && a.getLeft() == null) {
                a = a.getRight();
                a.setRight(null);
            } else if (a.getLeft() != null && a.getRight() == null) {
                a = a.getLeft();
                a.setLeft(null);
            } else if (a.getRight() != null && a.getLeft() != null) {
                if (neahsteZahl(a.getWert()).equals(a.getLeft())) {
                    a = a.getLeft();
                    a.setLeft(null);
                } else if (neahsteZahl(a.getWert()).equals(a.getRight())) {
                    a = a.getRight();
                    a.setRight(null);
                }
            }
        }else {
                if (Math.abs(findInOrderNeighbour()[0].getWert())-wert<Math.abs(findInOrderNeighbour()[1].getWert())-wert){
                    a = findInOrderNeighbour()[0];
                    findInOrderNeighbour()[0] = null;
                }else  {
                    a = findInOrderNeighbour()[1];
                    findInOrderNeighbour()[1] = null;
                }
            }
        return a;
    }
}
