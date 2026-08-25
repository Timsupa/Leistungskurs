package blatt33.aufgabe07;

import blatt32.aufgabe03.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dijkstra {

    public void dijkstra(int[][] graph, int start) {
        int[][] neu = new int[graph.length][graph.length];
        Stack<Integer> vorgänger = new Stack<>();
        boolean[] visited = new boolean[graph.length];
        int[] wege = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            visited[i] = false;
        }
        int h = 0;
        visited[start] = true;

        while (h != graph.length) {
            h = 0;
            int[][] temp = new int[graph.length][graph.length];
            for (int i = 0; i < graph.length; i++) {
                if (graph[start][i] <= 1) {
                    temp[start][i] = graph[start][i];
                }
            }
            int bestWeg = 0;
            for (int j = 0; j < graph.length - 1; j++) {
                if (temp[start][j] >= graph[start][j + 1]) {
                    bestWeg = j+1;
                    temp[start][j + 1] = graph[start][j];
                }
            }

            visited[bestWeg] = true;
            neu[start][bestWeg] = graph[start][bestWeg];
            vorgänger.add(start);
            start = bestWeg;


        }




            for (int i = 0; i < graph.length; i++) {
                if (visited[i] == true) {
                    h++;
                }
            }

        }
    }
}
