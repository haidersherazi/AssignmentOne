package Problem3;


public class StringCharacters {

	public static void main(String[] args) {
		
		String text = "To be or not to be, that is the question;"
				+"Whether `tis nobler in the mind to suffer"
				+" the slings and arrows of outrageous fortune,"
				+" or to take arms against a sea of troubles,"
				+" and by opposing end them?";
				int spaces = 0,
				vowels = 0,
				letters = 0;

				//YOUR CODE HERE
				
				for(int i = 0; i < text.length(); i++) {
					
					char ch = text.charAt(i);
					
					if(ch == 'a'|| ch == 'e'||  ch == 'i' || ch == 'o' || ch == 'u')
					{
						vowels ++;
						letters ++; // because letters also includes vowels and I will use Letter variable to find consonants. Consonants = letters - vowels 
				    	  
					} else if(ch != ' ') {
				    	  
						letters ++;
				    	
					} else {
						spaces ++ ;
				    
					}
				}
				
				System.out.println("The text contained \nvowels: " + vowels + "\nconsonants " + (letters - vowels) + "\nspaces: " + spaces);

	}

}
