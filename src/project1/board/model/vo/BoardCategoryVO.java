package project1.board.model.vo;

import java.util.Objects;

public class BoardCategoryVO { //게시판 분류
	int bc_num;
	String bc_title;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(bc_num);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardCategoryVO other = (BoardCategoryVO) obj;
		return bc_num == other.bc_num;
	}
	
	public BoardCategoryVO(String bc_title) {
		super();
		this.bc_title = bc_title;
	}
	
	
	
	
}
