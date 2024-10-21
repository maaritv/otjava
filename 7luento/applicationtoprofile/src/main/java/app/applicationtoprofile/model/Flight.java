package app.applicationtoprofile.model;

import java.sql.Timestamp;

public class Flight {

    private Timestamp startsTimestamp;
    private Timestamp endsTimestamp;
    private String flightNo;
    private Aircraft aircraft = new Aircraft();
    private Airport startAirport = new Airport();
    private Airport destinationAirport = new Airport();
    private double flightTicketPrice;
    private String status;

    public Timestamp getStartsTimestamp() {
        return startsTimestamp;
    }

    public void setStartsTimestamp(Timestamp startsTimestamp) {
        this.startsTimestamp = startsTimestamp;
    }

    public Timestamp getEndsTimestamp() {
        return endsTimestamp;
    }

    public void setEndsTimestamp(Timestamp endsTimestamp) {
        this.endsTimestamp = endsTimestamp;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Airport getStartAirport() {
        return startAirport;
    }

    public void setStartAirport(Airport startAirport) {
        this.startAirport = startAirport;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public double getFlightTicketPrice() {
        return flightTicketPrice;
    }

    public void setFlightTicketPrice(double flightTicketPrice) {
        this.flightTicketPrice = flightTicketPrice;
    }

    @Override
    public String toString() {
        return "Flight{" + "startsTimestamp=" + startsTimestamp + ", endsTimestamp=" + endsTimestamp + ", flightNo=" + flightNo + ", aircraft=" + aircraft + ", startAirport=" + startAirport + ", destinationAirport=" + destinationAirport + ", flightTicketPrice=" + flightTicketPrice + '}';
    }

    public double calculateMaximumTicketProfit() {
        return ((double) (this.aircraft.getSeats()) * flightTicketPrice);
    }

    public void checkStartAndEndTimestamps() throws Exception {
        if (this.getDurationInMinutes()<0){
            throw (new Exception("Lennon kesto ei voi olla negatiivinen!"));
        }
    }

    /**
     * TODO: Miten toteuttaisit tämän funktion?
     *
     * @return
     */
    public boolean isInTheAir() {
        return true;
    }

    /**
     * Tarkista luokan tila, ett� lenolla on pituus ja kesto.
     */
    public void invariant() throws Exception {
        checkStartAndEndTimestamps();
        // Additional checks for other members of the flight and associated objects.
        checkAirports();
        startAirport.invariant();
        destinationAirport.invariant();
        aircraft.invariant();
    }

    public void checkAirports() {
        // Check start_airport and destination_airport members.
        if (startAirport.getName().equals(destinationAirport.getName())) {
            throw new IllegalArgumentException("Departure and destination airports cannot be the same!");
        }
    }

    public long getDurationInMinutes() {
        long starts = this.startsTimestamp.getTime();
        long ends = this.endsTimestamp.getTime();
        
        long diffInMs = ends-starts;
        long minutes = diffInMs/1000/60;    //ms = 1000s, 1 min=60s. 1h=60min.
        return minutes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
        
}
