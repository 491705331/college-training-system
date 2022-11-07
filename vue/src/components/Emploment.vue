<template>
    <el-container>
        <el-aside>
            <div ref="echart_main1" id="echart_main1" style="width: 700px; height: 500px; margin-top:100px"></div>
        </el-aside>
        <el-container>
            <el-header><div ref="echart_main2" id="echart_main2" style="width: 500px; height: 300px; margin-top:100px"></div></el-header>
            <el-main><div ref="echart_main3" id="echart_main3" style="width: 500px; height: 300px;"></div></el-main>
        </el-container>
    </el-container>   
</template>

<script>
export default {
    name:'Emploment',
    methods:{
        myCharts(){
            var myChart1 = this.$echarts.init(document.getElementById('echart_main1'),'dark');
            var option = {
                title:{
                    text:'近五年来就业人数统计'
                },
                tooltip: {},
                legend: {
                    data: ['已就业','未就业']
                },
                xAxis: {
                    type: 'category',
                    data: ['2018', '2019', '2020', '2021','2022']
                },
                yAxis: {},
                color:[
                    '#91cc75','#fac858'
                ],
                series: [
                    {
                        type: 'bar',
                        name: '已就业',
                        data: [10,10,20,30,40]
                    },
                    {
                        type: 'bar',
                        name: '未就业',
                        data: [1,1,1,1,1]
                    }
                ]
            };

            var myChart2 = this.$echarts.init(document.getElementById('echart_main2'),'dark');
            var option2 = {
                title:{
                    text:'历届毕业平均薪资'
                },
                xAxis: {
                type: 'category',
                data: ['2018', '2019', '2020','2021','2022']
            },
                yAxis: {
                type: 'value'
            },
                series: [
                {
                data: [120, 200, 150,180,220],
                type: 'line'
                }
            ]
            }

            var myChart3 = this.$echarts.init(document.getElementById('echart_main3'),'dark');
            var option3 = {
                title:{
                    text: '总就业率',
                    left: 'center'
                },
                tooltip: {
                    trigger: 'item'
                },
                legend: {
                    orient: 'vertical',
                    left: 'left',
                    data: ['成功就业','未成功就业']
                },
                series: [
                    {
                        type: 'pie',
                        data: [
                            {
                                value: 10,
                                name: '成功就业'
                            },
                            {
                                value:10,
                                name: '未成功就业'
                            }
                        ],
                        radius: '50%',
                        emphasis: {
                            itemStyle: {
                                shadowBlur: 10,
                                shadowOffsetX: 0,
                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                            }
                        }
                    }
                ]
            }
             // 使用刚指定的配置项和数据显示图表。
            myChart1.setOption(option);
            myChart2.setOption(option2);
            myChart3.setOption(option3);
            }
        
    },
    mounted(){
        this.myCharts()
    }
}
</script>


<style scoped>
.el-aside{
    width:60% !important;
    height:100vh;
    padding-left: 40px;
}
.el-header{
    height: 50vh !important;
    padding-right: 60px;
}
.el-main{
    height: 50vh;
    padding-right: 60px;
}
.el-container{
    background-color: rgb(51 51 51) ;
}
</style>