package com.phoenixjcam.data.orderdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.phoenixjcam.data.orderdetails.dao.OrderDetailsDAO;
import com.phoenixjcam.data.orderdetails.model.OrderDetailsModel;

@Service
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService
{
	@Autowired
	private OrderDetailsDAO orderDetailsDAO;

	@Override
	public List<OrderDetailsModel> getOrderDetails()
	{
		List<OrderDetailsModel> list = orderDetailsDAO.getOrderDetails();

		return list;
	}

}
