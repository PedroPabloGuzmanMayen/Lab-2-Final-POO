public class Clock {
	
	private int seconds;
	private int cycles;
	
	public int getSeconds() {
		return seconds;
	}
	public int getCycles() {
		return cycles;
	}
	
	public void work(int time) {
		seconds ++;
		if (seconds > time/1000 ) {
			seconds = 0;
			cycles++;
		}
		
	}
	

}
