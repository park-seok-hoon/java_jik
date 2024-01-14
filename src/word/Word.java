package word;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Data;

@Data
public class Word {
	
	String engwords;
	
	List<Mean> meanlist=new ArrayList<Mean>();

	int views;
	//단어만 같아도 같은 단어로 판별하기 위해 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(engwords, other.engwords);
	}

	@Override
	public int hashCode() {
		return Objects.hash(engwords);
	}
	
	//단어와 뜻 품사를 동시에 출력하기 위한 방법
	
	public void printwordmean() {
		System.out.println("단어 : "+engwords);
		if(meanlist==null || meanlist.size()==0 ) {
			System.out.println("등록된 뜻이 없습니다.");
			return;
		}
		
		for(int i=0; i<meanlist.size(); i++)
		{
			System.out.println(i+1 + ". " +meanlist.get(i));
			
		}
		
	}
	
	public boolean addMean(String partofSpeech,String mean) 
	{	
		if(meanlist==null)
			return false;
		
		if(meanlist.contains(new Mean(mean))) {
				return false;
		}
		meanlist.add(new Mean(partofSpeech,mean));
		return true;
		
		
	}
	public boolean setMean(int pos, String partOfspeech, String mean) {
		
		if(meanlist == null) {
			return false;
		}
		
		if(pos < 0 || pos >=meanlist.size())
			return false;
		
		if(meanlist.contains(new Mean(mean))) {
			return false;
		}
		
		meanlist.set(pos,new Mean(partOfspeech,mean));
		return true;
	}

	@Override
	public String toString() {
		return "단어 : " + engwords + "\n" + meanlist + "\n조회수 : "+ views;
	}
	
	public String get

	
	
	
	

	
}
