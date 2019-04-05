package model.klas;

public class Vak {
    private String naam;
    private String vakcode;
    private String beschrijving;

    public Vak(String nm, String vc, String besc){
        naam = nm;
        vakcode =vc;
        beschrijving = besc;

    }

    public String getNaam(){
        return naam;
    }
    public void setNaam(String nm){
        naam = nm;

    }
    public String getVakcode(){
        return vakcode;

    }
    public void setVakcode(String vkcd){
        vakcode = vkcd;

    }
    public String getBeschrijving(){
        return beschrijving;

    }
    public void setBeschrijving(String bsch){
        beschrijving = bsch;

    }
}
