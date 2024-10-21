/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardOpenOption.APPEND;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MVALISUO
 */
public class FileUtils {

    /**
     *
     * In static synchronization, lock access is on the class not on object and
     * Method.
     */
    synchronized public static void writeDataToFileStaticSynchronization(String data, String filePath) {
        //writeWithFiles(data, filePath);
        doWriting(data, filePath);
    }

    public synchronized void writeDataToFileThreadSafe(String data, String filePath) {
        doNotStaticWriting(data, filePath);
    }

    public void writeDataToFileNotThreadSafe(String data, String filePath) {
        doNotStaticWriting(data, filePath);
    }

    private static void doWriting(String data, String filePath) {
        File file = new File(filePath);
        FileOutputStream fs;
        try {
            fs = new FileOutputStream(file, true);
            fs.write(data.getBytes());
            Thread.sleep(1000);
            fs.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Virhe tiedoston kirjoituksessa " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IO Virhe tiedoston kirjoituksessa " + ex.getMessage());
        } catch (InterruptedException ex) {
            System.out.println("Sleept Virhe tiedoston kirjoituksessa " + ex.getMessage());
        }
    }
    
        private void doNotStaticWriting(String data, String filePath) {
        File file = new File(filePath);
        FileOutputStream fs;
        try {
            fs = new FileOutputStream(file, true);
            fs.write(data.getBytes());
            Thread.sleep(1000);
            fs.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Virhe tiedoston kirjoituksessa " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IO Virhe tiedoston kirjoituksessa " + ex.getMessage());
        } catch (InterruptedException ex) {
            System.out.println("Sleept Virhe tiedoston kirjoituksessa " + ex.getMessage());
        }
    }

    private static void writeWithFiles(String data, String filePath) {
        try {
            Files.write(Path.of(filePath), data.getBytes(), APPEND);
            Thread.sleep(1000);
        } catch (Exception ex) {
            System.out.println("Virhe tiedoston kirjoituksessa " + ex.getMessage() + " " + ex.getClass().getName());
        }
    }

}
