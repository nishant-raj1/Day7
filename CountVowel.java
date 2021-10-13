package Practise;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();		
		for(int i=0;i<str.length();i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
		}
		System.out.println(" total no of vowels are: "+count);
	}

}
