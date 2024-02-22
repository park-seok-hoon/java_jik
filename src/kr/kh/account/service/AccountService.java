package kr.kh.account.service;

import java.util.List;

import kr.kh.account.model.vo.Category;
import kr.kh.account.model.vo.Item;
import kr.kh.account.model.vo.Type;
import pagination.Criteria;

public interface AccountService {

	List<Type> getTypeList();

	List<Category> getCategoryList(String type);

	List<Item> getItemListByDate(String datestr);

	List<Item> getItemListByDate(Criteria cri);
	
	boolean insertItem(Item item);

	boolean updateItem(Item item);

	boolean deleteItem(int it_num);


}
