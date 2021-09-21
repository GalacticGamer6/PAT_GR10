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
    private static String file_Path = "data\\normal_Scrambles.txt";
    
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
}
