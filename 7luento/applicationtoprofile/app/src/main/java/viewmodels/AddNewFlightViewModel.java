package viewmodels;

import java.sql.Timestamp;
import model.Flight;

public class AddNewFlightViewModel {

    private String startsDate;
    private String endsDate;
    private String startsTime;
    private String endsTime;

    private String flightNo;
    private String flightTicketPrice;

    private String aircraftType;
    private String aircraftMaxNumberOfPassengers;

    private String sourceAirportName;
    private String destinationAirportName;

    private Flight flight=new Flight();

    public String getStartsDate() {
        return startsDate;
    }

    public void setStartsDate(String startsDate) {
        this.startsDate = startsDate;
        if (this.startsTime != null && this.startsDate != null) {
            this.flight.setStartsTimestamp(Timestamp.valueOf(this.startsDate + " " + this.startsTime+":00"));
        }
    }

    public String getEndsDate() {
        return endsDate;
    }

    public void setEndsDate(String endsDate) {
        this.endsDate = endsDate;
        if (this.endsTime != null && this.endsDate != null) {
            this.flight.setEndsTimestamp(Timestamp.valueOf(this.endsDate + " " + this.endsTime+":00"));
        }
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
        this.flight.setFlightNo(flightNo);
    }

    public String getFlightTicketPrice() {
        return flightTicketPrice;
    }

    public void setFlightTicketPrice(String flightTicketPrice) {
        this.flightTicketPrice = flightTicketPrice;
        this.flight.setFlightTicketPrice(Double.parseDouble(this.flightTicketPrice));
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
        this.flight.getAircraft().setAircraftType(aircraftType);
    }

    public String getAircraftMaxNumberOfPassengers() {
        return aircraftMaxNumberOfPassengers;
    }

    public void setAircraftMaxNumberOfPassengers(String aircraftMaxNumberOfPassengers) {
        this.aircraftMaxNumberOfPassengers = aircraftMaxNumberOfPassengers;
        this.flight.getAircraft().setNumberOfSeats(Integer.parseInt(this.aircraftMaxNumberOfPassengers));
    }

    public String getSourceAirportName() {
        return sourceAirportName;
    }

    public void setSourceAirportName(String sourceAirportName) {
        this.sourceAirportName = sourceAirportName;
        this.flight.getStartAirport().setName(this.sourceAirportName);
    }
    
    public String getDestinationAirportName() {
        return destinationAirportName;
    }

    public void setDestinationAirportName(String destinationAirportName) {
        this.destinationAirportName = destinationAirportName;
        this.flight.getDestinationAirport().setName(this.destinationAirportName);
    }


    public Flight getFlight() {
        return flight;
    }

    public void setStartTime(String flightStartTime) {
        this.startsTime = flightStartTime;
        if (this.startsTime != null && this.startsDate != null) {
            this.flight.setStartsTimestamp(Timestamp.valueOf(this.startsDate + " " + this.startsTime+":00"));
        }
    }

    public void setEndTime(String flightEndTime) {
        this.endsTime = flightEndTime;
        if (this.endsTime != null && this.endsDate != null) {
            this.flight.setEndsTimestamp(Timestamp.valueOf(this.endsDate + " " + this.endsTime+":00"));
        }
    }

    public String getDuration() {
        long durationInMinutes = this.flight.getDurationInMinutes();
        double hours = (double)durationInMinutes/(double)60;  //result is most probably decimal number
        double fullHours = Math.floor(hours);
        double minutes = (hours - fullHours)*60;
        return fullHours+" tuntia ja "+minutes+" minuttia";
    }

}
