package com.ayrton.pratica.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name = "tb_order")
public class Pedido implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant moment;

	private Integer orderStatus;
	
//	private User client;

//	private Payment payment;

	public Pedido() {
	}

//	public pedido(Long id, Instant moment, OrderStatus orderStatus, User client) {
//		super();
//		this.id = id;
//		this.moment = moment;
//		setOrderStatus(orderStatus);
//		this.client = client;
//	}
	
	
	
	}
