package ro.model.java;

public class Pardoseala {
    private double latime;
    private double lungime;

    @Override
    public String toString() {
        return "Pardoseala{" +
                "latime=" + latime +
                ", lungime=" + lungime +
                '}';
    }

    public Pardoseala(double latime, double lungime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }
}
