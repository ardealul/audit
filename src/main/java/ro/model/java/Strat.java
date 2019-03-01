package ro.model.java;

public class Strat {
    int id;
    int idPerete;
    String produsBrut;
    String produsDivizat;
    double densitatea;
    double conductivitatea;

    public int getIdPerete() {
        return idPerete;
    }

    public void setIdPerete(int idPerete) {
        this.idPerete = idPerete;
    }

    double grosimea;

    public int getId() {
        return id;
    }

    public Strat(int id,int idPerete, double conductivitatea, double grosimea) {
        this.idPerete = idPerete;
        this.id = id;
        this.conductivitatea = conductivitatea;
        this.grosimea = grosimea;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Strat{" +
                "produsBrut='" + produsBrut + '\'' +
                ", produsDivizat='" + produsDivizat + '\'' +
                ", densitatea='" + densitatea + '\'' +
                ", conductivitatea=" + conductivitatea +
                ", grosimea="+grosimea+
                '}';
    }

    public Strat(String produsBrut, String produsDivizat, double densitatea, double conductivitatea,double grosimea) {
        this.produsBrut = produsBrut;
        this.produsDivizat = produsDivizat;
        this.densitatea = densitatea;
        this.conductivitatea = conductivitatea;
        this.grosimea = grosimea;
    }
    public Strat( double conductivitatea,double grosimea) {
        this.conductivitatea = conductivitatea;
        this.grosimea = grosimea;
    }

    public String getProdusBrut() {
        return produsBrut;
    }

    public void setProdusBrut(String produsBrut) {
        this.produsBrut = produsBrut;
    }

    public String getProdusDivizat() {
        return produsDivizat;
    }

    public void setProdusDivizat(String produsDivizat) {
        this.produsDivizat = produsDivizat;
    }

    public double getDensitatea() {
        return densitatea;
    }

    public void setDensitatea(double densitatea) {
        this.densitatea = densitatea;
    }

    public double getConductivitatea() {
        return conductivitatea;
    }

    public double getGrosimea() {
        return grosimea;
    }

    public void setGrosimea(double grosimea) {
        this.grosimea = grosimea;
    }

    public void setConductivitatea(double conductivitatea) {
        this.conductivitatea = conductivitatea;
    }
}
