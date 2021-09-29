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
                      return 0;
                  }
	public static String get_Times() {
                                String [] times_Arr = new String[get_Num_Times()];
                                int i = 0;
		try {
			Scanner sc = new Scanner(new File(file_Path));
			String output = "";

			while (sc.hasNextLine()) {
                                                                times_Arr[i] = sc.nextLine();
                                                                i++;
			}
                                                for(int j = times_Arr.length - 1; j>=0 ; j--){
                                                    output += times_Arr[j] + "\n";
                                                }
			sc.close();
			return output;
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
			return null;
		}
	}
        
	public static void add_Time(String Milliseconds) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(file_Path, true));
			pw.println(Milliseconds);
			pw.close();
		} catch (IOException ex) {
			System.out.println("Could not write to file");
		}
	}
        
                public static String convert_Time(int milliseconds){
                int arr_Length = get_Num_Times();
                int minutes = (milliseconds/1000)/60;
                int mins_to_Remove = minutes * 60000;
                int seconds =(milliseconds/1000)%60;
                int seconds_to_remove = seconds * 1000;
                
                int ms = milliseconds - mins_to_Remove - seconds_to_remove;
                
                String output = minutes + ":" + seconds + ":" + ms;

                return output;
                }
        
              
                
//        public static void main(String[] args) {
//            
//            System.out.println(get_Num_Times());
//    }
}

