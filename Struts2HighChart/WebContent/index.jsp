<!DOCTYPE html>
<html>
    <head>
        <title>State Population Report (Pie Chart)</title>
        
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="https://code.highcharts.com/highcharts.js"></script>
        
        <script type="text/javascript">
        
            $(document).ready(function () {
            	
                var populationDataArray = [];
                
                $.getJSON("population.action", function (data) {
                	
                    $.each(data.populationList, function (index) {
                    	
                        populationDataArray[index] = ['' + this.stateName + '', this.statePopulation];
                        
                    });

                    var chart = {
                        plotBackgroundColor: null,
                        plotBorderWidth: null,
                        plotShadow: false
                    };

                    var title = {
                        text: 'State Population Report (Pie Chart)'
                    };

                    var tooltip = {
                        pointFormat: '{series.name}: <b>{point.y}</b>'
                    };

                    var plotOptions = {
                        pie: {
                            allowPointSelect: true,
                            cursor: 'pointer',
                            dataLabels: {
                                enabled: true,
                                format: '<b>{point.name}</b>: {point.y}',
                                style: {
                                    fontSize: 10,
                                    color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                                }
                            }
                        }
                    };

                    var series = [{
                            type: 'pie',
                            name: 'State Population',
                            data: populationDataArray
                        }];

                    var json = {};
                    json.chart = chart;
                    json.title = title;
                    json.tooltip = tooltip;
                    json.series = series;
                    json.plotOptions = plotOptions;
                    $('#population').highcharts(json);
                });
            });
        </script>
    </head>
    <body>
        <div id="population" style="float: left;"></div>
    </body>
</html>
