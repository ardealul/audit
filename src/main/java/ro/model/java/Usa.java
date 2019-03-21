package ro.model.java;

public class Usa {
    private int idPerete;
    private int id;
    private double inaltime;
    private double latime;

    public Usa(int idPerete, int id, double inaltime, double latime) {
        this.idPerete = idPerete;
        this.id = id;
        this.inaltime = inaltime;
        this.latime = latime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPerete() {
        return idPerete;
    }

    public void setIdPerete(int idPerete) {
        this.idPerete = idPerete;
    }

    public Usa(int id, double latime, double inaltime) {
        this.id = id;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        return "Usa{" +
                "latime=" + latime +
                ", inaltime=" + inaltime +
                '}';
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public double getLatime() {
        return latime;
    }

    public double getInaltime() {
        return inaltime;
    }

    public Usa(double latime, double inaltime) {
        this.latime = latime;
        this.inaltime = inaltime;
    }
}
