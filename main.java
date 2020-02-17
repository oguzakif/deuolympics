package deuolympics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import enigma.console.Console;
import enigma.core.Enigma;


public class main{

	//cn.getTextWindow().output();
	public static enigma.console.Console cn = Enigma.getConsole("Game",80,30,12,0);
	//READ FILE
	public static String reader(String filename) {
		String data = "";
		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				data += myReader.nextLine() + "-";
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return data;
	}
	// MAIN
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a file name.");
		String filename = scn.next();
		String data = "";
		int choice;
		data = reader(filename);
		System.out.println("***MENU***");
		System.out.println("1-Generate Fixture");
		System.out.println("2-Perform tournaments");
		System.out.println("3-Show statistics");
		System.out.println("Enter your choice: ");
		do{
			choice = scn.nextInt();
			if(!(choice >=1 && choice <=3))
			System.out.println("Wrong menu number error. Please enter a valid character.");
		}while (!(choice >= 1 && choice <= 3));
		String[] lines = data.split("-");
		athlete[] athletes = new athlete[lines.length];
		for(int i =0;i<lines.length;i++){
			String[] person = lines[i].split(",");
			athletes[i] = new athlete((String) (person[0]),(String) (person[1]),(String) (person[2]),(String) (person[3]),(String) (person[4]),Double.parseDouble().Double(person[5]));
		}
		
		System.out.println(lines[0]);
			
	}
}
