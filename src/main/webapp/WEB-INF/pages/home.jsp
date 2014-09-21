<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reports</title>
</head>
<body>
	<h3>home page of jquery reports</h3> <br>

	<!-- dynamic way -->
	<h4>Report - bar chart with json created dynamically</h4>
	<a href='${ pageContext.request.contextPath }/barChart'>dynamicBarChart</a><br>
	
	<h4>Report - pie chart with json created dynamically</h4>
	<a href='${ pageContext.request.contextPath }/pieChart'>dynamicPieChart</a><br>
	
</body>
</html>