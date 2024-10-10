package models.aircrafts;

import java.util.Date;

public class Aircraft implements Cloneable {
    // Private member variables
    private String aircraftType;
    private int maxNumberOfPassengers;
    private BlackBox blackBox;

    // Constructor
    public Aircraft(String aircraftType, int maxNumberOfPassengers) {
        this.aircraftType = aircraftType;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
        this.blackBox=new BlackBox("", new Date());
    }

    // Getters and Setters
    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public BlackBox getBlackBox() {
        return blackBox;
    }

    public void setBlackBox(BlackBox blackBox) {
        this.blackBox = blackBox;
    }

    // Shallow copy (using clone method)
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy
    }

    // Deep copy (custom implementation)
    public Aircraft copy() {
        BlackBox newBlackBox = new BlackBox(this.blackBox.getData(), (Date) this.blackBox.getCreated().clone());
        Aircraft newAircraft = new Aircraft(this.aircraftType, this.maxNumberOfPassengers);
        newAircraft.setBlackBox(newBlackBox);
        return newAircraft;
    }

    public Aircraft copyf() throws CloneNotSupportedException {
        BlackBox clonedBlackBox = (BlackBox) this.blackBox.clone();
        Aircraft newAircraft = new Aircraft(this.aircraftType, this.maxNumberOfPassengers);
        newAircraft.setBlackBox(clonedBlackBox);
        return newAircraft;
    }

    // toString method for easier printing
    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftType='" + aircraftType + '\'' +
                ", maxNumberOfPassengers=" + maxNumberOfPassengers +
                ", blackBox=" + blackBox +
                '}';
    }
}
