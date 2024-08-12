package be.digitalcity.demo.java.oo.HeritageOOP;

public interface Amphibie extends Roulant, Navigable {

    /*public final static*/ int DEFAULT_DISTANCE = 10;

    boolean getMode();
    void setMode(boolean modeAquatique);

}