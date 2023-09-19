package exceptions;

public class ProductSales extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ProductSales (String txt) {
		super(txt);
	}

}
