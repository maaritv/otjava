package app.applicationtoprofile.model;

/**
 * Luokan ilmentymä on mahdollista kopioida. Oletuksena kopio on kevytkopio.
 *
 */
public class Aircraft implements Cloneable {

    private String aircraftType;
    //vaihdettu maxNumberOfPassengers aircraft-luokassa seats nimiseksi
    //selkeyden vuoksi
    private int seats;
    private BlackBox blackBox=new BlackBox();
    
    private AircraftModel aircraftModel;

    public Aircraft(String aircraftType, int maxNumberOfPassengers) {
        System.out.println("2. Initialize the new instance of Aircraft.");
        this.aircraftType = aircraftType;
        this.seats = maxNumberOfPassengers;
    }

    public Aircraft() {
        
    }

    /**
     * Create shallow copy. Tämä luo uuden ilmentymän, jonka 
     * jäsenmuuttujille annetaan identtiset arvot kuin alkuperäisellä 
     * objektilla n. Kun alkuperäisen objektin jäsenmuuttujien arvoja sitten 
     * muutetaan, ne eivät välity pintakopiolle. Jos objektilla on kuitenkin 
     * jäsenmuuttujina muita objekteja, oletuksena näistä ei luoda kopiota, 
     * vaan pintkopio sisältääkin viittauksen alkuperäiseen. Jos muuta 
     * halutaan, tämä clone-funktio pitää ylikirjoittaa uudella toteutuksella.
     * Kun koodi ajetaan. 
     
     * Aircraft -luokasta tulee 2 ilmentymää
     * BlackBox-luokasta tulee 1 ilmentymä
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /** Create hard copy. Tämä luo kopion, jossa myös blackbox-jäsenmuuttujasta 
     luodaan uusi ilmentymä. Kun koodi ajetaan. 
     
     * Aircraft -luokasta tulee 2 ilmentymää
     * BlackBox-luokasta tulee 2 ilmentymää 
     **/

    
    public Aircraft copy() {
        Aircraft acraft = new Aircraft();
        acraft.aircraftType=this.aircraftType;
        acraft.seats = this.seats;
        acraft.blackBox=this.blackBox.copy();
        return acraft;
    }

    @Override
    public String toString() {
        return "Aircraft{" + "aircraftType=" + aircraftType + ", seats=" + seats + ", blackBox=" + blackBox + '}';
    }

    

    public void invariant() {
        if (aircraftType == null) {
            throw new IllegalArgumentException("Aircraft type is not set!");
        }
        if (seats <= 0) {
            throw new IllegalArgumentException("Max number of passengers is not valid");
        }
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public BlackBox getBlackBox() {
        return blackBox;
    }

    public void setBlackBox(BlackBox blackBox) {
        this.blackBox = blackBox;
    }

    public AircraftModel getAircraftModel() {
        return aircraftModel;
    }

    public void setAircraftModel(AircraftModel aircraftModel) {
        this.aircraftModel = aircraftModel;
    }
    
    
    


}
