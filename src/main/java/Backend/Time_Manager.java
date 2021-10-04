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
 * @author Neeraav Ranjit   oh hey its me again...
 *                                        This is gonna be a juicy one...
 */
public class Time_Manager {
    //a path to the solve times txt file
    private static String file_Path = "data\\solve_Times.txt";
    
   
        public static int get_Num_Times(){  //legit just reads the amount of lines in the solve_Times text files and returns it
        //still no cool conventions yet :' (    
        int count = 0;
        
        try {
             Scanner sc = new Scanner(new File(file_Path));
            //increases count every time there's a next line with text
             while(sc.hasNextLine()){
                     sc.nextLine();
                     count++;
            }
             
        return count;
            
            } catch (FileNotFoundException ex) {
                System.out.println("file Not Found");
            }
                return 0; //idk just doing stuff so the machine is happy, but this case will never be reached so its all good
        }
                  
                  
                
        
        
                //sounds simple enough righ?
	public static String get_Times() {

                                int i = 0;
		try {
			Scanner sc = new Scanner(new File(file_Path));
			String output = "";

			while (sc.hasNextLine()) {
                                                                output += "#" + (i+1)  + "\t" +  sc.nextLine() + "\n";
                                                                i++;
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
                
                //converts the Milliseconds stored in the solve times file and converts it to stopwatch time(minutes:seconds:milliseconds) used to display times in a reafable format
                public static String convert_To_Stopwatch(int milliseconds){
                
                int minutes = (milliseconds/1000)/60;
                int mins_in_ms = minutes * 60000;   //subtracted from ms in order to get remainder ms
                
                int seconds = (milliseconds/1000)%60;
                int seconds_in_ms = seconds * 1000; //subtrated from ms in order to get remainader ms
                
                int ms = milliseconds - mins_in_ms - seconds_in_ms;
                //prints this out in a super smexy manner
                String output = minutes + " " + ":" + " " + seconds + " " + ":"  + " " + ms;

                return output;
                }
                
                //similar yet different :<
                public static int convert_To_Ms(String stopwatch_Time){     //takes in a stopwatch formatted time string either from the timer on the ui or from the times text file
                    
                    Scanner sc = new Scanner(stopwatch_Time);
                    sc.useDelimiter(" : "); //breaks up into tokens of mm ss msms
                   
                    int minutes_to_ms = Integer.parseInt(sc.next()) * 60000; //gets the minutes and converts to ms 1000* 60 ms in a min
                    int seconds_to_ms = Integer.parseInt(sc.next()) * 1000;// gets the seconds and converts to ms 1000 ms in a sec
                    int ms = Integer.parseInt(sc.next()); // gets ms
                    
                    int total_ms = minutes_to_ms  + seconds_to_ms + ms; //give em a good ol wangJangle
                    return total_ms;
                }
                
//            num solves is the number of solves we want to take into consideration whilst calculating an average  
                public static String get_average_of(int num_Solves){
                    
                    int time = 0;
                    int total_Time_Ms = 0;
                    int avg_Time_ms = 0;
                    String avg_Time_String = "";
                    
                try {   
                        if(get_Num_Times() == 0){
                            return "0 : 00 : 000";
                        }
                        
                        //cakcukating the disatacne foe the scanner to find the latest solves to be used in avg    
                        int travel = get_Num_Times() - num_Solves;
                        Scanner sc = new Scanner(new File(file_Path));
                        
                        //travelling to the times
                        for(int i = 0 ; i < travel ; i++){
                            sc.nextLine();
                        }
                        
                        //converting the remainder lines into ms and adding into total_Time_Ms
                        while(sc.hasNextLine()){
                            String temp = sc.nextLine();
                            time = convert_To_Ms(temp);
                            total_Time_Ms+= time; 
                            time = 0; // re initializing time
                        }
                        
                        avg_Time_ms = total_Time_Ms / num_Solves;       //calculating the average in ms
                        avg_Time_String = convert_To_Stopwatch(avg_Time_ms);    //converting avg in ms into stopwatch format
                        
                        return avg_Time_String;
        } catch (FileNotFoundException ex) {
                    System.out.println("FILE NOT FOUND");
        }
                return null;
                }
        
                
                
         //just a nice debug and for users to get rid of a messy text field           
         public static void clear_Times(){
                try {
                    PrintWriter pw = new PrintWriter(new FileWriter(file_Path, false));
                    pw.print("");
                    pw.close();
                    
                //made a printriter which has a filewriter which is set to not append to the current contents of the file and rather replace with null
                } catch (IOException ex) {
                    System.out.println("file NOT FOND");
                }
        }       
              
        public static void main(String[] args) {
            String idk = get_average_of(12);
            System.out.println(idk);
    }
        
}

