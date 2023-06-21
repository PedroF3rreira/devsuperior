package devsuperior.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import devsuperior.entities.enums.OrderStatus;

public class Order {
	private List<OrderItem> orderItens;
	private Double totalPrice;
	private OrderStatus status;
	private Date createdAt;
	private Cliente client;

	public Order( OrderStatus status) {
		this.status = status;
		this.createdAt = new Date();
		this.orderItens  = new ArrayList<>();
	}
	
	public void addItem(OrderItem orderItem) {
		if(orderItem != null) {
			this.orderItens.add(orderItem);
		}
	}
	
	public void removeItem(OrderItem orderItem) {
		this.orderItens.remove(orderItem);
	}
	
	public Double total() {
		this.totalPrice = 0.0;
		for(OrderItem orderItem : this.orderItens) {
			this.totalPrice += orderItem.suTotal();
		}
		return this.totalPrice;
	}
	
	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItens() {
		return orderItens;
	}

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}
	
	
	
	
}
