package blatt03;
import java.util.Scanner;
public class MitOderOhneStrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wählen Sie eine der Gattern aus indem Sie diese ausschreiben(NOT, OR, AND, XOR");
        String auswahl = input.nextLine();
        if (auswahl.equals("NOT") || auswahl.equals("OR") || auswahl.equals("AND") || auswahl.equals("XOR") ) {//wenn eine der gattern richtig ausgewählt wird wird das program "aktiviert"
            if (auswahl.equals("AND")) {
                System.out.println("Das AND-Gatter:\nDas Gatter verfügt über 2 Eingänge und einen Ausgang.");
                System.out.println("Befindet sich auf dem ersten Eingang Strom? (true/false)");
                boolean eingang = input.nextBoolean();
                System.out.println("Befindet sich auf dem zweiten Eingang Strom? (true/false)");
                boolean eingang2 = input.nextBoolean();
                boolean ergebniss1 = eingang && eingang2;
                System.out.println(eingang + " AND " + eingang2 + " = " + ergebniss1);
                }
            if (auswahl.equals("OR")) {
                System.out.println("Das OR-Gatter:\nDas Gatter verfügt über 2 Eingänge und einen Ausgang");
                System.out.println("Befindet sich auf dem ersten Eingang Strom? (true/false)");
                boolean eingang4 = input.nextBoolean();
                System.out.println("Befindet sich auf dem zweiten Eingang Strom? (true/false)");
                boolean eingang5 = input.nextBoolean();
                boolean ergebniss2 = eingang4 || eingang5;
                System.out.println(eingang4 + " OR " + eingang5 + " = " + ergebniss2);
                }
            if (auswahl.equals("XOR")) {
                System.out.println("Das XOR-Gatter:\nDas Gatter verfügt über 3 Eingänge und einen Ausgang");
                System.out.println("Befindet sich auf dem ersten Eingang Strom?");
                boolean eingang6 = input.nextBoolean();
                System.out.println("Befindet sich auf dem zweiten Eingang Strom?");
                boolean eingang7 = input.nextBoolean();
                System.out.println("Befindet  sich auf dem dritten Eingang Strom?");
                boolean eingang8 = input.nextBoolean();
                boolean ergebniss3;
                boolean wiesoGehtDasNicht = false;
                if (eingang6 != eingang7 && eingang6 != eingang8 && eingang6 != wiesoGehtDasNicht) {
                    ergebniss3 = true;
                    System.out.println(eingang6 + " XOR " + eingang7 + " XOR " + eingang8 + " = " + ergebniss3);
                } else if (eingang7 != eingang8 && eingang7 != eingang6 && eingang7 != wiesoGehtDasNicht) {
                    ergebniss3 = true;
                    System.out.println(eingang6 + " XOR " + eingang7 + " XOR " + eingang8 + " = " + ergebniss3);
                } else if (eingang8 != eingang6 && eingang8 != eingang7 && eingang8 != wiesoGehtDasNicht) {
                    ergebniss3 = true;
                    System.out.println(eingang6 + " XOR " + eingang7 + " XOR " + eingang8 + " = " + ergebniss3);
                } else {
                    ergebniss3 = false;
                    System.out.println(eingang6 + " XOR " + eingang7 + " XOR " + eingang8 + " = " + ergebniss3);
                }
            }
            if (auswahl.equals("NOT")) {
                System.out.println("Das NOT-Gatter:\nDas Gatter verfügt über 1 Eingänge und einen Ausgang");
                System.out.println("Hat der Eingang Strom? (true/false)");
                boolean eingang10 = input.nextBoolean();
                boolean ergebniss4;
                if(eingang10 == true) {
                    ergebniss4 = false;
                    System.out.println(eingang10 + " NOT = " + ergebniss4);
                } else if ( eingang10 == false) {
                    ergebniss4 = true;
                    System.out.println(eingang10 + " NOT = " + ergebniss4);
                }
            }
        }else{//bei falscher Eingabe der Gatternamen wird man darauf hingewiesen
            System.out.println("Sie haben keine der oben genannten Gattern ausgewählt.\nWiederholen Sie den Vorgang indem Sie eine Gatter auswählen");
            System.exit(0);
            }
        }
    }

