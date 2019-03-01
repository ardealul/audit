package ro.model.java;

public class Fereastra {
    private int idPerete;
    private int id;
    private double inaltime;
    private double latime;

    public int getId() {
        return id;
    }

    public Fereastra(int idPerete, int id, double inaltime, double latime) {
        this.idPerete = idPerete;
        this.id = id;
        this.inaltime = inaltime;
        this.latime = latime;
    }

    public int getIdPerete() {
        return idPerete;
    }

    public void setIdPerete(int idPerete) {
        this.idPerete = idPerete;
    }


    public Fereastra(int id, double latime, double inaltime) {
        this.id = id;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getLatime() {
        return latime;
    }

    @Override
    public String toString() {
        return "Fereastra{" +
                "latime=" + latime +
                ", inaltime=" + inaltime +
                '}';
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public Fereastra(double latime, double inaltime) {
        this.latime = latime;
        this.inaltime = inaltime;
    }
}
