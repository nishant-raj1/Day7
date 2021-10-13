import java.io.*;
public class Fileread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 File abc= new File("C:\\Users\\nishant.raj\\Desktop\\Trainig Setup\\Day1\\binary addition pgm.txt");
		if(abc.canWrite()) {
		System.out.println(abc.getAbsolutePath()+ " can write");
		}
		if(abc.canRead()) {
			System.out.println(abc.getAbsolutePath()+" can read");
		}

	}

}
