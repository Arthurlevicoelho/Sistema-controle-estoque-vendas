package Sales;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sale {

	private int id;
	private Date date;
	private double total;

	List<ItemSale> itemSales = new ArrayList();

	public Sale() {
	}

	public Sale(int id, Date date, double total, List<ItemSale> itemSales) {
		super();
		this.id = id;
		this.date = date;
		this.total = total;
		this.itemSales = itemSales;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<ItemSale> getItemSales() {
		return itemSales;
	}

	public void setItemSales(List<ItemSale> itemSales) {
		this.itemSales = itemSales;
	}

}
