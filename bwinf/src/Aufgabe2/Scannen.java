package Aufgabe2;

import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Scannen {
    public static void main(String[] args) {


        File file = new File("src\\Aufgabe2\\flaggen\\Deutschland.png");
        try {
            BufferedImage image = ImageIO.read(file);

            int beginnL = 192;
            int endeR = 578;
            int hoehe = image.getHeight();
            int rgb = image.getRGB(192 +(beginnL-endeR)/3, hoehe/3);
            Color farbe = new Color(rgb,true);
            String a = farbe.toString();
            System.out.printf("%s\n",a);

        }catch (IOException e){}

    }


}
