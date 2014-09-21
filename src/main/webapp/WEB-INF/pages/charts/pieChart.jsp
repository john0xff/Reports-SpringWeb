<html lang="en">
<head>
    <title id='Description'>jqxChart Line Series Example</title>
    <link rel="stylesheet" href="${ pageContext.request.contextPath }/res/jqwidgets/chartJson/jqx.base.css" type="text/css" />
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/jqwidgets/pieChart/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/jqwidgets/pieChart/jqxcore.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/jqwidgets/pieChart/jqxdata.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/jqwidgets/pieChart/jqxchart.core.js"></script>
    <script type="text/javascript" src="${ pageContext.request.contextPath }/res/jqwidgets/pieChart/jqxdraw.js"></script>
    <script type="text/javascript">

$(document).ready(function () {
    // prepare chart data as an array
    var source =
    {
			 datatype: "json",
			 datafields: [
				{ name: 'browser' },
				{ name: 'share' }
			],
			url: '${ pageContext.request.contextPath }/getPieChartData'
    };

    var dataAdapter = new $.jqx.dataAdapter(source, { async: false, autoBind: true, loadError: function (xhr, status, error) { alert('Error loading "' + source.url + '" : ' + error); } });

    // prepare jqxChart settings
    var settings = {
        title: "Mobile browsers share",
        description: "(source: wikipedia.org)",
        enableAnimations: true,
        showLegend: true,
        showBorderLine: true,
        legendLayout: { left: 700, top: 160, width: 300, height: 200, flow: 'vertical' },
        padding: { left: 5, top: 5, right: 5, bottom: 5 },
        titlePadding: { left: 0, top: 0, right: 0, bottom: 10 },
        source: dataAdapter,
        colorScheme: 'scheme02',
        seriesGroups:
            [
                {
                    type: 'pie',
                    showLabels: true,
                    series:
                        [
                            { 
                                dataField: 'share',
                                displayText: 'browser',
                                labelRadius: 170,
                                initialAngle: 15,
                                radius: 145,
                                centerOffset: 0,
                                formatFunction: function (value) {
                                    if (isNaN(value))
                                        return value;
                                    return parseFloat(value) + '%';
                                },
                            }
                        ]
                }
            ]
    };

    // setup the chart
    $('#chartContainer').jqxChart(settings);
});
</script>
</head>
<body class='default'>
<div id='chartContainer' style="width: 850px; height: 500px;">
</div>
</body>
</html>