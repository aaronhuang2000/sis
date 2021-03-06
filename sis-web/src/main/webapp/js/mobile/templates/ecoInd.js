app.controller('ecoIndTabCtrl', function($scope) {
	 var totalPowerChart = echarts.init(document.getElementById('totalPowerChart'));
	 var takeCoalChart = echarts.init(document.getElementById('takeCoalChart'));
	 var unitEconomyChart = echarts.init(document.getElementById('unitEconomyChart'));
	 var option_totalPowerChart={
		series : [
			{
	            type: 'gauge',
	            min: 0,
	            max: 140,
	            radius: '100%',
	            startAngle:315,
	            endAngle:-315,
	            axisLine: {            // 坐标轴线
	                lineStyle: {       // 属性lineStyle控制线条样式
	                    width: 10
	                }
	            },
	            axisTick: {            // 坐标轴小标记
	                length: 12,        // 属性length控制线长
	                lineStyle: {       // 属性lineStyle控制线条样式
	                    color: 'auto'
	                }
	            },
	            splitLine: {           // 分隔线
	                length: 10,         // 属性length控制线长
	                lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
	                    color: 'auto'
	                }
	            },
	            title : {
	                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
	                    fontSize: 12,
	                },
	                offsetCenter: ["20%", '-30%'],   
	            },
	            detail:{
	                textStyle:{
	                    fontSize:20
	                }
	            },
	            pointer: {
	                width:4
	            },
	            data:[{value: 40, name: '发电总功率（MW）'}]
	        }
		]
	};
	var option_takeCoal={
	    series: [
	    	{
	            type: 'gauge',
	            min: 200,
	            max: 350,
	            radius: '100%',
	            startAngle:135,
	            endAngle:-135,
	            axisLine: {            // 坐标轴线
	                lineStyle: {       // 属性lineStyle控制线条样式
	                    width: 10
	                }
	            },
	            axisTick: {            // 坐标轴小标记
	                length: 12,        // 属性length控制线长
	                lineStyle: {       // 属性lineStyle控制线条样式
	                    color: 'auto'
	                }
	            },
	            splitLine: {           // 分隔线
	                length: 10,         // 属性length控制线长
	                lineStyle: {       // 属性lineStyle（详见lineStyle）控制线条样式
	                    color: 'auto'
	                }
	            },
	            title : {
	                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
	                    fontSize: 12,
	                },
	                offsetCenter: ["-10%", '-30%'],  
	            },
	            pointer: {
	                width:4
	            },
	            detail:{
	                textStyle:{
	                    fontSize:20
	                }
	            },
	            data:[{value: 280, name: '供电煤耗（g/kwh）'}]
	        }
	    ]
	};
	setInterval(function () {
		option_totalPowerChart.series[0].data[0].value = (Math.random() * 140).toFixed(2) - 0;
	    totalPowerChart.setOption(option_totalPowerChart, true);
		option_takeCoal.series[0].data[0].value = (Math.random() * 150+200).toFixed(2) - 0;
		takeCoalChart.setOption(option_takeCoal, true);
	},2000);
	var option_unitEconomyChart = {
		    color: ['#3398DB'],
		    title:{
		        text:"本月每日发电量统计图",
		        textStyle:{
		            fontSize:12
		        }
		        
		    },
		    tooltip : {
		        trigger: 'axis',
		        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
		            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
		        }
		    },
		    grid: {
		        left: '3%',
		        right: '2%',
		        bottom:"40",
		        containLabel: true
		    },
		    xAxis : [
		        {
		            type : 'category',
		            data : ['1号', '2号', '3号', '4号', '5号', '6号', '7号','8号', '9号', '10号', '11号', '12号', '13号', '14号','15号', '16号', '17号', '18号', '19号', '20号', '21号','22号', '23号', '24号', '25号', '26号', '27号', '28号', '29号', '30号', '31号'],
		            axisTick: {
		                alignWithLabel: true
		            }
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value',
		            name:"发电量(Mwh)"
		        }
		    ],
		     dataZoom: [
		            {
		                show: true,
		                start: 80,
		                end: 100
		            },
		            {
		                type: 'inside',
		                start: 94,
		                end: 100
		            }
		        ],
		    series : [
		        {
		            name:'发电量',
		            type:'bar',
		            barWidth: '60%',
		            data:[10, 52, 200, 334, 390, 330, 220,10, 52, 200, 334, 390, 330, 220,10, 52, 200, 334, 390, 330, 220,10, 52, 200, 334, 390, 330, 220,232,342,123]
		        }
		    ]
		};
	unitEconomyChart.setOption(option_unitEconomyChart);
});
