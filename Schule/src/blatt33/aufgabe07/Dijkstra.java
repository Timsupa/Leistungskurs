package blatt33.aufgabe07;

import blatt32.aufgabe03.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dijkstra {

    public int getKleinstes(ArrayList<Integer> L,int[][] way) {
        int min =  Integer.MAX_VALUE;
        int gn = 0;
        for(int j=0;j<L.size();j++){
            int leek = L.get(j);
            if (way[leek][j]< min){
                gn = leek;
                min = way[leek][j];
            }
        }
        return gn;
        }

        public int[][] dijkstra(Graph graph, int start) {
            ArrayList<Integer> K = new ArrayList<>();
            boolean[] hausbesuch = new boolean[graph.size()];
            int[][] wege =  new int[graph.size()][2];
            wege[start][0] = 0;
            wege[start][1] = start;
            for (int i = 1; i < graph.size(); i++) {
                wege[start][i] = Integer.MAX_VALUE;
                wege[start][i] = -500;
                hausbesuch[i] = false;
            }
            K.add(start);
            while (!K.isEmpty()) {
                Integer x = getKleinstes(K, wege);
                K.remove(x);
                hausbesuch[x] = true;
                int[] rentner = graph.getNeighbours(x);
                for (int i = 0; i < rentner.length; i++) {
                    Integer o = i;
                    if (hausbesuch[i] == false) {
                        K.add(o);
                    }
                    int neuzeit = wege[o][0];
                    int barok = wege[x][0];
                    if (neuzeit < barok) {
                        wege[o][0] = neuzeit;
                        wege[o][1] = x;
                    }
                }
            }
            return wege;
        }
    }

