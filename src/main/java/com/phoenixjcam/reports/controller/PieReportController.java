package com.phoenixjcam.reports.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PieReportController
{
	@RequestMapping(value = "/pieChart", method = RequestMethod.GET)
	public ModelAndView dynamicPieChart()
	{
		ModelAndView modelAndView = new ModelAndView("charts/pieChart");

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
	@RequestMapping(value = "/getPieChartData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<?> getPieChartData()
	{
		List<PieChartModel> list = new ArrayList<PieChartModel>();
		list.add(new PieChartModel("Safari", 51.2));
		list.add(new PieChartModel("Opera", 10.0));
		list.add(new PieChartModel("Nokia", 0.3));
		list.add(new PieChartModel("Andro", 23.0));
		list.add(new PieChartModel("Black", 2.7));
		list.add(new PieChartModel("Other", 12.8));

		return list;
	}

	class PieChartModel
	{
		private String browser;
		private double share;

		public PieChartModel()
		{
			// TODO Auto-generated constructor stub
		}

		public PieChartModel(String browser, double share)
		{
			this.browser = browser;
			this.share = share;
		}

		public String getBrowser()
		{
			return browser;
		}

		public void setBrowser(String browser)
		{
			this.browser = browser;
		}

		public double getShare()
		{
			return share;
		}

		public void setShare(double share)
		{
			this.share = share;
		}

	}

}
