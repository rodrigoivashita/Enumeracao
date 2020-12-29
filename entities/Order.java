package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enum.OrderStatus;

public class Order {

	private Date data;
	private OrderStatus status;

	private Client cient;
	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date data, OrderStatus status, Client cient, List<OrderItem> items) {
		this.data = data;
		this.status = status;
		this.cient = cient;
		this.items = items;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCient() {
		return cient;
	}

	public void setCient(Client cient) {
		this.cient = cient;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);

	}

	public double total(double sum) {
		for (OrderItem o : items) {
			sum = o.subTotal();
		}
		return sum;
	}

}
