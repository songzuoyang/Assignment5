
public abstract class DessertItem {

	public static String name;
	public int cost;

	public final String getName() {
		return name;
	}

	public abstract double getCost();

	public DessertItem() {

	}

	public DessertItem(String name) {
		DessertItem.name = name;
	}
	public abstract String print();

}

class Candy extends DessertItem {
	 double weight;
	 double pricePerPound;
	 String name;
	
	public Candy(String Name, double Weight, int PricePerPound) {
		name = Name;
		weight = Weight;
		pricePerPound = PricePerPound;

	}
	public double getCost() {
		return weight*pricePerPound;
	}
	public String print() {
		int n = name.length();
		String info = String.valueOf(weight) + " lbs. @ " + String.valueOf(DessertShoppe.cents2dollarsAndCents(pricePerPound)) + " /lb." + "\n" + name;
		for(int i =1;i<=DessertShoppe.rowlength-n;i++) {
			info += " ";
		}
		info += DessertShoppe.cents2dollarsAndCents(weight*pricePerPound); 
			 
		return info;
	}

}

class Cookie extends DessertItem {
	int number;
	double price;
	String name;
	public Cookie(String Name, int Number, double Price) {
		number = Number;
		price = Price;
		name = Name;

	}

	@Override
	public double getCost() {
		
		return number * (price/12);
	}

	@Override
	public String print() {
		int n = name.length();
		String info = String.valueOf(number) + " @ " + String.valueOf(DessertShoppe.cents2dollarsAndCents(price)) + " /dz" + "\n";
		info += name;
		for (int i=1;i<=DessertShoppe.rowlength-n;i++) {
			info += " ";
		}
		info += DessertShoppe.cents2dollarsAndCents(getCost());
		return info;
	}

}

class IceCream extends DessertItem {
	double price;
	String name;
	public IceCream() {
		
	}
	public IceCream(String Name, double Price) {
		name = Name;
		price = Price;

	}
	@Override
	public double getCost() {
		
		return price;
	}
	@Override
	public String print() {
		int n = name.length();
		String info = name;
		for (int i=1;i<=DessertShoppe.rowlength-n;i++) {
			info += " ";
		}
		info += DessertShoppe.cents2dollarsAndCents(price);
		return info;
	}

}

class Sundae extends IceCream {
	double icecreamprice;
	double toppingprice;
	String icecreamname;
	String toppingname;
	public Sundae(String icecreamName, double icecreamPrice, String toppingName, double toppingPrice) {
		icecreamname = icecreamName;
		toppingname = toppingName;
		icecreamprice = icecreamPrice;
		toppingprice = toppingPrice;

	}
	
	public double getCost() {
		return icecreamprice + toppingprice;
		
	}
	@Override
	public String print() {
		int n = icecreamname.length();
		String info =toppingname +" Sundae with\n";
		info += icecreamname;
		for (int i=1;i<=DessertShoppe.rowlength-n;i++) {
			info += " ";
		}
		info += DessertShoppe.cents2dollarsAndCents(icecreamprice+toppingprice);
		return info;
	}

}
