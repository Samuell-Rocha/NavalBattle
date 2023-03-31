package entities;

import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> LocationCells;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getLocationCells() {
		return LocationCells;
	}

	public void setLocationCells(ArrayList<String> loc) {
		LocationCells = loc;
	}

	public String checkYourself(String guess) {

		String result = "miss";

		int index = LocationCells.indexOf(guess);

		if (index >= 0) {
			LocationCells.remove(index);

			if (LocationCells.isEmpty()) {
				return result = "kill" + "/n" + "Você afunodu o " + name;
			}
			else {
				return result = "hit";
			}
		}
		return result;
	}

}
