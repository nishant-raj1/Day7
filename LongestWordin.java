package Practise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordin {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		LongestWordin a= new LongestWordin();
		a.findLongestWords();
	}
    public String findLongestWords() throws FileNotFoundException 
    {
        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File("C:\\Users\\nishant.raj\\Desktop\\Trainig Setup\\Project\\Register Customer.txt"));
 
        while (sc.hasNext()) 
        {
            current = sc.next();
            if (current.length() > longest_word.length()) 
            {
                longest_word = current;
            }
 
        }
        System.out.println("\n"+longest_word+"\n");
        return longest_word;
    }

	}


