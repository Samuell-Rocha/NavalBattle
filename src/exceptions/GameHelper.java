package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
	
	public String getUserInput(String prompt) {
		
		String InputLine = null;
		System.out.print(prompt + "");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			InputLine = is.readLine();
			if (InputLine.length() == 0) return null;
		}catch(IOException e) {
			System.out.print("IOException: " + e);
		}
		return InputLine;
		}
	}
	
