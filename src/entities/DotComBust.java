package entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import exceptions.GameHelper;

import java.util.Random;
import java.lang.Math;

public class DotComBust {
	
	
	public static void main(String[] args) {

		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();

	}
	
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int NumOfGuesses=0;

	public void setUpGame() {
		DotCom ShipOne = new DotCom();
		DotCom ShipTwo = new DotCom();
		DotCom ShipThree = new DotCom();

		ShipOne.setName("pets.com");
		ShipTwo.setName("askme.com");
		ShipThree.setName("go2.com");

		dotComsList.add(ShipOne);
		dotComsList.add(ShipTwo);
		dotComsList.add(ShipThree);

		System.out.println("Seu objetivo é eliminar thrês dot coms.");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("Tente eliminar todas com o menor número de palpites");

		for (DotCom DotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			DotComToSet.setLocationCells(newLocation);
		}
	}

	public void startPlaying() {
		while (!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Insira um palpite: ");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	public String checkUserGuess(String Userguess) {

		NumOfGuesses++;
		String result = "miss";
		for (DotCom DotComToTest : dotComsList) {
			result = DotComToTest.checkYourself(Userguess);

			if (result.equals("correto")) {
				break;
			}
			if (result.equals("eliminar")) {
				dotComsList.remove(DotComToTest);
					break;
			}
		}
		return result;

	}

	public void finishGame() {
		System.out.println("Fim de jogo");
		if (NumOfGuesses < dotComsList.size()) {
			System.out.println("Congratulação");
		} else {
			System.out.println("Muita palpite rapá");
		}
	}

	

}
