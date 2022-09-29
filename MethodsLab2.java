
public class MethodsLab2 {
	
	public boolean canBeAdded(int programSpace, int AviableSpace) {
		if (programSpace > AviableSpace) {
			return false;
		}
		else {
			return true;
		}
	}
	public void addToProcessList(Ram ram, Program program, int counter, int limit) {
		for (int i = 0; i < ram.getWaitlist().size(); i++) {
			int blockProgram = ram.getWaitlist().get(i).getSpace()/64;
			if (canBeAdded(ram.getWaitlist().get(i).getSpace(), ram.getTotal_space()) && counter < limit) {
				for (int j = 0; j<blockProgram; j++) {
					ram.getProcess().set(j, 1);
				}
				ram.getWaitlist().remove(i);
				counter ++;
				
			}
			else {
				
			}
			
		}
	}

}
