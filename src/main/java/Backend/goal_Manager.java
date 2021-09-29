package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class goal_Manager {

    private static String goals_File_Path = "data\\goals.txt";
    private static String completed_Goals_File_Path = "data\\completed_Goals.txt";

    public static int get_Num_Goals() {
        int count = 0;
        try {
            Scanner sc = new Scanner(new File(goals_File_Path));
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }
        return count;
    }

    public static int get_Num_Completed_Goals() {

        int count = 0;
        try {
            Scanner sc = new Scanner(new File(completed_Goals_File_Path));
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }
        return count;
    }

    public static String[] get_Goals() {

        int i = 0;
        int length = get_Num_Goals();

        String output = "";
        String[] goals = new String[length];
        Scanner sc;

        try {
            sc = new Scanner(new File(goals_File_Path));

            while (sc.hasNextLine()) {
                output = sc.nextLine();
                goals[i] = output;
                i++;

            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        }

        return goals;
    }

    public static String[] get_Completed_Goals() {

        int i = 0;
        int length = get_Num_Completed_Goals();
        String output = "";
        String[] completed_Goals = new String[length];
        Scanner sc;

        try {
            sc = new Scanner(new File(completed_Goals_File_Path));
                    
            while (sc.hasNextLine()) {
                output = sc.nextLine();
                completed_Goals[i] = output;
                i++;
            }
             
            return completed_Goals;
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        }

        return completed_Goals;
    }

	public static void complete_Goal(String selected_Goal) {
		try {
			Scanner sc = new Scanner(new File(goals_File_Path));
			String output = "";
			String current_Goal = "";

			while (sc.hasNextLine()) {
				current_Goal = sc.nextLine();
				if (!current_Goal.equalsIgnoreCase(selected_Goal)) {
					output += current_Goal + "\n";
				}
			}
			sc.close();

			PrintWriter pw = new PrintWriter(new FileWriter(goals_File_Path, false));
			pw.print(output);
			pw.close();
                                                PrintWriter pw2 = new PrintWriter(new FileWriter(completed_Goals_File_Path,true));
                                                pw2.print(selected_Goal + "\n") ;
                                                pw2.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Students file not found");
		} catch (IOException ex) {
			System.out.println("Could not delete student");
		}
	}
        
}
