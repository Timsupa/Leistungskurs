package Aufgabe2;

import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;

public class Scannen {
    public static double div(int a, int b) {
        return (double)((double)a/(double)b);
    }

    public static void main(String[] args) {
        //alleDurch("Deutschland.png");
        fuenfGleicheLaender("Deutschland.png");
    }
        public static String[] alleDurch(String flaggennamePNG){
        String[] a = new String[4];
            File file = new File("bwinf\\src\\Flaggen\\");
            String[] alleLaender = file.list();
            for (int i = 0; i < alleLaender.length; i++) {
                vergleichEinfach(flaggennamePNG,alleLaender[i]);
            }


            return a;
        }
        public static String fuenfGleicheLaender(String flaggenname){
        File file = new File("bwinf\\src\\Flaggen\\");
        String[] alleLaender = file.list();
        int  ges[] = new int[alleLaender.length];
            for (int i = 0; i < alleLaender.length; i++) {
                ges[i] = vergleichEinfach(flaggenname,alleLaender[i]);
            }
            int gro = 0;
            int stelle = 0;
            for (int i = 0; i < ges.length; i++) {
                if (ges[i] > gro){
                    gro = ges[i];
                    stelle = i;
                }
            }
            System.out.println(alleLaender[stelle]);
            return alleLaender[stelle] ;

        }

        public static int vergleichEinfach(String flaggenname, String zuVergleichen){
            Color [] n = gewuenschteFlagge(flaggenname);
            Color[] g = gewuenschteFlagge(zuVergleichen);
            boolean blau = false;
            boolean rot = false;
            boolean guen = false;
            int gleichheiten = 0 ;
            for (int i = 0; i < n.length; i++) {
                if ((Math.abs(n[i].getBlue() - g[i].getBlue())) <= 20) {
                    blau = true;
                }
                if ((Math.abs(n[i].getRed() - g[i].getRed())) <= 20){
                    rot = true;
                }
                if ((Math.abs(n[i].getGreen() - g[i].getGreen())) <= 20){
                    guen = true;
                }
                if (blau && rot && guen) {
                    gleichheiten++;
                }
                blau = false;
                rot = false;
                guen = false;

            }
            return gleichheiten;
        }

        public static Color[] gewuenschteFlagge(String flaggenname){
            File file = new File("bwinf\\src\\Flaggen\\"+ flaggenname);
            try {
                BufferedImage image = ImageIO.read(file);

                int beginnL = 192;
                int endeR = 578;
                int breite = image.getWidth();
                int hoehe = image.getHeight();
                int loeris = 0;
                Color[] farbe = new Color[hoehe*breite];
                for ( int i = 0; i < breite; i++ ) {
                    for ( int j = 0;j < hoehe ;j++ ) {
                        farbe[loeris] = new Color(image.getRGB(i, j));
                        loeris++;

                    }

                }

                return farbe;



            } catch (IOException e) {
            }
            return null;
        }




}
