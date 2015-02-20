package controller;

import java.util.List;


import mediators.FileMediator;
import Interfaces.FileMediatorInterface;
import business.MyMovie;

public class MainViewController {

	private FileMediatorInterface fileMediator;

	public MainViewController(FileMediator fileMediator){
		this.fileMediator = fileMediator;
	}

	public void addToFavorite(MyMovie movie) {
		fileMediator.storeMoviesAsFavorite(movie);
	}
	public List<String> getFavorites(){
		return fileMediator.getFavoriteIds();
	}
}