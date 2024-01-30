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
	
	
}


