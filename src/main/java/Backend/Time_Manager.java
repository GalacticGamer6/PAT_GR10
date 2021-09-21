/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Neeraav Ranjit
 */
public class Time_Manager {
    
    private static String file_Path = "data\\solve_Times.txt";
    
    //gets the last 10 Solves
    
	public static String get_Times() {
		try {
			Scanner sc = new Scanner(new File(file_Path));
			String output = "";

			while (sc.hasNextLine()) {
				output += sc.nextLine() + "\n";
			}
			sc.close();
			return output;
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
			return null;
		}
	}
        
	public static void add_Time(int Milliseconds) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(file_Path, true));
			pw.println(Milliseconds);
			pw.close();
		} catch (IOException ex) {
			System.out.println("Could not write to file");
		}
	}
}

