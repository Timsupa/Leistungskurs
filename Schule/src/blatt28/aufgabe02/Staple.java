package blatt28.aufgabe02;

import java.sql.Array;
import java.util.ArrayList;

public class Staple<T> {
    private ArrayList<T> staple;

    public Staple(ArrayList<T> staple) {
        this.staple = staple;
    }

    public boolean empty() {
        if (this.staple == null){
            return true;
        }
        return false;
    }
    public T peek() {
        return this.staple.getLast();
    }
    public T pop(T[] staple) {
       this.staple.remove(staple[0]);
       return staple[0];
    }
    public void push(T ele) {
      this.staple.add(ele);
    }
    public void duplicate() {
        this.push(peek());
    }

}




