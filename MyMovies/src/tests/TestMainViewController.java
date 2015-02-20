package tests;

import static org.junit.Assert.*;
import it.jtomato.gson.Movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import mediators.FileMediator;
import mediators.WebMediator;

import org.junit.Test;

import repository.WebRepository;
import controller.MainViewController;
import business.MyMovie;
//se om jeg kan forkorte testene og gjøre de mer lesbare, og sjekke om testene går rundt i ring
public class TestMainViewController {
	
	public boolean storeCalled;
	File favorites = new File("favorite.txt");
	@Test
	public void txtFile_testToSeIfAnTxtFileAllredyExist() {
		FileReader readFavorite;
		try {
			readFavorite = new FileReader(favorites);
			assertNotNull(readFavorite);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void txtFile_AddMoiveToFavoriteTextFile() throws FileNotFoundException{
		FileMediator fileMediator = new FileMediator();
		MainViewController controller = new MainViewController(fileMediator);
		MyMovie movie = new MyMovie(new Movie());
		controller.addToFavorite(movie);
		assertEquals();
	}
	
	@Test
	public void txtFile_testGetFavorites() throws FileNotFoundException{
		FileReader readFavorite = new FileReader(favorites);
		FileMediator fileMediator = new FileMediator();
		WebRepository repo = new WebRepository();
		Scanner readFile = new Scanner(readFavorite);
		MainViewController controll = new MainViewController(fileMediator);
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
		FileMediator fileMediator = new FileMediator();
		FileReader readFavorite = new FileReader(favorites);
		WebRepository repo = new WebRepository();
		Scanner readFile = new Scanner(readFavorite);
		MainViewController controll = new MainViewController(fileMediator);
		WebMediator test = new WebMediator();
		ArrayList<MyMovie> movies = repo.getBoxOfficeMovies(3);
		for(MyMovie movie : movies){
			controll.addToFavorite(movie);
		}
		assertEquals("771353298: Kingsman: The Secret Service","");
	}
}
