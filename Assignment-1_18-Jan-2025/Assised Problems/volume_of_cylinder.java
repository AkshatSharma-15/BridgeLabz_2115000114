import java.util.Scanner;
import java.lang.Math;

class volume_of_cylinder
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of base of cylinder: ");
		double radius = sc.nextDouble();
		
		System.out.println("Enter height of cylinder: ");
		double height = sc.nextDouble();
		
		double vol = Math.PI * radius * radius * height;
		System.out.println("Volume of cylinder is: " + vol);
	}
}