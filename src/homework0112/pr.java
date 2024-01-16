package homework0112;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class pr {
	public static void main(String args[])
	{
		List<String> departlist=new ArrayList<>(
			Arrays.asList("컴퓨터공학과","전자공학과","토목공학과","화학공학과","유아교육과",
					"경제학과","법학과","간호학과"));
		
	
List<String> distinctLi= departlist.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(departlist);
	}
}
