import java.util.ArrayList;
import java.util.List;

public class HuffmanEncode {
	
	public ArrayList<Pair<Character, Integer>> characterCount(String str){
		
		ArrayList<Pair<Character, Integer>> charCount = new ArrayList<>();
		ArrayList<Character> idx = new ArrayList<>();
		ArrayList<Integer> count = new ArrayList<>();
		
		//Count number of character occurrences in file
		for(int i = 0; i < str.length(); i++){			
			//Check if character is in charCount
			if(!idx.contains(str.charAt(i))){
				idx.add(str.charAt(i));
				count.add(1);
			}
			//If idx exists then increment character count
			else{
				count.set(idx.indexOf(str.charAt(i)), count.get(idx.indexOf(str.charAt(i))) + 1);
			}
			
		}
		
		//Combine both arrays into one arrayList, pairing both 
		
		
		return charCount;
	}
}
