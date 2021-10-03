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
        
                public static String convert_To_Stopwatch(int milliseconds){
                int arr_Length = get_Num_Times();
                int minutes = (milliseconds/1000)/60;
                int mins_to_Remove = minutes * 60000;
                int seconds =(milliseconds/1000)%60;
                int seconds_to_remove = seconds * 1000;
                
                int ms = milliseconds - mins_to_Remove - seconds_to_remove;
                
                String output = minutes + ":" + seconds + ":" + ms;

                return output;
                }
                
                public static int convert_To_Ms(String stopwatch_Time){
                    Scanner sc = new Scanner(stopwatch_Time).useDelimiter(":");
                    int minutes_to_ms = Integer.parseInt(sc.next()) * 60000;
                    int seconds_to_ms = Integer.parseInt(sc.next()) * 1000;
                    int ms = Integer.parseInt(sc.next());
                    
                    int total_ms = minutes_to_ms  + seconds_to_ms + ms;
                    return total_ms;
                }
                
                    //num solves is the number of solves we want to take into consideration whilst calculating an average
                public static String get_average_of(int num_Solves){
                try {   
                        if(get_Num_Times() == 0){
                            return "0";
                        }
                        
                        int time = 0;
                        int total_Time_Ms = 0;
                        int avg_Time_ms = 0;
                        String avg_Time_String = "";
                        int travel = get_Num_Times() - num_Solves;
                        Scanner sc = new Scanner(new File(file_Path));
                        for(int i = 0 ; i < travel-1 ; i++){
                            sc.nextLine();
                        }
                        while(sc.hasNextLine()){
                            time = convert_To_Ms(sc.nextLine());
                            total_Time_Ms+= time; 
                            time = 0;
                        }
                        
                        avg_Time_ms = total_Time_Ms / num_Solves;
                        System.out.println(avg_Time_ms);
                        avg_Time_String = convert_To_Stopwatch(avg_Time_ms);
                        
                        return avg_Time_String;
        } catch (FileNotFoundException ex) {
                    System.out.println("FILE NOT FOUND");
        }
                return null;
                }
                
                
              
                
        public static void main(String[] args) {
            String time = get_average_of(3);
            System.out.println(time);
    }
}

