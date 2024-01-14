package practice_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListEx1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(5);
		list.add(1);
		
		list.set(0,100);
		
		System.out.println(list);
		


		
	
		
	

	}

}

class A{
	
	private int num;
	
	public void print() {
			System.out.println(num);
	}
	
	public A(int num)
	{
		this.num=num;
	}
	
	
}