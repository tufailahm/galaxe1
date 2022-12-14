package day4;

import java.util.Objects;

//Model class /POJO /Entity 
public class Product implements Comparable<Product> {
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;

	@Override
	public int compareTo(Product o) {
		if (this.price < o.price)
			return 0;
		else
			return -1;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int quantityOnHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		if (price < 0) {
			throw new NegativePriceException("Price cannot be negative");
		} else {
			this.price = price;
		}

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName, quantityOnHand);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && productId == other.productId && Objects.equals(productName, other.productName)
				&& quantityOnHand == other.quantityOnHand;
	}

}
