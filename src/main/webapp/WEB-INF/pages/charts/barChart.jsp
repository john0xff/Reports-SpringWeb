<html lang="en">
<head>
    <title id='Description'>jqxChart Line Series Example</title>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/res/jqwidgets/chartJson/jqx.base.css" type="text/css" />
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/jqwidgets/chartJson/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/jqwidgets/chartJson/jqxcore.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/jqwidgets/chartJson/jqxdata.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/jqwidgets/chartJson/jqxchart.core.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/jqwidgets/chartJson/jqxdraw.js"></script>
    <script type="text/javascript">

	$(document).ready(function () {

		var source =
		{
			 datatype: "json",
			 datafields: [
				{ name: 'productKind' },
				{ name: 'quantity' }
			],
			url: '${ pageContext.request.contextPath }/getBarChartData'
		};

	   var dataAdapter = new $.jqx.dataAdapter(source,
		{
			autoBind: true,
			async: false,
			downloadComplete: function () { },
			loadComplete: function () { },
			loadError: function () { }
		});

		 var settings = {
                title: "Sales report",
                description: "some description",
                showLegend: true,
                enableAnimations: true,
                padding: { left: 5, top: 5, right: 5, bottom: 5 },
                titlePadding: { left: 90, top: 0, right: 0, bottom: 10 },
                source: dataAdapter,
                xAxis:
                    {
                        dataField: 'productKind',
                        showGridLines: true
                    },
                colorScheme: 'scheme02',
                seriesGroups:
                    [
                        {
                            type: 'column',
                            //columnsGapPercent: 50,
                            valueAxis:
                            {
                               // unitInterval: 5000,
                                displayValueAxis: true,
                                description: 'Quantity'
                            },
                            series: [
                                    { dataField: 'quantity', displayText: 'Quantity of product kind'}
                                ]
                        }
                    ]
            };

		// setup the chart
		$('#jqxChart').jqxChart(settings);
	});

    </script>
</head>
<body class='default'>
    <div id='jqxChart' style="width: 680px; height: 400px">
    </div>
</body>
</html>