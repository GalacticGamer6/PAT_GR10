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
 * @author Neeraavr     hey thats me!
 */
public class Algorithms {
    //this is the path to the normal scrambles text files(normal random 3x3 scrambles)
    private static String scrambles_File_Path = "data\\scrambles.txt";
    
    //this is the path to the algorithms text file which contains OLL and PLL algorithms
    private static String algorithms_File_Path = "data\\algorithms.txt";
    
    public static String get_Scramble(int scramble_Num){    //taking in a random number (generated in the UI) in order to randomely chose from one of the 15 scrambles
        //basic variable; no convention :((
        String scramble = "";
            try {
                Scanner sc = new Scanner(new File(scrambles_File_Path));
                //we are traveling to the line right before the line of the scramble travel is determined by the scramble num since we want to go to that scramble
                for(int i = 0; i < scramble_Num - 1; i++){
                     sc.nextLine();
                }
                //getting scramble
                scramble = sc.nextLine();
                } catch (FileNotFoundException ex) {
                        System.out.println("File Not Found");
                }
                return scramble;
    }
    
    
    public static String [] get_LL_Algorithms(String alg_Name){
        try {
            Scanner sc = new Scanner(new File(algorithms_File_Path));
            
            //just some variables, nothing special....No underscores here unfortunately :(
            String line = "";
            String scramble = "";
            String solution = "";
            String [] algorithms = {"",""};
            
            //skipping every line in algorithms.txt until we reach the line of the algorithm name
            while(!line.equalsIgnoreCase(alg_Name)){
                    line = sc.nextLine();   //I DUB THE...THE EXPENDABLE VARIABLE!
                }
                    //gets the scramble and solution for the specified case
                    scramble = sc.nextLine();
                    solution = sc.nextLine();
                    sc.close();     //good practise or something idk 
            
                //Dont'cha JUST LOVE ARRAYS!
                //scramble is always saved into the first index of the array
                //solution is always saved into the second index of the array
                algorithms[0] = scramble;
                algorithms[1] = solution;
                
                //ARRRRAAYYYYYY!
                return algorithms;
            
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");            
        }
        return null;
    }
    
           
}
