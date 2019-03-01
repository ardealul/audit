package ro.model.java;

import java.io.Serializable;
import java.util.List;

public class Apartament implements Serializable {
    private double suprafataUtila;
    private double inaltimea;
    private List<Pardoseala> listaPardoseala;
    private List<Perete> listaPereti;

    public Apartament(double suprafataUtila, double inaltimea, List<Pardoseala> listaPardoseala, List<Perete> listaPereti, Zona zona) {
        this.suprafataUtila = suprafataUtila;
        this.inaltimea = inaltimea;
        this.listaPardoseala = listaPardoseala;
        this.listaPereti = listaPereti;
        this.zona = zona;
    }

    public Apartament() {

    }

    public Apartament(List<Perete> listaPereti) {
        this.listaPereti=listaPereti;
    }

    public double getInaltimea() {
        return inaltimea;
    }

    public void setInaltimea(double inaltimea) {
        this.inaltimea = inaltimea;
    }

    private Zona zona;

    public Zona getZona() {
        return zona;
    }

    public void addPerete(Perete perete){
        listaPereti.add(perete);
    }
    public void addPardoseala(Pardoseala pardoseala){
        this.listaPardoseala.add(pardoseala);
    }
    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public List<Perete> getListaPereti() {
        return listaPereti;
    }




    public void setListaPereti(List<Perete> listaPereti) {
        this.listaPereti = listaPereti;
    }

    public List<Pardoseala> getListaPardoseala() {
        return listaPardoseala;
    }

    public void setListaPardoseala(List<Pardoseala> listaPardoseala) {
        this.listaPardoseala = listaPardoseala;
    }


    @Override
    public String toString() {
        return "Apartament{" +
                "suprafataUtila=" + listaPereti +
                ", listaPardoseala=" + listaPardoseala +
                '}';
    }




    public double getSuprafataUtila() {
        return suprafataUtila;
    }

    public void setSuprafataUtila(double suprafataUtila) {
        this.suprafataUtila = suprafataUtila;
    }


}
