package Problem4;

import java.util.Arrays;

public class SortWords {

	
	public static void sortStrings(String[] arr, int n)
    {
        String temp;
 
        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++) {
            for (int i = j + 1; i < n; i++) {
                if (arr[j].toLowerCase().compareTo(arr[i]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
	
	public static void main(String[] args) {
		
		
		String text = "To be or not to be, that is the question;"
				+"Whether `tis nobler in the mind to suffer"
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing end them?";

        
        String[] words = text.split("\\s+");
        
        for (int i = 0; i < words.length; i++) {
            
        	// Want to check for a non-word character
        	
            words[i] = words[i].replaceAll("[^\\w]", "");
        }
        

        // Sort the words alphabetically using Bubble sort
        sortStrings(words, words.length);
        
        // Print the sorted words
        System.out.println("Sorted words of this soliloquy:\n");
        
        for (int i = 0; i < words.length ; i++) {
        	
            System.out.println(words[i]);
        }

	}

}
