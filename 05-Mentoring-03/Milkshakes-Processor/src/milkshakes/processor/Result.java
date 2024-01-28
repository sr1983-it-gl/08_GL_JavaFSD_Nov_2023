package milkshakes.processor;

public class Result {

	private int timeInSeconds;
	
	public void incrementTime(int timeValue) {
		
		this.timeInSeconds =
				this.timeInSeconds + timeValue;
	}
	
	public String toString() {
		
		return String.format("Time : %d", timeInSeconds);
	}
}
