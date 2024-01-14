package student;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
	
	@NonNull
	private int grade, classNum, num;
	@NonNull
	private String name;
	private int kor, eng, math;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}

	@Override
	public String toString() {  //전체 학생의 학년,반,번호,이름,영어,국어,수학 성적 조회
		return "\n"+" [ 학년= " + grade +" 반 : " + classNum + " 번호 : " + num + " 이름 : "+ name + " 국어 성적 : " + kor + " 영어 성적 : " + eng + " 수학 성적 : "+ math + "]";
	}
	
	public void printStudent()	//학생들의 반,번호,이름만 조회
	{
		System.out.println(" [학년= " + grade +"반 : " + classNum + "번호 : " + num + "이름 : "+ name);
	}
	
	public void printkorscore()	//학생들의 국어 성적
	{
		
		System.out.println("국어 성적 : "+kor);
	}
	
	public void printengscore() //학생들의 영어 성적
	{
		
		System.out.println("영어 성적 : "+eng);
	}
	
	public void printmathscore() //학생들의 수학 성적
	{
		
		System.out.println("수학 성적 : "+math);
	}
	
	
	
	
	
	
	
	
}
