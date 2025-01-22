import java.util.Scanner;

class celsius_to_fahrenheit
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature in celsius: ");
		float cel = sc.nextFloat();
		
		float fahren = (cel * 9/5) + 32;
		System.out.println("Temperature in fahrenheit is: " + fahren);
	}
}