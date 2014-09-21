package com.phoenixjcam.data.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenixjcam.data.products.dao.ProductsDAO;
import com.phoenixjcam.data.products.model.ProductsModel;

@Service
@Transactional
public class ProductsServiceImpl implements ProductsService
{
	@Autowired
	private ProductsDAO productsDAO;

	@Override
	public List<ProductsModel> getProducts()
	{
		return productsDAO.getProducts();
	}

}
