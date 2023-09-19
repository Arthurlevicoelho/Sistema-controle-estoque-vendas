package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Sales.ItemSale;
import Sales.Product;
import exceptions.ProductSales;

public class Program {

	public static void main(String[] args) throws ProductSales {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> product = new ArrayList<Product>();
		product.add(new Product(1001, "Caixa de direcao", "Melhora o consumo do caminhao", 2000.00, 5));
		product.add(new Product(1009, "Unidade", "Melhora o consumo do caminhao", 2000.00, 5));
		product.add(new Product(1009, "Motor", "Melhora o consumo do caminhao", 10000.00, 2));
		ItemSale item = new ItemSale();
		Product prod = new Product();
		 
		for (int i = 0; i < product.size(); i++) {
			prod.addProduct(product.get(i));
			item.addItemSale(product.get(i));

		}
		System.out.println(product.size());
		System.out.println();

		try {
			System.out.print("Digite o nome do produto que deseja comprar :");
			String name = sc.nextLine();
			System.out.print("Digite a quantidade que voce deseja: ");
			int quantity = sc.nextInt();

			item.productSale(quantity, name);
			System.out.println(item);

		} catch (ProductSales e) {
			e.getMessage();
			e.printStackTrace();
		}

	}

}
