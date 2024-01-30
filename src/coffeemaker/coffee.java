package coffeemaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class coffee {

	int coffeenum; //커피 번호

	String name; //이름

	List<coffeeprice> cofelist =new ArrayList<coffeeprice>(); 
	
	@Override
	public int hashCode() {
		return Objects.hash(coffeenum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		coffee other = (coffee) obj;
		return Objects.equals(coffeenum, other.coffeenum);
	}

	
	public coffee(int coffeenum) {
		super();
		this.coffeenum = coffeenum;
	}

	public coffee(int coffeenum, String name) {
		super();
		this.coffeenum = coffeenum;
		this.name = name;
	}

	@Override
	public String toString() {
		return "coffee [coffeenum=" + coffeenum + ", name=" + name + ", cofelist=" + cofelist + "]";
	}

	
	
	
}
