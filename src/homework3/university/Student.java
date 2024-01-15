package homework3.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Data;


@Data
public class Student {
	private int universenum; //학번
	private int age; 	//나이
	private String name; //이름
	
	List<Lecture> lecture=new ArrayList<Lecture>(); //강의 리스트
	
	
	int score;


	@Override
	public String toString() {
		return "학생 [학번 = " + universenum + ", age = " + age + ", name = " + name + ", lecture = " + lecture
				+ ", score = " + score + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return universenum == other.universenum;
	}


	@Override
	public int hashCode() {
		return Objects.hash(universenum);  //학번 
	}


	public Student(int universenum, int age, String name) {	//학번,나이,이름 입력 받으면 집어넣을 생성자
		super();
		this.universenum = universenum;
		this.age = age;
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
