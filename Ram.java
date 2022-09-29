import java.util.ArrayList;

public class Ram{
    private String type;
    private int initial_space;
    private int total_space;
    private int time;
    private double GBSpace;
   
    public ArrayList<Integer> process; 
    public ArrayList<Program> waitlist;
    
    public Ram(){
    	process = new ArrayList<Integer>();
    	waitlist = new ArrayList<Program>();
    	
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getInitial_space() {
        return initial_space;
    }
    public void setInitial_space(int initial_space) {
        this.initial_space = initial_space;
    }
    public int getTotal_space() {
        return total_space;
    }
    public void setTotal_space(int total_space) {
        this.total_space = total_space;
    }
    public int getTime() {
    	return time;
    }
    public void setTime(int time) {
    	this.time = time;
    }
    public ArrayList<Program> getWaitlist() {
    	return waitlist;
    	
    }
    public ArrayList<Integer> getProcess(){
    	return process;
    }
    public double getGBSpace() {
    	return GBSpace;
    }
    public void setGBSpace(double GBSpace) {
    	this.GBSpace = GBSpace;
    }
}
