
import java.util.ArrayList;

public class Checkout {
	ArrayList<DessertItem>Item = new ArrayList<DessertItem>();

	public int numberOfItems() {
		return Item.size();
	}

	public void enterItem(DessertItem item) {
		int index = Item.size();
		Item.add(index, item);
	}

	public void clear() {
		Item.clear();
	}

	public int totalCost() {
		int totalcost = 0;
		for (int i = 0;i<Item.size();i++) {
			totalcost += (Item.get(i)).getCost();
		}
		return totalcost;
	}

	public int totalTax() {
		double totaltax = totalCost() * DessertShoppe.taxrate;
		return (int) totaltax;
	}

	@Override
	public String toString() {
		String receipt = "\n     " + DessertShoppe.storeName + "\n     " + "--------------------" + "\n\n";
		for (int i = 0; i < Item.size(); i++) {
			receipt += Item.get(i).print() + "\n";
		}
		receipt += "\nTax";
		for (int i = 1; i <= DessertShoppe.rowlength - 3; i++) {
			receipt += " ";
		}
		receipt += DessertShoppe.cents2dollarsAndCents((double) totalTax());
		receipt += "\nTotal Cost";
		for (int i = 1; i <= DessertShoppe.rowlength - 11; i++) {
			receipt += " ";
		}
		receipt += DessertShoppe.cents2dollarsAndCents((double) (totalCost() + totalTax()));
		return receipt;
	}

}
