package ro.model.java;

public enum PunctCardinal {
    S(420),E(210),N(100),W(210),SE(340),SW(340),NE(120),NW(120);
    private int numVal;
    PunctCardinal(int numVal) {
    this.numVal=numVal;
    }
    PunctCardinal() {

    }
    public int getNumVal() {
        return this.numVal;
    }
}
