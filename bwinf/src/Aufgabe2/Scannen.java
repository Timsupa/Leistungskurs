package Aufgabe2;

import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Scannen {
    public static double div(int a, int b) {
        return (double)((double)a/(double)b);
    }

    public static void main(String[] args) {
        alleDurch("Deutschland.png");
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

        public static int vergleichEinfach(String flaggenname, String zuVergleichen){
            Color [] n = gewuenschteFlagge(flaggenname);
            Color[] g = gewuenschteFlagge(zuVergleichen);
            boolean blau = false;
            boolean rot = false;
            boolean guen = false;
            int gleichheiten = 0 ;
            for (int i = 0; i < 8; i++) {
                if ((Math.abs(n[i].getBlue() - g[i].getBlue())) <= 30) {
                    blau = true;
                }
                if ((Math.abs(n[i].getRed() - g[i].getRed())) <= 30){
                    rot = true;
                }
                if ((Math.abs(n[i].getGreen() - g[i].getGreen())) <= 30){
                    guen = true;
                }
                if (blau && rot && guen) {
                    gleichheiten++;
                }

            }
            System.out.println( gleichheiten + " " + zuVergleichen);
            return gleichheiten;
        }

        public static Color[] gewuenschteFlagge(String flaggenname){
            File file = new File("bwinf\\src\\Flaggen\\"+ flaggenname);
            try {
                BufferedImage image = ImageIO.read(file);

                int beginnL = 192;
                int endeR = 578;
                int hoehe = image.getHeight();
                Color[] farbe = new Color[9];
                int rgb = image.getRGB(192 + (endeR - beginnL) / 3, hoehe / 3);
                farbe[0] = new Color(rgb);
                rgb = image.getRGB(192 + (endeR - beginnL) / 2, hoehe / 3);
                farbe[1] = new Color(rgb);
                rgb = image.getRGB(578 - (endeR - beginnL) / 3, hoehe / 3);
                farbe[2] = new Color(rgb);
                rgb = image.getRGB(192 + (endeR - beginnL) / 3, hoehe / 2);
                farbe[3] = new Color(rgb);
                rgb = image.getRGB(192 + (endeR - beginnL) / 2, hoehe / 2);
                farbe[4] = new Color(rgb);
                rgb = image.getRGB(578 - (endeR - beginnL) / 3, hoehe / 2);
                farbe[5] = new Color(rgb);
                rgb = image.getRGB(192 + (endeR - beginnL) / 3, hoehe * (1 / 3));
                farbe[6] = new Color(rgb);
                rgb = image.getRGB(192 + (endeR - beginnL) / 2, hoehe * (1 / 3));
                farbe[7] = new Color(rgb);
                rgb = image.getRGB(578 - (endeR - beginnL) / 3, hoehe * (1 / 3));
                farbe[8] = new Color(rgb);
                return farbe;



            } catch (IOException e) {
            }
            return null;
        }




}
