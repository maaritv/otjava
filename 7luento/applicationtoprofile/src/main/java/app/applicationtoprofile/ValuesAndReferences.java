package app.applicationtoprofile;

import app.applicationtoprofile.model.Aircraft;
import app.applicationtoprofile.model.AircraftModel;


public class ValuesAndReferences {
    
    
    public static void main (String[] agrs){
    
        AircraftModel boeing = getMyAircraftModel();
        
        Aircraft boeingToRome = new Aircraft();
        boeingToRome.setAircraftModel(boeing);
        System.out.println("Roomaan saa lentää enintään "+boeingToRome.getAircraftModel().getMaxNumberOfPassangers()+" passangers.");
        
        Aircraft boeingToParis = new Aircraft();
        boeingToParis.setAircraftModel(boeing);
        System.out.println("Pariisiin saa lentää enintään "+boeingToParis.getAircraftModel().getMaxNumberOfPassangers()+" passangers.");
        
        increaseNumberOfAllowedPassangersBy(boeing, 20);
        
        System.out.println("Roomaan saa lentää enintään "+boeingToRome.getAircraftModel().getMaxNumberOfPassangers()+" passangers.");
        System.out.println("Pariisiin saa lentää enintään "+boeingToParis.getAircraftModel().getMaxNumberOfPassangers()+" passangers.");
    }
    
    
    
    
   private static AircraftModel getMyAircraftModel(){  
       AircraftModel myModel = new AircraftModel();
       myModel.setMaxNumberOfPassangers(560);
       myModel.setAircraftModel("454");
       myModel.setVendor("Boeing");
       return myModel;
   }

    private static void increaseNumberOfAllowedPassangersBy(AircraftModel boeing, int i) {
        boeing.setMaxNumberOfPassangers(boeing.getMaxNumberOfPassangers()+i);
    }
    
    
}
