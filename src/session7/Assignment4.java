package session7;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Date in dd/mm/yyyy format");
		String date_entered = in.nextLine();
		
		//Splitting the date
		String[] date_split = date_entered.split("/");
		
		//printing the date in the format of YYYY-MM-DD
		System.out.println("Date is "+date_split[2]+"-"+date_split[1]+"-"+date_split[0]);;

	}

}
