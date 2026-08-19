package blatt33.aufgabe06;
import blatt32.aufgabe03.Graph;
import blatt33.aufgabe05.graphsuche;
import schgraphs.*;
public class MST {
    public static int[][] primMST(int[][] graph) {
        SchGraphs sg = new SchGraphs();
        boolean[] visited = new boolean[graph.length];
        visited[0] = true;
        int wert = 279256923;
        int ver = 0;
        int akka = 0;
        int[][] alte= new int[graph.length][graph[0].length];
        int[][] prim = new int[graph.length][graph[0].length];
        sg.step(prim);
        boolean allevis = false;
        while (allevis = false) {
            for (int i = 0; i < graph.length; i++) {
                if (!visited[i] && graph[i][akka] >= 1) {
                    if (graph[i][akka] <= wert) {
                        wert = graph[i][akka];
                        ver = i;
                    }
                    if (!visited[i] && graph[i][ver] >= 1) {
                        alte[i][akka] = graph[i][akka];
                    }
                }
            }
                for (int j = 0; j < graph.length; j++) {
                    if (alte[ver][j] < graph[ver][akka] && visited[j]) {
                        prim[j][akka] = alte[ver][j];

                    }
            }
            prim[ver][akka] = wert;
            prim[akka][ver] = wert;
            akka = ver;
            visited[akka] = true;
            for (int i = 0; i < graph.length; i++) {
                allevis = true;
                if (!visited[i]){
                    allevis = false;
                    break;
                }
            }
        }
        sg.step(prim);
        sg.start();
        return prim;
    }


    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.importGraphS("C:\\Users\\TimothyHaggerty\\Downloads\\graph04");
        System.out.println(primMST(graph.getAdjacencyMatrix()));
    }
}
