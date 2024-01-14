package practice_1;

import java.util.Vector;

public class vector {

		public static void main(String args[])
		{	
			Vector<Point> p = new Vector<Point>();
			p.add(new Point(2,3)); //인덱스 0번째 객체 추가
			p.add(new Point(5,7)); //인덱스 1번째 객체 추가
			
			p.remove(1); //인덱스 1에 있는 객체를 삭제
			
			for(int i=0; i<p.size(); i++)
			{
				Point v = p.get(i);
				System.out.println(v);
				
			}
		}
}

class Point{
	private int x,y;
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
	public String toString()
	{
		return "(" + x + "," + y +")";
		
	}
	
}