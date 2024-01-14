package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JSpinner.ListEditor;

public class LambdaEx2 {

	private static final int Comparator = 0;
	private static final int Integer = 0;

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(30);
		list.add(5);
		list.add(28);
		
		//정렬이 안된채로 출력된다.
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3= new ArrayList<Integer>();
		
		list2.addAll(list);
		list3.addAll(list);
		
		
		System.out.println(list2);
		System.out.println(list3);
		
		//방법1 정렬
		System.out.println("정렬 전 : " + list);
		
		list.sort(new ListA());
		
		System.out.println("정렬 후 : "+list);
		
		System.out.println(list);
	
	
		//방법2 정렬
		list2.sort(new Comparator<Integer>() {

			@Override
			public int compare(java.lang.Integer o1, java.lang.Integer o2) {
				
				return o1-o2;
			}
		});
		
		
		System.out.println("정렬 전 : " + list2);
		
		
		
		
		System.out.println("정렬 후 " +list2);
		
	
		System.out.println("정렬 전 : " + list3);
		
		
		//방법3 정렬
		list3.sort((o1,o2)-> {
			
			return o1-o2;
		});
		
		list.sort((o1,o2)->o2-o2);
		System.out.println("정렬 후 : " + list3);
		
		
	}

}
class ListA implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2; //오름차순
		
		//return o2-o1 //내림차순
	
	}

	
}
	
	
	

