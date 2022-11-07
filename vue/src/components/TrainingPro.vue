<template>
    <el-container>
        <el-card class="box-card">
            <el-tabs type="border-card" :stretch="true">
                <el-tab-pane label="Java">
                    <div class="block">
                    <el-timeline>
                        <el-timeline-item timestamp="2018/4" placement="top">
                        <el-card>
                            <h4>JavaSE</h4>
                            <p>王小虎 提交于 2018/4/12 20:46</p>
                        </el-card>
                        </el-timeline-item>
                        <el-timeline-item timestamp="2018/6" placement="top">
                        <el-card>
                            <h4>JavaWeb</h4>
                            <p>王小虎 提交于 2018/4/3 20:46</p>
                        </el-card>
                        </el-timeline-item>
                        <el-timeline-item timestamp="2018/8" placement="top">
                        <el-card>
                            <h4>SSM+Springboot</h4>
                            <p>王小虎 提交于 2018/4/2 20:46</p>
                        </el-card>
                        </el-timeline-item>
                    </el-timeline>
                    </div>
                </el-tab-pane>
                <el-tab-pane label="Big Data"></el-tab-pane>
                <el-tab-pane label="Game design"></el-tab-pane>
                <el-tab-pane label="Network security"></el-tab-pane>
            </el-tabs>
        </el-card>
    </el-container>
</template>

<script>
export default {
    name:'TraningPro'
}
</script>

<style scoped>
.el-container{
    height: 100vh;
    overflow: hidden;
    justify-content: center;
    background-color: rgb(111, 109, 109);
}

.box-card{
    width:1200px;
    height: 100vh;
    background-color: #aeaeae;
    padding: 0;
}
.el-tabs--border-card{
    border: 0;
}
.el-tabs{
    height: 100vh;
}
.el-card{
    border: 0;
}

::v-deep .el-tabs__item {
color: rgb(255, 255, 255) !important;
height: 7vh;
background-color: rgb(111, 109, 109);
font-size: 30px;
font-family: 'Yun-RE';
}

::v-deep .el-tabs__item.is-active {
color: #f8c2af !important;
background-color: rgb(111, 109, 109);
}
</style>