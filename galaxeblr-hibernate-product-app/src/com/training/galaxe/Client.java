package com.training.galaxe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.training.galaxe.dao.ProductDAO;
import com.training.galaxe.dao.ProductDAOImpl;
import com.training.galaxe.model.Product;

public class Client {

	Scanner scanner = new Scanner(System.in);
	int choice;
	List<Product> products = new ArrayList<Product>();
	int productId, price, quantityOnHand;
	String productName;
	ProductDAO productDAO = new ProductDAOImpl();
	Product product = new Product();

	public Client() {
	}

	public void productApp() {
		while (true) {

			System.out.println("==============Welcome to Galaxe Product App=========");
			System.out.println(" M E N U ");
			System.out.println("1. Add Product ");
			System.out.println("2. Update Product ");
			System.out.println("3. Delete Product ");
			System.out.println("4. Search Product By product id ");
			System.out.println("5. View All Products ");
			System.out.println("6. Search Product By product name ");

			System.out.println("9. E X I T");
			System.out.println("Enter your choice :");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("####Welcome to add product section####");
				System.out.println("Enter product id :");
				productId = scanner.nextInt();
				if (productDAO.isProductExists(productId)) {
					System.out.println("Product with product id : " + productId + "  already exists");
					break;
				}
				System.out.println("Enter product name :");
				productName = scanner.next();
				System.out.println("Enter product quantity on hand :");
				quantityOnHand = scanner.nextInt();
				System.out.println("Enter product price :");
				price = scanner.nextInt();
				Product product = new Product(productId, productName, quantityOnHand, price);
				productDAO.saveProduct(product);
				System.out.println("Product with product name : " + productName + "  saved successfully!!");
				break;
			case 2:
				System.out.println("Welcome To The Update Section");
				System.out.print("Enter Product ID to update: ");
				productId = scanner.nextInt();
				if (!productDAO.isProductExists(productId)) {
					System.out.println(
							"Product with product id : " + productId + "  does not exists, hence cannot be updated");
					break;
				}
				System.out.print("Enter new Product Name: ");
				productName = scanner.next();
				System.out.print("Enter new  Product Quantity On Hand: ");
				quantityOnHand = scanner.nextInt();
				System.out.print("Enter new Product Price: ");
				price = scanner.nextInt();

				product = new Product(productId, productName, quantityOnHand, price);
				productDAO.updateProduct(product);
				System.out.println("Product: " + productName + " Successfully Updated!");

				break;

			case 3:
				System.out.println("Welcome To The Delete Section");
				System.out.print("Enter Product ID to delete : ");
				productId = scanner.nextInt();
				if (!productDAO.isProductExists(productId)) {
					System.out.println(
							"Product with product id : " + productId + "  does not exists, hence cannot be deleted");
					break;
				}
				productDAO.deleteProduct(productId);
				System.out.println("Product: " + productId + " Successfully Deleted!");

				break;
			case 4:
				System.out.println("Welcome To The Search Section - By product Id");
				System.out.print("Enter Product ID to search : ");
				productId = scanner.nextInt();
				if (!productDAO.isProductExists(productId)) {
					System.out.println("Product with product id : " + productId + "  does not exists");
					break;
				}
				product = productDAO.getProduct(productId);
				System.out.println("Product details  " + product);

				break;
			case 5:
				System.out.println("Welcome To The View All Products Section");

				products = productDAO.getProduct();
				if (products.size() == 0) {
					System.out.println("No products found");
				} else {
					System.out.println(products);
				}
				break;
			case 6:
				System.out.println("Welcome To The View  Products Section - Search by product name");
				System.out.print("Enter Product name to search : ");
				productName = scanner.next();
				products = productDAO.searchProductByName(productName);
				if (products.size() == 0) {
					System.out.println("No products found with : "+productName);
				} else {
					System.out.println(products);
				}
				break;
			case 9:
				System.out.println("Thanks for using my product app");
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {

		Client c = new Client();
		c.productApp();

	}

}
