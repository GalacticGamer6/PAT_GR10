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
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Neeraav Ranjit
 */
public class Time_Manager {
    
    private static String file_Path = "data\\solve_Times.txt";
    
    //gets the last 10 Solves
                  public static int get_Num_Times(){
                      int count = 0;
        try {
            Scanner sc = new Scanner(new File(file_Path));
            
            while(sc.hasNextLine()){
                sc.nextLine();
                count++;
            }
            return count;
            
        } catch (FileNotFoundException ex) {
            System.out.println("file Not Found");
        }
                      
                  }
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
        
                public static void convert_Time(){
                    
                Scanner sc = new Scanner();
                while(sc.hasNextLine()){
                    
                }
                int arr_Length = get_Num_Times();
                int ms = 216823;
                int minutes = (ms/1000)/60;
                int mins_to_Remove = minutes * 60000;
                int seconds =(ms/1000)%60;
                int seconds_to_remove = seconds * 1000;
                
                ms = ms - mins_to_Remove - seconds_to_remove;
                
                String output = minutes + ":" + seconds + ":" + ms;                
                }
        
              
                
        public static void main(String[] args) {
        convert_Time();
    }
}

