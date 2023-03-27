package CódigoPreparatorio;

public class SimpleDotCom {
	private int[] locationCells;
	private int numOfHits = 0;

	public int[] getLocationCells() {
		return locationCells;
	}
	
	public void setLocationCells(int[] loc) {
		this.locationCells = loc;
	}

	public int getNumOfHits() {
		return numOfHits;
	}

	public String checkYourself(String guess) {

		int hint = Integer.parseInt(guess);
		String result = "erro";

		for (int LC : locationCells) {

			if (hint == LC) {
				result = "Acertou";
				numOfHits++;
				break;
			}
		}

		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		return result;
	}

	
}
