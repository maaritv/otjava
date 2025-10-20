package models.aircrafts;



public class Flight {

    String description;
    Aircraft aircraft;
    
    public String getDescription(){
      return this.description;
    }
    
    public void setDescription(String description){
        this.description=description;
    }
    
    public void setAircraft(Aircraft aircraft){
      this.aircraft=aircraft;
    }
    
    public Aircraft getAircraft(){
      return this.aircraft;
    }

    @Override
    public String toString() {
        return "Flight{" + "description=" + description + ", aircraft=" + aircraft + '}';
    }
    
    
   
}
