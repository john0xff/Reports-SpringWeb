package com.phoenixjcam.data.orderdetails.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Needs to implement serializable - double @Id, @Id is a primitive type which is by default serializable
 * 
 * @author Bart88
 *
 */
@Entity
@Table(name = "orderdetails", catalog = "db_jv_crm")
public class OrderDetailsModel implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "orderNumber", nullable = false)
	private int orderNumber;

	@Id
	@Column(name = "productCode", nullable = false, length = 15)
	private String productCode;

	@Column(name = "quantityOrdered", nullable = false)
	private int quantityOrdered;

	@Column(name = "priceEach", nullable = false)
	private double priceEach;

	@Column(name = "orderLineNumber", nullable = false)
	private short orderLineNumber;

	public int getOrderNumber()
	{
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	public String getProductCode()
	{
		return productCode;
	}

	public void setProductCode(String productCode)
	{
		this.productCode = productCode;
	}

	public int getQuantityOrdered()
	{
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered)
	{
		this.quantityOrdered = quantityOrdered;
	}

	public double getPriceEach()
	{
		return priceEach;
	}

	public void setPriceEach(double priceEach)
	{
		this.priceEach = priceEach;
	}

	public short getOrderLineNumber()
	{
		return orderLineNumber;
	}

	public void setOrderLineNumber(short orderLineNumber)
	{
		this.orderLineNumber = orderLineNumber;
	}

}
