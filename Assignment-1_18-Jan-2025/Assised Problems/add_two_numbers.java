import java.util.Scanner;

class add_two_numbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.println("Their sum is: " + (a+b));
	}
}