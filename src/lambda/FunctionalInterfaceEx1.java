package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FunctionalInterfaceEx1 {

	public static void main(String[] args){
		
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(1, 1, 1, "홍길동",90,80,70));
		list.add(new Student(1, 2, 1, "박석훈",400,50,60));
		list.add(new Student(1, 2, 3, "김현정",30,83,72));
		
		print(list,s -> {
			System.out.println(s.getGrade() + "학년 " + s.getClassNum() + "반 "+
			s.getName() + "번호 " + s.getName());

			
		});
	}
	
		public static void print(List<Student> list, Consumer<Student> consumer )
		{
				for(Student std : list)
					consumer.accept(std);
			
		}
		
	}

@Data
@AllArgsConstructor
class Student{
	
	int grade,classNum,num;
	String name;
	int kor,eng,math;
	
}
