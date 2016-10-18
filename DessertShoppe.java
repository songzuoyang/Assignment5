import java.text.DecimalFormat;

public class DessertShoppe {
	static double taxrate = 0.065;
	static String storeName = "M & M Dessert Shoppe";
	static int rowlength = 25;

	public static String cents2dollarsAndCents(double cents) {
		float dollars = (float) cents / 100;
		DecimalFormat df = new DecimalFormat("0.00");
		String dollarsandcents = df.format(dollars);
		return dollarsandcents;
	}

}
