/**
 *Saleh Mosleh| 23507899 
 */

import java.io.*;
import java.util.*;

public class SortInput{
/* a function for checking uniqueness of characters in a word */
    private static boolean isUniqueChar(String s){
        boolean isUnique = true;
        char[] sortedS = sortWord(s);
    	for(int i=0; i<sortedS.length-1; i++) {
    		if(sortedS[i+1] == sortedS[i])
    			isUnique = false;
    	}
        System.out.println(isUnique + "\n");
        return isUnique;
    }
    
     /* insertion sort algorithm. It should return a string type */
    private static char[] sortWord(String s){
    	s = s.toLowerCase();
        char[] c = s.toCharArray();
        insertionSort(c);
        return c;
    }

    /**
     * Process: takes in a char array, compares each character
     */
    public static void insertionSort(char[] word) {
        if (word == null || word.length == 0)
            return;
        for (int i=0; i<word.length; i++) {
            char temp = word[i];
            int j = i;
            while (j>0 && word[j-1]>temp) {
                word[j] = word[j-1];
                j--;
            }
            word[j] = temp;
        }
        System.out.println(word);
        return;
    }

    public static void main(String[] args) throws FileNotFoundException {
        
    	    	Scanner scanner = new Scanner(new File("input.txt"));

        // read in words and determine whether it is composed of unique characters
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            isUniqueChar(s);
        }

      scanner.close();
    }
}