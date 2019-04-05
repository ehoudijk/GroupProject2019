package model.persoon;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import model.klas.Klas;


import java.util.ArrayList;
import java.util.List;

public class Rooster {
//    private int roosterID;
    private String title;
    private String startDatum;
    private String startTijd;
    private String eindTijd;
    private String docenten;
    private String groepen;
    private List<Klas> klassen = new ArrayList<>();
//    private ArrayList<Les> lessen = new ArrayList<Les>();
    private static List<Rooster> roosters = new ArrayList<>();

    public static List<Rooster> getRoosters() {
        return roosters;
    }

    public static void setRoosters(List<Rooster> roosters) {
        Rooster.roosters = roosters;
    }

    @JsonIgnore
    public List<Klas> getKlas() {
        return klassen;
    }
    public String getNaam() {
        return title;
    }

    public String getStartDatum() {
        return startDatum;
    }

    public String getStartTijd() {
        return startTijd;
    }

    public String getEindTijd() {
        return eindTijd;
    }

    public String getDocenten() {
        return docenten;
    }

    public String getGroepen() {
        return groepen;
    }

    public Rooster(String title, String startDatum, String startTijd, String eindTijd, String docenten, String groepen, List<Klas> klassen) {
        this.title = title;
        this.startDatum = startDatum;
        this.startTijd = startTijd;
        this.eindTijd = eindTijd;
        this.docenten = docenten;
        this.groepen = groepen;
        this.klassen = klassen;
    }


}
