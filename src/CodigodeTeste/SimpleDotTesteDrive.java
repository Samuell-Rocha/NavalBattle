package CodigodeTeste;

import java.util.Scanner;

import CódigoPreparatorio.SimpleDotCom;

public class SimpleDotTesteDrive {

	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] locations = {5,3,4};
		
		dot.setLocationCells(locations);
		
		
		System.out.print("Insira um numero: ");
		String es = sc.next();
		
		
		System.out.print(dot.checkYourself(es));
		

	}

}

