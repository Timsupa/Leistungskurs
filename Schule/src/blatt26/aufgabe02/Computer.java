package blatt26.aufgabe02;

public abstract class Computer implements Comparable {
    private int cpu;
    private int mem;
    private int gpu;
    private int luefter;
    private int energie;
    private int cpuLuefter;
    private int motherboard;
    private int kabel;
    public void ausgabe(){}

    public Computer(int cpu, int mem, int gpu, int luefter, int energie, int cpuLuefter, int motherboard, int kabel) {
        this.cpu = cpu;
        this.mem = mem;
        this.gpu = gpu;
        this.luefter = luefter;
        this.energie = energie;
        this.cpuLuefter = cpuLuefter;
        this.motherboard = motherboard;
        this.kabel = kabel;
    }

    @Override
    public int compareTo(Computer computer) {
        int sigerB = 0;
        int sigerL = 0;
        if(this.gpu > computer.gpu){
            sigerB ++;
        }else if(this.gpu < computer.gpu){
            sigerL ++;
        }
        if (this.cpu > computer.cpu){
            sigerB++;
        }else if (this.cpu < computer.cpu){
            sigerL++;
        }
        if (this.mem > computer.mem){
            sigerB++;
        }else if (this.mem < computer.mem){
            sigerL++;
        }
        if (this.luefter > computer.luefter){
            sigerB++;
        }else if (this.luefter < computer.luefter){
            sigerL++;
        }
        if (this.energie > computer.energie){
            sigerB++;
        }else if (this.energie < computer.energie){
            sigerL++;
        }
        if (this.cpuLuefter > computer.cpuLuefter){
            sigerB++;
        }else if (this.cpuLuefter < computer.cpuLuefter){
            sigerL++;
        }
        if (this.motherboard > computer.motherboard){
            sigerB++;
        }
        if (this.motherboard < computer.motherboard){
            sigerL++;
        }
        if (this.kabel > computer.kabel){
            sigerB++;
        }else if (this.kabel < computer.kabel){
            sigerL++;
        }
        if (sigerB > sigerL){
            return 1;
        }else {
            return 2;
        }
    }
}
