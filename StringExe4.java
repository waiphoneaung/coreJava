package coreClass;

public class StringExe4 {
	public static void main(String[] args) {
		String products = "Pencil, Ruler, Eraser, Exercise Book";
		String prices = "100, 650,300.0,1200";
		String quantities = "8,5,3,10";
		
		String productArray [] = products.split(",");
		String priceArray [] = prices.split(",");
		String qtyArray [] = quantities.split(",");
		double total = 0;
		
	System.out.println("no.\tName\tPrice\tQty\tAmount");
		/*for (int i = 0; i < productArray.length; i++) {
		    String product = productArray[i];
		    double price = Double.parseDouble(priceArray[i]);
		    int quantity = Integer.parseInt(qtyArray[i]);
		    
		    String msg = String.format("Product: %s, Price : %s, Quantity: %s ", product,price,quantity);
			 System.out.println(msg);   
		    double totalCost = price * quantity;
		    System.out.println(" Total Cost: " + totalCost);
		}*/
	
	for (int i = 0; i < qtyArray.length; i++) {
		String name = productArray[i];
		double price = Double.parseDouble(priceArray[i]);
		int q = Integer.parseInt(qtyArray[i].trim());
		double amount = price * q;
		total += amount;
		String msg = String.format("%d\t %-15s \t%.1f \t%d \t%.1f", i+1, name, price, q, amount);
		System.out.println(msg);
	}
	System.out.println("Total = " +total);
				}			
	}

