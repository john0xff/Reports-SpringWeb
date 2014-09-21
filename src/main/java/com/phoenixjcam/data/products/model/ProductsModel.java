package com.phoenixjcam.data.products.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products", catalog = "db_jv_crm")
public class ProductsModel
{
	@Id
	@Column(name = "productCode", nullable = false, length = 15)
	private String productCode;

	@Column(name = "productName", nullable = false, length = 70)
	private String productName;

	@Column(name = "productLine", nullable = false, length = 50)
	private String productLine;

	@Column(name = "productScale", nullable = false, length = 10)
	private String productScale;

	@Column(name = "productVendor", nullable = false, length = 50)
	private String productVendor;

	@Column(name = "productDescription", nullable = false)
	private String productDescription;

	@Column(name = "quantityInStock", nullable = false)
	private short quantityInStock;

	@Column(name = "buyPrice", nullable = false)
	private double buyPrice;

	@Column(name = "MSRP", nullable = false)
	private double MSRP;

	public String getProductCode()
	{
		return productCode;
	}

	public void setProductCode(String productCode)
	{
		this.productCode = productCode;
	}

	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	public String getProductLine()
	{
		return productLine;
	}

	public void setProductLine(String productLine)
	{
		this.productLine = productLine;
	}

	public String getProductScale()
	{
		return productScale;
	}

	public void setProductScale(String productScale)
	{
		this.productScale = productScale;
	}

	public String getProductVendor()
	{
		return productVendor;
	}

	public void setProductVendor(String productVendor)
	{
		this.productVendor = productVendor;
	}

	public String getProductDescription()
	{
		return productDescription;
	}

	public void setProductDescription(String productDescription)
	{
		this.productDescription = productDescription;
	}

	public short getQuantityInStock()
	{
		return quantityInStock;
	}

	public void setQuantityInStock(short quantityInStock)
	{
		this.quantityInStock = quantityInStock;
	}

	public double getBuyPrice()
	{
		return buyPrice;
	}

	public void setBuyPrice(double buyPrice)
	{
		this.buyPrice = buyPrice;
	}

	public double getMSRP()
	{
		return MSRP;
	}

	public void setMSRP(double mSRP)
	{
		MSRP = mSRP;
	}

}
