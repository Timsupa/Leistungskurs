package blatt33.aufgabe05;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class graphsuche {


        public boolean ispath(int[][] graph, String pfad) {
            for (int i = 0; i < pfad.toCharArray().length - 1; i++) {
                if (graph[pfad.charAt(i)][pfad.charAt(i++)] <= 1) {
                    return true;
                }
            }
            return false;
        }
        public boolean ispath2(int[][] graph, int a, int b)
        {
            if (graph[a][b] <= 1) {
                return true;
            }
            return false;
        }


        public int pathLength(int[][] graph, String pfad) {
            int len = 0;
            len = graph[pfad.charAt(0)][pfad.charAt(1)];
            return len;
        }
        public int pathLength(int[][] graph,int a, int b) {
            int len = 0;
            len = graph[a][b];
            return len;
        }

        public boolean zyklensuche(int[][] graph, int knotenstart) {
            boolean yarrar = false;
            Stack<Integer> stack = new Stack<>();
            boolean[] visited = new boolean[graph.length];
            for (int i = 0; i < graph.length; i++) {
                visited[i] = false;
            }
            visited[0] = true;
            stack.push(knotenstart);
            while (!stack.isEmpty() ) {
                int j = stack.pop();
                for (int i = 0; i < graph.length; i++) {
                    if (visited[i] == false && ispath2(graph,j,i)) {
                        stack.push(i);
                        visited[i] = true;
                    }else if (visited[j] == true && ispath2(graph,j,i)) {
                        yarrar = true;
                    }
                }
            }
            return yarrar;
        }
        public int[] erreichbarkeit(int[][] graph, int knotenstart) {
            boolean[] visited = new boolean[graph.length-1];
            for (int i = 0; i < graph.length; i++) {
                visited[i] = false;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.add(knotenstart);
            while (!queue.isEmpty()) {
                int j = queue.poll();
                for (int i = 0; i < graph.length; i++) {
                    if (visited[i] == false && ispath2(graph,j,i)) {
                        visited[i] = true;
                        queue.add(i);
                    }
                }
            }
            int[] nichtErreichbarkeit = new int[graph.length];
            for (int i = 0; i < visited.length; i++) {
                if (visited[i] == false) {
                    nichtErreichbarkeit[i] = i;
                }
            }
            return nichtErreichbarkeit;
        }
    }


