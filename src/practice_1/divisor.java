package practice_1;

public class divisor {

	public static void main(String[] args) {
		// 소수를 판별하는 함수 만들기
		
		if(isprimenumber(3)==true)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
		
	}
	
	public static boolean isprimenumber(int num)
	{
		int count=0;
		for(int i=1; i<=num; i++)
		{	
			if(isDivsor(num,i))
				count++;
			
		}
		if(count == 2)
			return true;
		else
		return false;
		
	}
	
	public static boolean isDivsor(int num1,int num2)
	{
		return num1 % num2 ==0;
		
	}

}
