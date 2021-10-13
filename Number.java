package Practise;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.print(" Enter the Number");
int a=sc.nextInt();
if (a==0)
	System.out.println(" Its Zero");
else if(a>0) {
	System.out.println(" Its Positive Number");
}
else {
	System.out.println(" Its Negative Number");
}
	}

}
