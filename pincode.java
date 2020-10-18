import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class pincode{
	public void isValidPincode()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the 6 digit pincode :");
		String zipcode=input.next();
		String regex="^[0-9]{6}";
		Pattern p=Pattern.compile(regex);

		Matcher m=p.matcher(zipcode);
		System.out.println(zipcode+" "+m.matches());
	}
   public static void main( String args[] ) {
		pincode pin=new pincode();
		pin.isValidPincode();
   }
}
