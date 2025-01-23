import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
		int digit;
        int sum = 0;
        int orgNum = n;
        while(orgNum != 0){
            digit = orgNum % 10;
            sum += Math.pow(digit, 3);
            orgNum /= 10;
        }
        if(sum == n){
            System.out.println("Armstrong number");
        } 
		else{
            System.out.println("Not an Armstrong number");
        }
    }
}
