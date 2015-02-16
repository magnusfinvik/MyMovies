package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import business.MyMovie;

public class MainViewController {
	
	public void addToFavorite(MyMovie movie) {
		//Hver gang den skriver inn noe nytt til favoriter sletter den det gamle
		PrintWriter writeToFile;
		try {
			writeToFile = new PrintWriter(new FileWriter("favorite.txt", true));
			writeToFile.println(movie.getId()+": "+movie.getTitle());
			writeToFile.close();
		} catch (IOException e) {
		System.out.println("could not add to favorite");
		}
	}
	public String getFavorites(){
		//Returnerer ingen ting
		try {
			FileReader readFav = new FileReader("favorite.txt");
			Scanner scanFavorite = new Scanner(readFav);
			String returnString = "";
			while(scanFavorite.hasNextInt()){
			String temp = scanFavorite.nextLine();
			returnString = returnString+"\n"+temp;
			}
			return returnString;
		} catch (FileNotFoundException e) {
			System.out.println("Could not fine Favorite text file");
			return"-1";
		}
	}

}
