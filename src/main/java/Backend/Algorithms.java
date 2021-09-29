/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Neeraavr
 */
public class Algorithms {
    private static String file_Path = "data\\scrambles.txt";
    private static String algorithms_File_Path = "data\\algorithms.txt";
    
    public static String get_Scramble(int scramble_Num){
        String scramble = "";
        try {
            Scanner sc = new Scanner(new File(file_Path));
            for(int i = 0; i < scramble_Num - 1; i++){
                sc.nextLine();
            }
            scramble = sc.nextLine();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
        }
        return scramble;
    }
    
    
    public static String [] get_LL_Algorithms(String alg_Name){
        try {
            Scanner sc = new Scanner(new File(algorithms_File_Path));
            String line = "";
            String scramble = "";
            String solution = "";
            String [] algorithms = {"",""};
            
            while(!line.equalsIgnoreCase(alg_Name)){
                line = sc.nextLine();
                }
            
                    scramble = sc.nextLine();
                    solution = sc.nextLine();
                    sc.close();
            
                algorithms[0] = scramble;
                algorithms[1] = solution;
                return algorithms;
            
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");            
        }
        return null;
    }
    
           
}
