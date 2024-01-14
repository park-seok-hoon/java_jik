package homework0112;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class insumlist {	//수입 내역 클래스
	@NonNull
	String date,history;  //날짜,내역
	
	
	@NonNull
	int insum; //수입;

	@Override
	public String toString() {
		return "수입금 [ 날짜 = " + date + " , 수입 내역 = " +   history + " , 수입 금액 : " + insum + " ]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		insumlist other = (insumlist) obj;
		return Objects.equals(date, other.date) && Objects.equals(history, other.history) && insum == other.insum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, history, insum);
	}
	
	
	
	
	 
	 
	 
	
	 

}
