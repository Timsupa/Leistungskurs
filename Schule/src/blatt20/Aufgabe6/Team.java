package blatt20.Aufgabe6;

public class Team {
    private int teamID;
    private int platzierung;
    private int aktuelleRunde;

    private Charakter charakter;
    public Team(int teamID, int aktuelleRunde, int platzierung) {
        this.teamID = teamID;
        this.aktuelleRunde = aktuelleRunde;
        this.platzierung = platzierung;
    }

    public int getTeamID() {
        return teamID;
    }

    public int getAktuelleRunde() {
        return aktuelleRunde;
    }

    public int getPlatzierung() {
        return platzierung;
    }
    public void wechsleZuFahrer(Charakter charakter) {

    }
    public void aktuelisierePlatzierung(){

    }
}
