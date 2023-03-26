package CódigoPreparatorio;

public class SimpleDotCom {
	private int[] locationCells;
	private int numOfHits = 0;
	
	public SimpleDotCom(int[] locationCells, int numOfHits) {
		this.locationCells = locationCells;
		this.numOfHits = numOfHits;
	}

	public int[] getLocationCells() {
		return locationCells;
	}

	public int getNumOfHits() {
		return numOfHits;
	}
	
	public String checkYouself(String guess) {
		
		int hint = Integer.parseInt(guess);
		
		for(int LC: locationCells){
			
			if(hint == LC) {
				numOfHits+=numOfHits;
				
				if(numOfHits == 3) {
					return "Eliminação";
				}
				else {
					return "Correto";
				}
			}
			else {
				return "Errado";
				}
			}
		return "";
		}
	
	public void selfLocationCells(int[] loc) {
		this.locationCells = loc;
	}
	}
