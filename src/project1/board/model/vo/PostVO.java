package project1.board.model.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //얘가 없어서 안된거에요. 테스트해보세요. 위에꺼는 지우나요? 안쓰면 지워되되요 얘가 기본생성자에요 근데 기본 생성자가 원래 필요한거에요?
//네 Mapper에서 DB에서 검색한 데이터를 자동으로 객체에 넣어줄 때 기본 생성자를 이용하여 객체를 생성한 뒤, setter들을 호출해서 각 멤버변수에 값들을 넣어줘요. 그래서 반드시 필요해요
public class PostVO {	//게시글
	int po_num,po_viewCount;	
	String po_title,po_content;
	String po_date;
	int po_notice;
	
	String po_mb_id; //외래키들
	int po_bo_num,po_pc_num;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PostVO other = (PostVO) obj;
		return po_num == other.po_num;
	}
	@Override
	public int hashCode() {
		return Objects.hash(po_num);
	}
	public PostVO(String po_title, String po_content, String po_mb_id, int po_pc_num) {
		this.po_title=po_title;
		this.po_content=po_content;
		this.po_mb_id=po_mb_id;
		this.po_pc_num=po_pc_num;
	}



}
