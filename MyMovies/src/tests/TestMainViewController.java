package tests;

import static org.junit.Assert.*;

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

public class TestMainViewController {

	@Test
	public void txtFile_testToSeIfAnTxtFileAllredyExist() throws FileNotFoundException {
		FileReader readFavorite = new FileReader("favorite.txt");
		assertNotNull(readFavorite);
	}
	@Test
	public void txtFile_AddMoiveToFavoriteTextFile() throws FileNotFoundException{
		FileReader readFavorite = new FileReader("favorite.txt");
		Scanner readFile = new Scanner(readFavorite);
		MainViewController controll = new MainViewController();
		WebMediator test = new WebMediator();
		ArrayList<business.MyMovie> temp = test.searchMovie("kingsman");
		MyMovie check  = temp.get(0);
		controll.addToFavorite(check);
		String str = readFile.nextLine();
		assertEquals("771353298: Kingsman: The Secret Service", str);
	}
	@Test
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
		assertEquals("771353298: Kingsman: The Secret Service",str);
	}
}
