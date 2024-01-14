package interfacepractice;

import lombok.Data;

public class abc {
	
	public static void main(String args[])
	{
		int num1=10;
		int num2=5;
		
		calculator c= new calculator();
		System.out.println(c.add(num1,num2));
		System.out.println(c.substract(num1, num2));
		System.out.println(c.divide(num1, num2));
		System.out.println(c.times(num1, num2));
		
		
		
	}
}
