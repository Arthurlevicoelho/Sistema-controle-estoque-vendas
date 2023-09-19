package Sales;

import java.util.ArrayList;
import java.util.List;

import exceptions.ProductSales;

public class Product {

	private int id;
	private String name;
	private String description;
	private double price;
	private int quantityInStock;

	List<Product> product = new ArrayList<Product>();

	public Product() {

	}

	public Product(int id, String name, String description, double price, int quantityInStock) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void addProduct(Product prod) {
		product.add(prod);
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
	public boolean productInStock(String name) {
		
		for(Product p : product) {
			if(p.getName().contains(name)) {
				return true;
			}
		}
		
		return false;
	}


	@Override

	public String toString() {
		return String.valueOf(id) + ", " + name + ", " + String.valueOf(String.format("%.2f", price)) + ", "
				+ String.valueOf(quantityInStock);
	}

}
