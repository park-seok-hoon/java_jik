package jenericpractice;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lotto {

	public static void main(String[] args) {
		/*	랜덤으로 당첨 번호를 생성하고,사용자가 로또 번호를 입력하면 등수를 알려주는 코드를 작성
		 * 단, 컬렉션을 이용
		 * 당첨번호: 6개 보너스:1개
		 * 사용자: 6개
		 * 번호 범위 : 1~45
		 * 
		 * */
		Set<Integer> lotto=new HashSet<Integer>(); //lotto 난수 담을 그릇
		Set<Integer> user=new HashSet<Integer>(); //user의 입력 배열 그릇
		int bonus; //보너스 번호
		int max=45,min=1;
		
		while(lotto.size()<6)
		{
			Random random =new Random();
			int rand=random.nextInt(max+min-1)+min;
			lotto.add(rand);
		}
		System.out.println(lotto);
		
		//보너스 번호를 생성
		while(true)
		{	
			Random random =new Random();
			bonus=random.nextInt(max+min-1)+min;
			
			
			//로또번호가 들어가 있는 lotto 배열 리스트에 bonus와 겹치지 않는다면
			//보너스 번호가 당첨 번호와 일치하지 않으면
			if(!lotto.contains(bonus))
				break;
		}
		
		System.out.println(lotto + "보너스 번호 :"+bonus);
		
		//사용자가 당첨 번호를 입력
		Scanner scan=new Scanner(System.in);
		int numb;
		System.out.println("유저는 번호를 입력");
		while(user.size()<6)
		{
			numb=scan.nextInt();
			user.add(numb);
					
		}
		System.out.println(user);
		
		//일치하는 개수 계산
		int count=0;
		
		for(int tmp:user)
		{
			if(lotto.contains(tmp))
			count++;
		}
		
		
		switch(count)
		{
		case 6:
			System.out.println("1등입니다.");
			break;
		case 5:
			int rank=user.contains(bonus) ? 2: 3;
			System.out.println(rank+"등입니다.");

			break;
		case 4:
			System.out.println("4등입니다.");
			break;
		default:
			System.out.println("꽝");
			break;
		
		
		}
		
		//등수를 출력
	
	
		
			
		}
		
	
	
	
		
}


