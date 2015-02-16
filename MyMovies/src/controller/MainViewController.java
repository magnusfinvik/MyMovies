package controller;

import java.io.FileNotFoundException;

import business.MyMovie;

public class MainViewController {
	
	public void addToFavorite(MyMovie movie) throws FileNotFoundException{
		//Hver gang den skriver inn noe nytt til favoriter sletter den det gamle
		java.io.PrintWriter writeToFile = new java.io.PrintWriter("favorite.txt");
		writeToFile.println(movie.getId()+": "+movie.getTitle());
		writeToFile.close();
	}
	

}
