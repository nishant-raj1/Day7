package Practise;

import java.util.Scanner;

public class Yeartomm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days=365;
Scanner sc= new Scanner(System.in);
System.out.println(" Enter the year");
int year=sc.nextInt();
if(year %400==0 ||(year%4== 0 && year%100 !=0))
{
	days=366;
	System.out.println(" This is a leap Year");
}

if (days==366)
	System.out.println((8.64e+7)*366+"Miliseconds");
	
	else {
		System.out.println((8.64e+7)*365+"Miliseconds");
	}
	}
}
