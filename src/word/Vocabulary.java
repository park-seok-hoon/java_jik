package word;

import java.util.ArrayList;
import java.util.List;


//단어장
public class Vocabulary {

	private List<Word> list; //단어 리스트
	
	public Vocabulary(List<Word> word) {
		if(word == null)
		{
				word = new ArrayList<Word>();
			
		}
		this.list =word;
	}
	
	//단어 추가 기능
	public boolean addWord(String word,String parOfSpeech,String mean) {
		if(list == null) {
			return false; 
		}
		//이미 등록된 단어이고,뜻도 등록되었으면
		int index =list.indexOf(new Word(word));
		if(index >= 0 && list.get(index).getMeanList().contains(new Mean(mean)))
		{
			return false;
			
		}
		return true;
		
	}

}
