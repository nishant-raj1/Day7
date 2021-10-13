package Practise;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the number of rows");
		int r=sc.nextInt();
		System.out.println(" enter no of columns");
		int c= sc.nextInt();
		int a[][]= new int [r][c];
		System.out.println(" Enter the data in the 1st Matrix");
		for(int i=0;i<r;i++) {
			for (int j=0;j<c;j++) 
				a[i][j]=sc.nextInt();			
		}
		
		for(int i=0;i<r;i++) {
			for (int j=0;j<c;j++) 
				System.out.print(a[i][j]+"   ");
			System.out.println("");	
		}
		// Second Mtrix Input here--------------------------
		System.out.println(" enter the number of rows");
		int s=sc.nextInt();
		System.out.println(" enter no of columns");
		int t= sc.nextInt();
		int b[][]= new int [s][t];
		System.out.println(" Enter the data in the 2nd Matrix");
		for(int i=0;i<s;i++) {
			for (int j=0;j<t;j++) 
				b[i][j]=sc.nextInt();			
		}
		System.out.println(" Second Matrix is Below");
		for(int i=0;i<s;i++) {
			for (int j=0;j<t;j++) 
				System.out.print(b[i][j]+"   ");
			System.out.println("");	
		}
		int added[][]= new int[s][t];
		if(r==s && t==c) {
			   for (int i = 0; i < r; i++) 
	            {
	                for (int j = 0; j < c; j++) 
	                {
	             
	                        added[i][j] = a[i][j] + b[i][j];
	                    
	                }
	            }
		}
		
		System.out.println(" Matrix After Addition");
		for(int i=0;i<s;i++) {
			for (int j=0;j<t;j++) 
				System.out.print(added[i][j]+"   ");
			System.out.println("");	
		}
		
		
	}

}
