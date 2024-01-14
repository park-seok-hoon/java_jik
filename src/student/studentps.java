package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentps {
	public static Scanner sc=new Scanner(System.in);
	
		public static void main(String[] args) {
			List<Student> list=new ArrayList<Student>();
			Student std ;
			int menu = 0;
		 
				while(true)
				{
					System.out.println("메뉴  go stop 1,0");
					menu=sc.nextInt();
					if(menu==1)
					{
						System.out.print("학년 : ");
						int grade=sc.nextInt();
						System.out.print("반 : ");
						int classNum=sc.nextInt();
						System.out.print("번호 : ");
						int num=sc.nextInt();
						System.out.print("이름 : ");
						String name=sc.next();
						std=new Student(grade,classNum,num,name);
						list.add(std);
					}
					else if(menu==0)
						break;
				}	
					
					
			
				
			
				
			
	
		}

}
