package string;

public class VowelConsonant2 {

	public static void main(String[] args) {
		

		  

		 

		        System.out.println("Enter a word : ");
		        String word = sc.next().toLowerCase();

		        int vowels = 0;
		        int consonants = 0;

		        for (int i = 0; i < word.length(); i++) {
		            char ch = word.charAt(i);

		            if (ch >= 'a' && ch <= 'z') {
		                if (ch == 'a' || ch == 'e' || ch == 'i'
		                        || ch == 'o' || ch == 'u') {
		                    vowels++;
		                } else {
		                    consonants++;
		                }
		            }
		        }

		        System.out.println("Number of vowels : " + vowels);
		        System.out.println("Number of consonants : " + consonants);

		        sc.close();
		    }
		


	}


