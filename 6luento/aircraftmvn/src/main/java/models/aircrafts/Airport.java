package models.aircrafts;

import java.util.ArrayList;
import java.util.List;

public class Airport {

  String name;
  List<Flight> flights=new ArrayList<Flight>();
  
  
  public void setName(String name){
    this.name=name;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void addFlight(Flight flight){
    this.flights.add(flight);
  }
  
  public Flight getFlightFromList(int ordernumber) throws Exception{
    if (ordernumber>this.flights.size()-1){
      throw new Exception("There are not so many flights");
    }
    if (ordernumber<0){
      throw new Exception("Order number must be positive");
    }
    return flights.get(ordernumber);
  }

    @Override
    public String toString() {
        return "Airport{" + "name=" + name + ", flights=" + flights + '}';
    }
  
  

}
