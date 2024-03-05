import java.util.Scanner;

public class additionUserInput {
	public static void main(String[] args){
		int x,y,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		x = sc.nextInt();
		System.out.println("Enter second number : ");
		y = sc.nextInt();
		sum = x+y;
		System.out.println("The sum of "+x+" and "+y+" is "+sum);
	}
}