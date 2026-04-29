package blatt27.aufgabe01;

import java.util.Arrays;

/**
 * Klasse DynArray
 */
public class DynArray {
    private int[] nur;

    public  DynArray(int a) {
        this.nur = new int[a];
    }
    @Override
    public String toString() {
        return Arrays.toString(nur);
    }

    /**
     * Gibt zurück, ob Liste leer
     * @return true, falls leer, sonst false
     */
    public boolean isEmpty(){
        if (nur.length == 0)
            return true;
        return false;
    }
    public int size(){
        return nur.length;
    }
    public int get(int pos){
        if (pos < 0 || pos >= nur.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return nur[pos];
    }
    public boolean contains(int zahl){
        for (int i = 0; i < nur.length; i++){
            if (nur[i] == zahl){
                return true;
            }
        }
            return false;
    }
    public int indexOf(int zahl){
        for (int i = 0; i < nur.length; i++){
            if (nur[i] == zahl){
                return i;
            }
        }
        return -1;
    }
    public int[] add(int zahl){
        int[] newNur = new int[nur.length+1];
        for (int i = 0; i < nur.length; i++){
            newNur[i] = nur[i];
        }
        newNur[newNur.length-1] = zahl;
        return newNur;
    }
    public int[] add(int zahl,int pos){
        if (pos < 0 || pos >= nur.length){
            throw new ArrayIndexOutOfBoundsException();
        }else {
            int[] newNur = new int[nur.length + 1];
            for (int i = 0; i < nur.length; i++) {
                newNur[i] = nur[i];
            }
            for (int i = pos; i < newNur.length-1; i++) {
                newNur[i+1] = newNur[i+2];
            }
            newNur[pos] = zahl;
            return newNur;
        }
    }
    public int[] set(int zahl,int pos){
        int[] newNur = new int[nur.length];
        for (int i = 0; i < nur.length; i++){
            newNur[i] = nur[i];
        }
        newNur[pos] = zahl;
        return newNur;
    }
    public int remove(int pos){
        int[] newNur = new int[nur.length-1];
        for (int i = 0; i < pos-1; i++){
            newNur[i] = nur[i];
        }
        for (int i = pos; i < newNur.length; i++){
            newNur[i] = nur[i+1];
        }
        return nur[pos];
    }
    public void clear(){
        nur = null;
    }

}
