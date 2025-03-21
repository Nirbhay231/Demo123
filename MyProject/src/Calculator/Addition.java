package Calculator;

import java.util.Scanner;

public class Addition {

	public static int add(int a, int b) 
	{
		int result = a+b;
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Num2");
		int num2= sc.nextInt();
		
		int sum= add(num1,num2);
		
		System.out.println("The sum is" +sum);
		
		
	}
	
}
