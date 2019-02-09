package pl.edu.agh.mwo.invoice.product;

import java.math.BigDecimal;

public abstract class Product {
	private static final BigDecimal PriceWithTax = null;

	private final String name;

	private final BigDecimal price;

	private final BigDecimal taxPercent;

	protected Product(String name, BigDecimal price, BigDecimal tax) {

		
		
	if(name == null || name == "")	 {
		throw new IllegalArgumentException ("Wrong");		
	}
	else {
		this.name = name;
	}	
	
	
		
	if (price == null || price.intValue() <0 )	{
		throw new IllegalArgumentException ("Wrong");	
	}	
	else { 
		this.price = price;
	}
	
	
	
	
	if (tax == null || tax.intValue() <0 )	{
		throw new IllegalArgumentException ("Wrong");	
	}	
	else { 
		this.taxPercent = tax;
	}
	

	
			 
			 
			 
			 
	}

	public String getName() {
		return this.name;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public BigDecimal getTaxPercent() {
		return this.taxPercent;
	}

	public BigDecimal getPriceWithTax() {
		//return price.add(price.multiply(taxPercent));
		return this.price.multiply(this.taxPercent).add(this.price);
	}
}
