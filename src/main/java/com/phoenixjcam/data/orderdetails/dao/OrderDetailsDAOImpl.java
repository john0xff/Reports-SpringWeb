package com.phoenixjcam.data.orderdetails.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.phoenixjcam.data.orderdetails.model.OrderDetailsModel;

@Repository
public class OrderDetailsDAOImpl implements OrderDetailsDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<OrderDetailsModel> getOrderDetails()
	{
		@SuppressWarnings("unchecked")
		List<OrderDetailsModel> list = getCurrentSession().createQuery("from OrderDetailsModel").list();

		return list;
	}

}
