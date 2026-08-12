package blatt32.aufgabe03;

import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLWriter;
import java.io.*;
import java.util.Scanner;
import schgraphs.*;


public class Graph {
    int[][] graph;

    public Graph(int anzahlKnoten) {
        this.graph = new int[anzahlKnoten][anzahlKnoten+1];
    }

    public Graph() {
        this.graph = new int[0][0];
    }

    public void addVertex(){
        int[][] newGraph = new int[this.graph.length+1][this.graph.length+1];
        for (int i = 0; i < this.graph.length; i++) {
            for (int j = 0; j < this.graph.length; j++) {
                newGraph[i][j] = this.graph[i][j];
            }
        }

        this.graph = newGraph;
    }
    public void addEdge(int v1, int v2){
        this.graph[v1][v2] = 1;
    }
    public void addEdge(int v1, int v2, int weight){
        this.graph[v1][v2] = weight;
    }
    public void addEdge(int v1, int v2,boolean isDirected){
        if(isDirected){
            this.graph[v1][v2] = 1;
            this.graph[v2][v1] = 1;
        }else {
            this.graph[v1][v2] = 1;
        }
    }
    public void addEdge(int v1, int v2, int weight, boolean isDirected){
        if(isDirected){
            this.graph[v1][v2] = weight;
            this.graph[v2][v1] = weight;
        }else  {
            this.graph[v1][v2] = weight;
        }
    }
    public int size(){
        return this.graph.length;
    }
    public boolean isWeighted(){
       for(int i = 0; i < this.graph.length; i++){
           for(int j = 0; j < this.graph.length; j++){
               if(this.graph[i][j] < 1){
                   return true;
               }
           }
       }
       return false;
    }
    public boolean isDirected(){
        for(int i = 0; i < this.graph.length; i++){
            for(int j = 0; j < this.graph.length; j++){
                if(this.graph[i][j] != this.graph[j][i] ){
                    return true;
                }
            }
        }
        return false;
    }
    public int[][] getAdjacencyMatrix(){
        int[][] adjMatrix = this.graph;
        return adjMatrix;
    }
    public int[] getNeighbours(int v1){
        int[] nachbaren = new int[this.graph.length+1];
        int k = 0;
        for(int j = 0; j < this.graph.length; j++){
            if(this.graph[v1][j] < 0){
                nachbaren[k] = this.graph[v1][j];
                k++;
            }
        }
        return nachbaren;
    }
    public void exportHTML()throws  IOException{
        StringBuilder matrix = new StringBuilder();
        matrix.append("<!DOCTYPE html>\n");
        matrix.append("<html>\n");
        matrix.append("<head>\n");
        matrix.append("<title>Adjazenmatrix</title>\n");
        matrix.append("</head>\n");
        matrix.append("<body>\n");
        matrix.append("<table>\n");
        for(int i = 0; i < this.graph.length; i++){
            matrix.append("<tr>\n");
            for(int j = 0; j < this.graph.length; j++){
                matrix.append("<td>"+this.graph[j][i]+"</td>\n");
            }
            matrix.append("</tr>\n");
        }
        matrix.append("</table>\n");
        matrix.append("</body>\n");
        matrix.append("</html>\n");

    }
    public void exportGraph()throws IOException{
        File Matrix = new File("graph");
        FileWriter fw = new FileWriter(Matrix);
        for(int k = 0; k < this.graph.length; k++){
            for(int j = 0; j < this.graph.length; j++){
                fw.write(this.graph[k][j]);
                fw.write("\n");
            }
        }
        fw.close();
    }
    public void importGraph(String filepath)throws IOException{
        int k = 0;
        String line;
        char[] temp = new char[this.graph.length];
        int[][] adjMatrix = new int[this.graph.length+1][this.graph.length+1];
        File f = new File(filepath);
        try(Scanner input = new Scanner(f)){
            while(input.hasNextLine()){
                 line = input.nextLine();
                 temp = line.toCharArray();
                 for(int i = 0; i < temp.length; i++){
                     adjMatrix[k][i] = temp[i];
                 }
                 k++;
            }
        }

    }

    public static void main(String[] args) {
        int[][] graph = new int[5][5];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
               graph[i][j] = blatt13.Zufall.zufallGanz(10);
            }
        }

        SchGraphs sg = new SchGraphs();
        sg.step(graph);
        sg.start();
    }
}
