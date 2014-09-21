package com.phoenixjcam.reports.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.phoenixjcam.data.orderdetails.model.OrderDetailsModel;
import com.phoenixjcam.data.orderdetails.service.OrderDetailsService;
import com.phoenixjcam.data.products.model.ProductsModel;
import com.phoenixjcam.data.products.service.ProductsService;

@Controller
public class BarReportController
{
	@Autowired
	ProductsService productService;

	@Autowired
	OrderDetailsService orderDetailsService;

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public void dataTest()
	{
		List<ProductsModel> productList = productService.getProducts();
		productList.get(2);

		List<OrderDetailsModel> orderDetailsList = orderDetailsService.getOrderDetails();
		orderDetailsList.get(1);

	}

	/**
	 * need to produce chart report by 2 types of data - |_ axis x and y it'll be JSON file and axis x -
	 * 
	 * @return
	 */
	@RequestMapping(value = "dynamicJsonFileTest", method = RequestMethod.GET)
	public ModelAndView generateDynamicJsonFile()
	{
		ModelAndView modelAndView = new ModelAndView("");

		List<ProductsModel> productList = productService.getProducts();
		productList.get(2);

		List<OrderDetailsModel> orderDetailsList = orderDetailsService.getOrderDetails();
		orderDetailsList.get(1);

		return modelAndView;
	}

	@RequestMapping(value = "/barChart", method = RequestMethod.GET)
	public ModelAndView dynamicBarChart()
	{
		ModelAndView modelAndView = new ModelAndView("charts/barChart");

		return modelAndView;
	}

	/**
	 * TODO data base layer with model, dao, service 
	 * for now data generated with PieChartModel
	 * DAO can have different options of getting data from db 
	 * so chart can display it as long it'll have properties browser and share
	 * if it'll have more properties to display, we need to change chart control or modify existing one
	 * 
	 * @return
	 */
	@RequestMapping(value = "/getBarChartData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<BarReportController.BarChartModel> getDynamicJsonFile()
	{
		List<BarReportController.BarChartModel> list = new ArrayList<BarReportController.BarChartModel>();
		list.add(new BarChartModel(1, "Cars", "70"));
		list.add(new BarChartModel(2, "Trains", "170"));
		list.add(new BarChartModel(3, "Plains", "870"));

		return list;
	}

	public class BarChartModel
	{

		private int id;

		private String productKind;

		private String quantity;

		public BarChartModel()
		{
			// TODO Auto-generated constructor stub
		}

		public BarChartModel(int id, String productKind, String quantity)
		{
			this.id = id;
			this.productKind = productKind;
			this.quantity = quantity;
		}

		public int getId()
		{
			return id;
		}

		public void setId(int id)
		{
			this.id = id;
		}

		public String getProductKind()
		{
			return productKind;
		}

		public void setProductKind(String productKind)
		{
			this.productKind = productKind;
		}

		public String getQuantity()
		{
			return quantity;
		}

		public void setQuantity(String quantity)
		{
			this.quantity = quantity;
		}

	}

}
