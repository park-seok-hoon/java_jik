package word;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor //품사와 뜻을 가진 생성자를 만드는 것
public class Mean implements Serializable {


	String partofspeech; //품사
	String means; //뜻
	
	
	
	
	
	
	public Mean(String means)
	{
		this.means =means;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mean other = (Mean) obj;
		return Objects.equals(means, other.means);
	}
	@Override
	public int hashCode() {
		return Objects.hash(means);
	}



	@Override
	public String toString() {
		return "[ 품사 : " + partofspeech + ", 뜻 : " + means + "]";
	}

	
	
	
	
	

}
