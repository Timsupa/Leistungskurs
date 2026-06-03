package blatt30.aufgabe03;

import blatt30.aufgabe02.Node;

public class BinBaum extends blatt30.aufgabe02.Node {
    private blatt30.aufgabe02.Node root;


    public BinBaum(int wert, blatt30.aufgabe02.Node left, blatt30.aufgabe02.Node right, blatt30.aufgabe02.Node root) {
        super(wert, left, right);
        this.root = null;
        this.root = root;
    }

    public blatt30.aufgabe02.Node search(int value, blatt30.aufgabe02.Node current) {
        if (current.getWert() == value) {
            return current;
        } else if (getLeft() != null && value < root.getWert()) {
            current = getLeft();
            search(value, current);
        } else if (getRight() != null && value > root.getWert()) {
            current = getRight();
            search(value, current);
        }
        return null;
    }

    public void add(int wert) {
        blatt30.aufgabe02.Node a = this.root;
        if (search(wert, a).equals(wert)) {
            System.out.println("gibts schon");
        } else if (neahsteZahl(wert).getWert() < wert) {
            setLeft(new blatt30.aufgabe02.Node(wert, null, null));
        } else if (neahsteZahl(wert).getWert() > wert) {
            setRight(new blatt30.aufgabe02.Node(wert, null, null));
        }
    }

    public blatt30.aufgabe02.Node neahsteZahl(int wert) {
        blatt30.aufgabe02.Node a = this.root;
        if (search(wert, a).equals(wert)) {
            return a;
        } else {
            int temp = wert;
            while (!search(wert, a).equals(null)) {
                wert++;
            }
            blatt30.aufgabe02.Node nahest = search(wert, a);
            wert = temp;
            while (!search(wert, a).equals(null)) {
                wert--;
            }
            blatt30.aufgabe02.Node nahestU = search(wert, a);
            if (Math.abs(nahest.getWert()) - temp < Math.abs(nahestU.getWert()) - temp) {
                return nahest;
            } else {
                return nahestU;
            }

        }
    }

    public blatt30.aufgabe02.Node[] findInOrderNeighbour() {
        blatt30.aufgabe02.Node[] result = new blatt30.aufgabe02.Node[2];
        result[1] = neahsteZahl(this.root.getWert() - 1);
        result[0] = neahsteZahl(this.root.getWert() + 1);
        return result;
    }

    public blatt30.aufgabe02.Node remove(int wert) {
        blatt30.aufgabe02.Node a = search(wert, this.root);
        if (a.getRight() == null && a.getLeft() == null) {
            a = null;
        }else {
            remowe(a);
        }

        return a;
    }

    public blatt30.aufgabe02.Node remowe(blatt30.aufgabe02.Node a) {
        if (a.getLeft().getLeft() == null && a.getRight().getRight() == null) {
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
        }else if (a.getLeft().getLeft() != null && a.getRight().getRight() == null) {
            remowe(a.getLeft());
        }else if (a.getLeft().getLeft() == null && a.getRight().getRight() != null) {
            remowe(a.getRight());
        } else if (a.getLeft().getRight() != null && a.getRight().getLeft() == null) {
            remowe(a.getLeft());
        }
        else if (a.getLeft().getRight() == null && a.getRight().getLeft() != null) {
            remowe(a.getRight());
        } else if (a.getLeft().getRight() != null && a.getRight().getLeft() != null || (a.getLeft().getLeft() != null && a.getRight().getRight() != null)) {
            remowe(a.getLeft());
            remowe(a.getRight());
        }
        return a;
    }
    public int depth(Node a) {
        if (a == null) {
            return 0;
        }
        return 1 + Math.max(depth(a.getLeft()), depth(a.getRight()));
    }
    public Node update(Node a){
        int rechts = depth(a.getRight());
        int links = depth(a.getLeft());
        if (rechts+2 < links || rechts > links+2) {
            if (rechts > links +2) {
                Node g = findInOrderNeighbour()[0];
            }
        }
    }
}
