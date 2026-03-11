package blatt20;

public class aufgabe2 {
    public class Kochfeld {
        int hitzestufe;
        String groeße;

        public void Kochfeld(String gr) {
            this.hitzestufe = 0;
            this.groeße = gr;
        }
        void Hitzeaenderung(String hr){
            if (hr.equals("Hoch")){
                this.hitzestufe++;
            }else if (hr.equals("Runter")){
                this.hitzestufe--;
            }
        }
    }
    public class Ofen{
        String modus;
        int temp;
        void Ofen(String m,int t){
            this.modus = m;
            this.temp = t;
        }
        void regulation(int tem){
            this.temp = tem;
        }
        void aenderModus(String gewuenModus){
            String modi[] = new String []{"Aus","Beleuchtung","Unterhitze","Oberhitze","Unter- und Oberhitze","Umluft"};
            int z = 0;
            while (!modi[z].equals(gewuenModus)){
                z++;
            }
            this.modus = modi[z];
        }
    }
    public class Ofenherd{
        int kochfelder;
        String proze;
    }
}
