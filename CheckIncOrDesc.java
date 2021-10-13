package Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CheckIncOrDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Integer>  list = new ArrayList<Integer>();
		ArrayList<Integer>  list1 = new ArrayList<Integer>();
		ArrayList<Integer>  list2 = new ArrayList<Integer>();

		Scanner sc= new Scanner(System.in);
		System.out.print(" Enter the 1st Number");
		int a=sc.nextInt();
		list.add(a);
		list1.add(a);
		list2.add(a);
		System.out.print(" Enter the 2nd Number");
		int b=sc.nextInt();
		list.add(b);
		list1.add(b);
		list2.add(b);
		System.out.print(" Enter the 3rd Number");
		int c=sc.nextInt();
		list.add(c);
		list1.add(c);	
		list2.add(c);
		  Collections.sort(list1, Collections.reverseOrder());

		  Collections.sort(list2);
		  
	if(list.equals(list1))	 {
		System.out.println(" The Numbers are in Descending otder");
	}
	else if(list.equals(list2))
		System.out.println(" The Numbers are in Ascending order");
	  

	else {
		System.out.println(" Nothing");
	}
	}

}
