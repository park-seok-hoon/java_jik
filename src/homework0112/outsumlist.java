package homework0112;

import java.util.Objects;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;



@Data
@RequiredArgsConstructor
public class outsumlist {
	@NonNull
	String date,history;  //이름,날짜,내역
	
	@NonNull
	int outsum; //지출;


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		outsumlist other = (outsumlist) obj;
		return Objects.equals(date, other.date) && Objects.equals(history, other.history) && outsum == other.outsum;
	}


	@Override
	public int hashCode() {
		return Objects.hash(date, history, outsum);
	}


	@Override
	public String toString() {
		return "지출금 [ 날짜 = " + date + " , 수입 내역 = " +   history + " , 수입 금액 : " + outsum + " ]";
	}
	
	
	
	

}
