package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products = new ArrayList <Product>();

	public void addProduct(Product product) {
		products.add(product);
	}

	public void addProduct(Product product, Integer quantity) {
		
		
		if(quantity<=0)
			throw new IllegalArgumentException("Quantity mcannot be Zero");
		for (int i =0; i<quantity; i++){
			this.products.add(product);
		}
	}

	public BigDecimal getTotalNetPrice() {
		
		if (products.isEmpty()){
			return BigDecimal.ZERO;
		}
		else {
		BigDecimal total = new BigDecimal("0");
		for (Product product : products)
			total = total.add(product.getPrice());
		return total;
		}
	}

	public BigDecimal getTax() {
		return BigDecimal.ZERO;
		
		if (products.isEmpty()){
			return BigDecimal.ZERO;
		}
		else {
		BigDecimal total = new BigDecimal("0");
		for (Product product : products)
			total = total.add(product.getPrice().multiply(product.getTaxPercent()));
		}
		return total;
		}


		
	

	public BigDecimal getTotal() {
		return BigDecimal.ZERO;
	}
}
