import models.aircrafts.Aircraft;

/**
 * OLIO-OHJELMOINTI II
 */

public class TestCloneAircraft {

    public static void main (String[] args) throws CloneNotSupportedException {
        Aircraft first = new Aircraft("Boeing 737", 500);
        System.out.println("First when created\t"+first.toString());
        Aircraft second = first.copy();

        //Mikään ensimmäiseen lentokoneeseen kohdistuva
        //muutos ei vaikuta kopioon.
        first.setAircraftType("boeing 747");
        first.setMaxNumberOfPassengers(600);
        first.getBlackBox().setData("some data here");
        first.getBlackBox().setCreated(null);

        System.out.println("Second now\t"+second.toString());
    }
}
