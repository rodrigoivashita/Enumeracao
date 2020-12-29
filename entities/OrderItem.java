package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	private Product produtc;

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Double price, Product produtc) {
		this.quantity = quantity;
		this.price = price;
		this.produtc = produtc;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProdutc() {
		return produtc;
	}

	public void setProdutc(Product produtc) {
		this.produtc = produtc;
	}
	
	public double subTotal() {
		return price * quantity;
		
	}
}
