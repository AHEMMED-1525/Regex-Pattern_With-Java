import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;
public class pincode{
	Scanner input=new Scanner(System.in);
	public void isValidpincode(){
		System.out.println("Enter the 6 digit pincode :");
		String zipcode=input.nextLine();
		String regex="^[0-9]{6}";

		// Compile the regex Pattern
		Pattern p=Pattern.compile(regex);

		// matcher
		Matcher m=p.matcher(zipcode);
		System.out.println("The pincode is :" +m.matches());
	}

	public static void main(String[] args){
		pincode pin=new pincode();
		pin.isValidpincode();
	}
}
