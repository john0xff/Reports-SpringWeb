package com.phoenixjcam.data.orderdetails.dao;

import java.util.List;

import com.phoenixjcam.data.orderdetails.model.OrderDetailsModel;

public interface OrderDetailsDAO
{
	public List<OrderDetailsModel> getOrderDetails();
}
