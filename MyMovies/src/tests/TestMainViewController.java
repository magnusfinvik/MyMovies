package tests;

import static org.junit.Assert.*;
import it.jtomato.gson.Movie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import mediators.WebMediator;

import org.junit.Test;

import repository.WebRepository;
import controller.MainViewController;
import business.MyMovie;
//se om jeg kan forkorte testene og gjøre de mer lesbare, og sjekke om testene går rundt i ring
public class TestMainViewController {
	
	public boolean storeCalled;
	@Test
	public void txtFile_testToSeIfAnTxtFileAllredyExist() throws FileNotFoundException {
		FileReader readFavorite = new FileReader("favorite.txt");
		assertNotNull(readFavorite);
	}
	
	@Test
	public void txtFile_AddMoiveToFavoriteTextFile() throws FileNotFoundException{
		MainViewController controller = new MainViewController();
		MyMovie movie = new MyMovie(new Movie());
		controller.addToFavorite(movie);
		assertEquals();
	}
	
	@Test
	public void txtFile_testGetFavorites() throws FileNotFoundException{
		FileReader readFavorite = new FileReader("favorite.txt");
		WebRepository repo = new WebRepository();
		Scanner readFile = new Scanner(readFavorite);
		MainViewController controll = new MainViewController();
		WebMediator test = new WebMediator();
		ArrayList<MyMovie> movies = repo.getBoxOfficeMovies(3);
		for(MyMovie movie : movies){
			controll.addToFavorite(movie);
		}
		assertEquals("771353298: Kingsman: The Secret Service", controll.getFavorites());
	}
	
	@Test
	//fiks denne testen sin assert
	public void txtFile_AddMoiveToFavoriteTextFile_addThreeMovies() throws FileNotFoundException{
		FileReader readFavorite = new FileReader("favorite.txt");
		WebRepository repo = new WebRepository();
		Scanner readFile = new Scanner(readFavorite);
		MainViewController controll = new MainViewController();
		WebMediator test = new WebMediator();
		ArrayList<MyMovie> movies = repo.getBoxOfficeMovies(3);
		for(MyMovie movie : movies){
			controll.addToFavorite(movie);
		}
		assertEquals("771353298: Kingsman: The Secret Service","");
	}
}
