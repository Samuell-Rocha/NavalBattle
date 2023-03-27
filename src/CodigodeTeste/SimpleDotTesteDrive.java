package CodigodeTeste;

import java.util.Scanner;

import CódigoPreparatorio.SimpleDotCom;

public class SimpleDotTesteDrive {

	public static void main(String[] args) {

		SimpleDotCom dot = new SimpleDotCom();

		Scanner sc = new Scanner(System.in);

		int numberOfGuesses = 0;
		

		boolean isAlive = true;
		
		int ramdomNum = (int) Math.random() * 5;

		int[] locations = { ramdomNum, ramdomNum+1, ramdomNum+2 };

		dot.setLocationCells(locations);

		while (isAlive == true) {
			
			System.out.print("Insira um numero: ");
			String es = sc.next();

			String result = (dot.checkYourself(es));
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
