import java.util.Scanner;

public class largestNumber {
	public static void main(String[] args){
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		x = sc.nextInt();
		System.out.println("Enter second number : ");
		y = sc.nextInt();
		System.out.println("Enter Third number : ");
		z = sc.nextInt();
		if(x>y && x>z){
			System.out.println(x+" is greater.");
		}else if(y>z && y>x){
			System.out.println(y+" is greater.");
		}else{
			System.out.println(z+" is greater.");
		}
	}
}