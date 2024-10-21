/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose InputQuestions | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author MVALISUO
 */
public class InputQuestions {
    
    public static void waitForUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type something to resume execution: ");
        String ok = scanner.nextLine();
    }
    
    public static String quit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Haluatko lopettaa: ");
        String response = scanner.nextLine();
        return response;
    }
    
}
