package model.klas;

import java.util.Date;

public class Les {
    private Vak vak;
    private Date begindatum;
    private Date einddatum;
    private Date begintijd;
    private Date eindtijd;

    public Les(Vak vk, Date bd, Date ed, Date bt, Date et) {
        vak = vk;
        begindatum = bd;
        einddatum = ed;
        begintijd = bt;
        eindtijd = et;
    }

    public Vak getVak() {
        return vak;
    }

    public void setVak(Vak vak) {
        this.vak = vak;
    }

    public Date getBegindatum() {
        return begindatum;
    }

    public void setBegindatum(Date begindatum){
        this.begindatum = begindatum;
    }

    public Date getEinddatum() {
        return einddatum;
    }

    public void setEinddatum(Date einddatum) {
        this.einddatum = einddatum;
    }

    public Date getBegintijd() {
        return begintijd;
    }

    public void setBegintijd(Date begintijd){
        this.begintijd = begintijd;
    }

    public Date setEindtijd() {
        return eindtijd;
    }

    public void getEindtijd(Date eindtijd){
        this.eindtijd = eindtijd;
    }
}