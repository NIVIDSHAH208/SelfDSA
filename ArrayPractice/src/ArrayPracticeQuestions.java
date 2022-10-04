import java.util.HashSet;
import java.util.Set;

public class ArrayPracticeQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	//find if the array contains atleast one duplicate element
	public static boolean ifContains(int[] numArray) {	
		Set<Integer> mySet = new HashSet<Integer>();
		
		for(int i=0; i<numArray.length; i++) {
			if(mySet.contains(numArray[i])) {
				return true;
			}
		}	
		return false;
	}

}
