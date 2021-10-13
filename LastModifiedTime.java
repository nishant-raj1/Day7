package Practise;

import java.io.File;
import java.sql.Date;

public class LastModifiedTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  File myFile = new File("C:\\Users\\nishant.raj\\Desktop\\Trainig Setup\\Project\\Register Customer.txt");
	        
	        long modifiedValue = myFile.lastModified();
	      Date modifiedDate = new Date(modifiedValue);
	        System.out.println(modifiedDate);
	}

}
