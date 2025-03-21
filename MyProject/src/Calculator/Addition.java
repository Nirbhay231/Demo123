package Calculator;

import java.util.Scanner;

public class Addition {

	public static int add(int a, int b, int c) 
	{
		int result = a+b+c;
		return result;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Num2");
		int num2= sc.nextInt();
		
		System.out.println("Enter Num3");
		int num3= sc.nextInt();
		
		int sum= add(num1,num2,num3);
		
		System.out.println("The sum is" +sum);
		
		
	}
	
}
