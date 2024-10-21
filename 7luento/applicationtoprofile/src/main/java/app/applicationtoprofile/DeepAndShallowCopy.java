package app.applicationtoprofile;

import app.applicationtoprofile.model.Aircraft;


public class DeepAndShallowCopy {

    public static void main (String[] args) {
        try {
            //doReference();
            //doShallowCopy();
            doDeepCopy();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Kloonaus epäonnistui "+ex.getMessage());
        }
    }

    /**
     * toka viittaa ekaan, jolloin oikeasti luomme vain yhden ilmentymän.
     * Kun ekan j�senmuuttujia muutetaan, myös tokan jäsenmuuttujat muuttuvat.
     * @throws CloneNotSupportedException 
     */
    
   public static void doReference() throws CloneNotSupportedException {
        System.out.println("******reference other object*****************");
        Aircraft eka = new Aircraft("Boeing 737", 700);
        eka.getBlackBox().setData("New data");
        Aircraft toka = eka;
        eka.setAircraftType("muutettu");
        eka.setMaxNumberOfPassengers(900);
        eka.getBlackBox().setData("Data changed!");
        System.out.println("eka: "+eka.toString());
        System.out.println("toka viittaus: "+toka.toString());
        System.out.println("*************************************");
    }

    
    
    /**
     * Kun koodi ajetaan luodaan kaksi ilmentymää = instanssi 
     * Aircraft-luokasta, mutta vain yksi ilmentymä BlackBoxista.
     * 
     * Kun koodi ajetaan. 
     
     * Aircraft -luokasta tulee 2 ilmentymää
     * BlackBox-luokasta tulee 1 ilmentymä, jonka molemmat Aircraftit jakavat.
     * 
     * @throws CloneNotSupportedException 
     */
    
    public static void doShallowCopy() throws CloneNotSupportedException {
        System.out.println("******shallow copy*****************");
        Aircraft eka = new Aircraft("Boeing 737", 700);
        eka.getBlackBox().setData("New data");
        Aircraft toka = (Aircraft) eka.clone();
        eka.setAircraftType("muutettu");
        eka.setMaxNumberOfPassengers(900);
        eka.getBlackBox().setData("Data changed!");
        System.out.println("eka: "+eka.toString());
        System.out.println("toka shallow copy: "+toka.toString());
        System.out.println("*************************************");
    }

       /**
     * Kun koodi ajetaan luodaan kaksi ilmentymää = instanssi 
     * Aircraft-luokasta. Kun aircraft-luokka kopioidaan, sille luodaan
     * uusi blackbox-ilmentymä, jolle laitetaan sama data kuin alkuperäiselle.
     * created-jäsenmuuttujalle annetaan arvo, kun jäsenmuuttuja luodaan, 
     * jotta vertailu olisi helpompaa.
     * 
     * Kun koodi ajetaan. 
     
     * Aircraft -luokasta tulee 2 ilmentym��
     * BlackBox-luokasta tulee 2 ilmentym��
     * 
     */
    
     public static void doDeepCopy() throws CloneNotSupportedException {
        System.out.println("******deep copy*****************");
        Aircraft eka = new Aircraft("Boeing 737", 700);
        eka.getBlackBox().setData("New data");
        Aircraft toka = eka.copy();
        eka.setAircraftType("muutettu");
        eka.setMaxNumberOfPassengers(900);
        eka.getBlackBox().setData("Data changed!");
        System.out.println("eka: "+eka.toString());
        System.out.println("toka deep copy: "+toka.toString());
        System.out.println("*************************************");
    }
}
