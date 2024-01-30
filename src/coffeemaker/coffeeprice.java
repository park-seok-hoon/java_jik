package coffeemaker;

import java.util.Objects;



import lombok.Data;

@Data

public class coffeeprice {
	
	
	int price; //가격
	
	String lucky; //운세

	
	@Override
	public int hashCode() {
		return Objects.hash(price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		coffeeprice other = (coffeeprice) obj;
		return price == other.price;
	}

	public coffeeprice(int price) {
		super();
		this.price = price;
	}

	public coffeeprice(int price, String lucky) {
		super();
		this.price = price;
		this.lucky = lucky;
	}

	@Override
	public String toString() {
		return "coffeeprice [price=" + price + ", lucky=" + lucky + "]";
	}


}
