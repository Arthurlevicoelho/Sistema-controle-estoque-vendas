package Sales;

import java.util.ArrayList;
import java.util.List;

import exceptions.ProductSales;

public class ItemSale {

	private int id;
	private int quantity;
	private double subTotal;
	List<Product> product = new ArrayList<Product>();

	public ItemSale() {
	}

	public ItemSale(int id, List<Product> product) {
		super();
		this.id = id;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public void productSale(int quantitySale, String name) throws ProductSales {
		Product prod = new Product();

		for (Product p : product) {
			if (p.getName().contains(name)) {
				if (p.getQuantityInStock() < quantitySale) {
					throw new ProductSales(
							"O numero de produtos em venda é maior do que o numero de produtos em estoque. O numero em estoque é : "
									+ p.getQuantityInStock());

				} else {
					p.setQuantityInStock(p.getQuantityInStock() - quantitySale);
					subTotalSale(name,quantitySale);
				}
				quantity = quantitySale;
				return;
			}

		}
		if (!prod.productInStock(name)) {
			throw new ProductSales("Produto não encontrado no estoque");

		}
		quantity = quantitySale;

	}

	public void addItemSale(Product prod) {
		product.add(prod);
	}

	public void subTotalSale(String name,int quantity) {
		
		for (Product p : product) {
			if(p.productInStock(name))
				
			subTotal = p.getPrice() * quantity;
		}
	}

	@Override
	public String toString() {

		return String.valueOf(id) + ", quantidade de produtos sendo vendido:" + String.valueOf(quantity) + ", produto: "
				+ product + ", valor total a ser pago: " + subTotal;
	}
}
