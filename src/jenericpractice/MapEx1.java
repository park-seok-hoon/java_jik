package jenericpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String,String>(); //클래스 형변환
		
	map.put("abc123", "abc123!");
	map.put("def456","abc123!"); //비번이 중복 -> value가 중복 가능
	map.put("abc123", "qwe123"); //아이디 중복 -=>ket는 중복이 안됨
								//그러므로 아이디 추가가 안됨,중복된 키는value가 변경이 됨
	System.out.println(map);  
	map.put("admin","admin");
	map.put("def", "def");

	System.out.println(map.remove("abc123")); //key는 중복 불가능 value는 중복 가능
	System.out.println(map);
		
	
	//Set을 keySet으로 형변환하여 사용하는 반복문 예제
	
	Set<String> set = map.keySet(); //set은 key 값을 가지고 있는 배열, 
	
	for(String tmp : set) { 
		String value =map.get(tmp);
		System.out.println("[" + tmp + " , " + value + "]");
		
	}
	
	//entrySet을 이용한 반복문 예제 ,entryset()이라는 제네릭 클래스를 만드는 것
	//entrySet은 오로지 Map에서만 사용이 가능하다.
	Set<Map.Entry<String,String>> entryset = map.entrySet();
	
	for(Map.Entry<String, String> tmp : entryset)
	{
		System.out.println("[" + tmp.getKey() + " , " + tmp.getValue() + "]");
		
	}
	//내부 클래스의 인스턴스를 생성하는 예제 
	
	
	}
}






