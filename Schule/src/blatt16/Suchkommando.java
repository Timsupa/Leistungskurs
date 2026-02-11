package blatt16;

import java.io.File;

public class Suchkommando {
    public static void suchen(String datei){
        String path = "C:\\";
        int a = 0;
        int temp[] = new int[1000000];
        outer:
        while(true){

            File file = new File(path);
            String[] list = file.list();
            if( list == null || list.length==0 && !path.equals("C:\\")){
                path = "C:\\";
                System.out.println(path);
            } else {
                for (int i = 0; i < list.length; i++) {
                    if (list[i].equals(datei)) {
                        File f = new File(path + list[i]);
                        System.out.println(f.getAbsolutePath());
                        return;
                    }
                    else if (!list[i].equals(datei)) {
                        System.out.println(a);
                        for (int b = 0; b < a; b++) {
                            if (i == temp[b]) {
                                System.out.println("bertsuc");
                                continue outer;// muss in die andere if schleife gehen
                            }
                        }
                                System.out.println(path + list[i]);
                                File g = new File(path + list[i]);
                                if (g.isDirectory()) {
                                    temp[a] = i;
                                    a++;
                                    path += list[i] + "\\";
                                    continue outer;

                                }
                            }
                }
            }
        }
    }
    public static void main(String[] args) {
        suchen("Desktop");
    }
}
