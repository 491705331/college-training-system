<template>
    <el-container>
            <img src="../assets/static/discuss.jpg" id="discuss">
            <div class="discuss_text">
            <div>Why you Need ETP</div>
            <div>&nbsp;&nbsp;ETP solution takes a simulation company designed according to the standards of multinational enterprises as a platform, adapts real business project development cases into complete and standardized training programs, and fully runs the training content of corporate culture and professional quality training, IT skills training, business process practice and other practical training content into the operation process of the simulation company. During the practical training, the trainees will be engaged in the complete process development from customer demand analysis to test acceptance with strict standards, and experience the requirements of first-class enterprises in terms of professionalism and team ability. Through the three modules of foreign language strengthening, IT skills strengthening and simulated company training, students can quickly complete the cognitive transformation from students to professionals, master front-line practical skills, quickly narrow the gap between personal ability and the actual needs of enterprises, and fundamentally improve their employability and career development ability.</div>
            </div>
            <div class="discuss_circle_1"></div>
            <div class="discuss_circle_2"></div>
            <div class="discuss_circle_3"></div>
            <div class="discuss_div">
                <div class="discuss_circle_4"></div>
            </div>
    </el-container>
</template>

<script>
export default {
    name:'Etp'
}
</script>

<style scoped>
.el-container{
    overflow: hidden;
    height: 100vh;
}
/* 图片样式 */
#discuss{
    position: absolute;
    top:100px;
    left:20px;
    border-radius: 20px;
}

/* 字体样式 */
.discuss_text{
    position: absolute;
    left:800px;
    top:50px;
}

.discuss_text div:nth-child(1){
    margin-top: 20px;
    margin-left: 10px;
    line-height: 50px;
    font-size: 50px;
    font-family:"Yun-RE";
    text-align: center;
}

.discuss_text div:nth-child(2){
    margin-left: 50px;
    width:600px;
    font-family:"Yun-RE";
    font-size: 30px;
    margin-top: 40px;
    word-break:keep-all;
    line-height: 25px;
}

.discuss_circle_1{
    position: absolute;
    width: 50px;
    height: 50px;
    left:1350px;
    top:100px;
    background-color: pink;
    border-radius: 50%;
    opacity: 0.3;
    z-index: -1;
}

.discuss_circle_2{
    position: absolute;
    width: 60px;
    height: 60px;
    left:800px;
    top:20px;
    background-color: pink;
    border-radius: 50%;
    opacity: 0.5;
    z-index: -1;
}

.discuss_circle_3{
    position: absolute;
    width: 50px;
    height: 50px;
    left:1200px;
    top:610px;
    background-color: pink;
    border-radius: 50%;
    opacity: 0.4;
    z-index: -1;
}

.discuss_div{
    position: absolute;
    width: 800px;
    height: 400px;
    left:-400px;
    bottom:65px;
    z-index: -1;
    overflow: hidden;
}

.discuss_circle_4{
    position: absolute;
    width: 800px;
    height: 800px;
    background-color: pink;
    border-radius: 50%;
    opacity: 0.5;
    z-index: -1;
}

</style>