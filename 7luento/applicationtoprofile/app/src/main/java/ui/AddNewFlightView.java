/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import viewmodels.AddNewFlightViewModel;
import utils.Validation;
import java.util.Scanner;

/**
 * Sovelluksen käyttöliittymän näkymä, jolla lisätään uusi lento.
 * 
 * @author MVALISUO
 */
public class AddNewFlightView {

    public static AddNewFlightViewModel createFlight() {
        Scanner scanner = new Scanner(System.in);
        AddNewFlightViewModel fvm = new AddNewFlightViewModel();

        System.out.print("Enter aircraft type: ");
        String flightAircraftType = scanner.nextLine();
        Validation.validateNotEmpty(flightAircraftType);
        fvm.setAircraftType(flightAircraftType);

        System.out.print("Enter max number of passengers: ");
        String flightAircraftMaxPassengers = scanner.nextLine();
        Validation.validateNumber(flightAircraftMaxPassengers);
        fvm.setAircraftMaxNumberOfPassengers(flightAircraftMaxPassengers);

        System.out.print("Enter departure airport code (XXX): ");
        String flightAirportFromName = scanner.nextLine();
        Validation.validateAirportCode(flightAirportFromName);
        fvm.setSourceAirportName(flightAirportFromName);


        System.out.print("Enter destination airport code (XXX): ");
        String flightAirportToName = scanner.nextLine();
        Validation.validateAirportCode(flightAirportToName);
        fvm.setDestinationAirportName(flightAirportToName);


        System.out.print("Enter flight number: ");
        String flightNo = scanner.nextLine();
        Validation.validateNumber(flightNo);
        fvm.setFlightNo(flightNo);

        System.out.print("Enter departure time GMT (HH:mm): ");
        String flightStartTime = scanner.nextLine();
        Validation.validateTime(flightStartTime);
        fvm.setStartTime(flightStartTime);

        System.out.print("Enter arrival time GMT (HH:mm): ");
        String flightEndTime = scanner.nextLine();
        Validation.validateTime(flightEndTime);
        fvm.setEndTime(flightEndTime);

        System.out.print("Enter departure date (YYYY-MM-DD): ");
        String flightStartDate = scanner.nextLine();
        Validation.validateDate(flightStartDate);
        fvm.setStartsDate(flightStartDate);

        System.out.print("Enter arrival date (YYYY-MM-DD): ");
        String flightEndDate = scanner.nextLine();
        Validation.validateDate(flightEndDate);
        fvm.setEndsDate(flightEndDate);

        System.out.print("Enter flight ticket price in euros: ");
        String flightTicketPrice = scanner.nextLine();
        Validation.validateNumber(flightTicketPrice);
        fvm.setFlightTicketPrice(flightTicketPrice);
        
        System.out.println("Lennon kesto on "+fvm.getDuration());
        
        return fvm;
    }
}
