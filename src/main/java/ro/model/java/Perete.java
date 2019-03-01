package ro.model.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Perete {

    private Integer id;
    private double latime;
    private double inaltime;
    private PunctCardinal punctCardinal;
    private List<Fereastra> listaFerestre = new ArrayList<>();
    private List<Usa> listaUsa = new ArrayList<>();
    private List<Strat> listaStraturi = new ArrayList<>();
    private TipPerete tipPerete;

    public int getId() {
        return id;
    }

    public Perete(int id, double latime, double inaltime, PunctCardinal punctCardinal, TipPerete tipPerete) {
        this.id = id;
        this.latime = latime;
        this.inaltime = inaltime;
        this.punctCardinal = punctCardinal;
        this.tipPerete = tipPerete;
    }

    public void setId(int id) {
        this.id = id;
    }




    public Perete(int id,double latime, double inaltime, PunctCardinal punctCardinal, List<Fereastra> listaFerestre, List<Usa> listaUsa, List<Strat> listaStraturi, TipPerete tipPerete) {
        this.id=id;
        this.latime = latime;
        this.inaltime = inaltime;
        this.punctCardinal = punctCardinal;
        this.listaFerestre = listaFerestre;
        this.listaUsa = listaUsa;
        this.listaStraturi = listaStraturi;
        this.tipPerete = tipPerete;
    }
    public Perete() {

    }
    @Override
    public String toString() {
        return "Perete{" +
                "latime=" + latime +
                ", inaltime=" + inaltime +
                ", punctCardinal=" + punctCardinal +
                ", listaFerestre=" + listaFerestre +
                ", listaUsa=" + listaUsa +
                ", listaStraturi=" + listaStraturi +
                ", tipPerete=" + tipPerete +
                '}';
    }

    public TipPerete getTipPerete() {
        return tipPerete;
    }

    public void setTipPerete(TipPerete tipPerete) {
        this.tipPerete = tipPerete;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Perete other = (Perete) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public List<Strat> getListaStraturi() {
        return listaStraturi;
    }

    public void setListaStraturi(List<Strat> listaStraturi) {
        this.listaStraturi = listaStraturi;
    }
    public void addStrat(Strat strat){
        this.listaStraturi.add(strat);
    }
    public void addFereastra(Fereastra fereastra){
        this.listaFerestre.add(fereastra);
    }
    public void deleteFereastra(Fereastra fereastra){
        this.listaFerestre.remove(fereastra);
    }
    public void addUsa(Usa usa){
        this.listaUsa.add(usa);
    }
    public void deleteUsa(Usa usa){
        this.listaUsa.remove(usa);
    }
    public void deleteStrat(Strat strat){
        this.listaStraturi.remove(strat);
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public PunctCardinal getPunctCardinal() {
        return punctCardinal;
    }

    public void setPunctCardinal(PunctCardinal punctCardinal) {
        this.punctCardinal = punctCardinal;
    }

    public List<Fereastra> getListaFerestre() {
        return listaFerestre;
    }

    public void setListaFerestre(List<Fereastra> listaFerestre) {
        this.listaFerestre = listaFerestre;
    }

    public List<Usa> getListaUsa() {
        return listaUsa;
    }

    public void setListaUsa(List<Usa> listaUsa) {
        this.listaUsa = listaUsa;
    }
}
