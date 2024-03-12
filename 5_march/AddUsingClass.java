import java.util.Scanner;
class AddFunc {
		int res = 0;
		AddFunc(int x,int y){
			res = x+y;
	};
};

public class AddUsingClass {
	public static void main(String[] args){
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		x = sc.nextInt();
		System.out.println("Enter second number : ");
		y = sc.nextInt();
		AddFunc addVar = new AddFunc(x,y);
		System.out.println("The sum of "+x+" and "+y+" is "+addVar.res);
	};
};