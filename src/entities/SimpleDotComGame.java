package entities;

import java.util.Scanner;

import exceptions.GameHelper;

public class SimpleDotComGame {

	public static void main(String[] args) {

		SimpleDotCom dot = new SimpleDotCom();

		Scanner sc = new Scanner(System.in);

		int numberOfGuesses = 0;
		
		GameHelper helper = new GameHelper();

		boolean isAlive = true;
		
		int ramdomNum = (int) Math.random() * 5;

		int[] locations = { ramdomNum, ramdomNum+1, ramdomNum+2 };

		dot.setLocationCells(locations);

		while (isAlive == true) {
			
			String guess = helper.getUserInput("Insira um numero: ");

			String result = (dot.checkYourself(guess));
			System.out.print(result);
			System.out.print("\n");
			numberOfGuesses++;

			if (result.equals("kill")) {
				isAlive = false;
				System.out.print("Você usou " + numberOfGuesses + " palpites");
				
			}
		}
		

	}

}
