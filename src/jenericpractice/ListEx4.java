package jenericpractice;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx4 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(1);
		list.add(4);
		
		System.out.println(list);
		/*	indexOf(A) : A와 일치하는 요소가 몇번지에 있는지 알려주는 메서드. 없으면 -1*
		 * */
		System.out.println(list.indexOf(100));
		/*	contains(A) A와 일치하는 요소가 있는지 없는지를 알려주는 메소드*/
		
		System.out.println(list.contains(2));
		
		
		
		/*  제네릭.contains(A) : A와 일치하는 요소가 있는지 없는지를 알려주는 메소드
			list.contains(2)) : list가 2를 가지고 있다면 true, 없다면 false를 반환해준다*/
		
		System.out.println(list.remove(0));
		
		System.out.println(list);
		
		/*	sort(Comparator<? super Integer> c) : 비교 기준이 있는 메서드를 가진
		 * Comparator 인터페이스를 구현한 구현 클래스의 인스턴스가 와야 함
		 * 
		 * */
		
		list.add(100);
		list.add(-1);
		list.add(50);
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
					return o1-o2;
			}	
		});
		
		System.out.println(list);
	}

}
