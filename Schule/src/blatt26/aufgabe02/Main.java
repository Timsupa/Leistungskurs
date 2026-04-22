package blatt26.aufgabe02;

public class Main{

    public static Computer[] sortComputers(Computer[] computers) {
        for (int i = 0; i < computers.length - 1;i++) {
            for (int j = 0; j < computers.length - 1;j++) {
                if (computers[i].compareTo(computers[i+1]) == 2) {
                    Computer temp = computers[j];
                    computers[j] = computers[j+1];
                    computers[j+1] = temp;
                }
            }
        }
        return computers;
    }
    public static void main(String[] args) {
        Computer[] computers = new Computer[8];

    }
}
