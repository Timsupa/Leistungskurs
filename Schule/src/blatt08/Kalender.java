package blatt08;
public class Kalender {
    public static int getTag(String str) {
        int ganzz = 0;
        for (int i = 0; i < 1; i++) {
            ganzz += str.charAt(i);
        }
        return ganzz;
    }

    public static int getMonat(String str) {
        int ganzz = 0;
        for (int i = 3; i < 5; i++) {
            if (str.charAt(i) == '.') {
                continue;
            }
            ganzz += str.charAt(i);
        }
        return ganzz;
    }

    public static int getJahr(String str) {
        int ganzz = 0;
        for (int i = 6; i < 10; i++) {
            if (str.charAt(i) == '.') {
                continue;
            }
            ganzz += str.charAt(i);
        }
        return ganzz;
    }

    public static boolean istSchaltjahr(String str) {
        int ganzz = getJahr(str);
        if (ganzz % 400 == 0) {
            return true;
        }
        return false;
    }

    public static String zuDatum(int tag, int monat, int jahr) {
        char[] temp = new char[tag + '.' + monat + '.' + jahr];
        String datum = new String(temp);
        return datum;
    }

    public static String naesterTag(String str) {
        int tag = getTag(str);
        int monat = getMonat(str);
        int jahr = getJahr(str);
        if (monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12) {
            if ((tag++) > 31) {
                if ((monat++) > 12) {
                    jahr++;
                    monat = 1;
                } else {
                    monat++;
                    tag = 1;
                }
            } else {
                tag++;
            }
        } else if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
            if ((tag++) > 30) {
                if ((monat++) > 12) {
                    jahr++;
                    monat = 1;
                } else {
                    monat++;
                    tag = 1;
                }
            } else {
                tag++;
            }
        } else if (monat == 2) {
            if (istSchaltjahr(str) == true) {
                if ((tag++) > 29) {
                    if ((monat++) > 12) {
                        jahr++;
                        monat = 1;
                    } else {
                        monat++;
                        tag = 1;
                    }
                } else {
                    tag++;
                }
            } else {
                if ((tag++) > 28) {
                    if ((monat++) > 12) {
                        jahr++;
                        monat = 1;
                    } else {
                        monat++;
                        tag = 1;
                    }
                } else {
                    tag++;
                }
            }
        }
        return zuDatum(tag, monat, jahr);
    }
}

