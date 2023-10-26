import java.util.*;

public class App{
	
	//write a function that returns duplicate characters in string
	
	
	public static Dictionary<Character,Integer> duplicateString(String input) {
		
		Dictionary<Character,Integer> duplicateChars = new Hashtable<>();
		
		for(int i = 0; i < input.length(); i++ ) {
			
			char character = input.charAt(i);
			
			for(int j = i+1 ;j < input.length(); j++)
			
				if( Character.toLowerCase(character) == input.charAt(j)) {
					
					if (Character.isLetter(character)) {
				            if (((Hashtable<Character, Integer>) duplicateChars).containsKey(character)) {
				                int count = duplicateChars.get(character);
				                duplicateChars.put(character, count + 1);
				            } else {
				                duplicateChars.put(character, 1);
				            }
				        }
			}
		}
		
		
		if(!duplicateChars.isEmpty()) {
		return duplicateChars;
		}else throw new Error("No elements found duplicate");
	}
	
	
	public static HashMap<Integer,Integer> duplicateInts(int[] arr){
		
		
		HashMap<Integer,Integer> duplicates = new HashMap<>();
		
		
		for (int num : arr) {
        if (duplicates.containsKey(num)) {
            int count = duplicates.get(num);
            duplicates.put(num, count + 1);
        } else {
            duplicates.put(num, 1);
        }
    } 
		
		

    if (!duplicates.isEmpty()) {
        return duplicates;
    } else {
        throw new Error("No elements found");
    }
			
			
	
	}
	
	
	public static void main(String[] args) {
		
		
		int[] list = {3,3,3,3,4,12,4};
		System.out.println(duplicateString("Jello worlld"));
		System.out.println(duplicateInts(list));
		
	}
}