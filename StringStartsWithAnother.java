package Practise;

public class StringStartsWithAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str1= "Heey buddy start programming";
		String str2= "Hello world";
		String str3= str1.substring(0, str2.length());
		boolean res=str3.equals(str2);
		System.out.println(res);

	}

}
