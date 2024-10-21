package applicationtoprofile;

import model.Flight;
import ui.AddNewFlightView;
import viewmodels.AddNewFlightViewModel;


public class Main {


/**
 * Oppimistavoitteet:
 * Luokat ja tietomalli
 * Objektien pintakopiointi ja syvakopiointi (deep copy, shallow copy)
 * Pass by value
 * Objektivittausten valittaminen arvona.
 * Profilointi:
 * luokkien ilmentymät
 * staattisten funktioiden kayttö
 * <p>
 * The Java programming language does not pass objects by reference;
 * it passes object references by value. Because two copies of the same
 * reference refer to the same actual object, changes made through one
 * reference variable are visible through the other.
 * There is exactly one parameter passing mode -- pass by value -- James Gossling (Creator of Java)
 */

    public static void main(String[] args) {
        try {
            //Käyttöliittymä on erotettu omaan sovellukerrokseensa (ui-paketti)
           String createStatus="ADDED";
           AddNewFlightViewModel addNewFlightViewModel = AddNewFlightView.createFlight();
           Flight myFlight = addNewFlightViewModel.getFlight();
           int savingStatus = saveNewFlight(myFlight, createStatus);
           System.out.println("Saving status "+savingStatus);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Virhe lentoa lisättäessä " + e.getMessage());
        }
    }
    
    /**
     * Kutsuttaessa saveNewFlight-funktiota. Javassa 
     * muodostuu viittaus alkuperäoseen myFlight-ilmentymään
     * status-argumentistä luodaan sen sijaan kopio, 
     * jonka arvoja kutsuttava funktio voi muuttaa ilman että 
     * alkuperäinen status-muuttujan arvo muuttuu.
     * 
     * @param myFlight
     * @param status
     * @return
     * @throws Exception 
     */

    private static int saveNewFlight(Flight myFlight, String status) throws Exception {
        System.out.println("Checking each parameter for validity...");
        myFlight.invariant();
        System.out.println("When you've taken the Database programming course, you'll know how to persist the flight data.");
        System.out.println(myFlight.toString());
        status="CREATED";
        myFlight.setStatus(status);
        return 0;
    }

}
