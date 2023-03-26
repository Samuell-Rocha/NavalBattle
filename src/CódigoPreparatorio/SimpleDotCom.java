package CódigoPreparatorio;

public class SimpleDotCom {
	private int[] locationCells;
	private int numOfHits = 0;
	

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
				numOfHits++;
				
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
