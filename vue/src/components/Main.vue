<template>
<div>
    <section class="et-hero-tabs">
        <video src="../assets/static/mainpage_vedio.mp4" autoplay loop muted>  </video>
        <a class="btn_log" @click="$router.push('/login')">Login</a>
        <a class="btn_log" @click="$router.push('/login/register')">Register</a>
        <div class="title_font" id="title_font1">K<br>n<br>o<br>w<br>l<br>e<br>d<br>g<br>e<br><br>i<br>s</div>
        <div class="title_font" id="title_font2">p<br>o<br>w<br>e<br>r</div>
        <div class="title_font" id="title_font3">T<br>e<br>c<br>h<br>n<br>o<br>l<br>o<br>g<br>y<br><br>l<br>e<br>a<br>d<br>s</div>
        <div class="title_font" id="title_font4">t<br>h<br>e<br><br>f<br>u<br>t<br>u<br>r<br>e</div>
        <div class="et-hero-tabs-container">
            <a class="et-hero-tab" href="#tab-etp">ETP</a> 
            <a class="et-hero-tab" href="#tab-employment">Employment</a>
            <a class="et-hero-tab" href="#tab-train">Training programs</a> 
            <a class="et-hero-tab" href="#tab-enlists">Enlists</a>
            <span class="et-hero-tab-slider"></span> </div>
    </section>
    <main class="et-main">
    <section class="et-slide" id="tab-etp">
        <Etp/>
    </section>
    <section class="et-slide" id="tab-employment">
        <Emploment/>
    </section>
    <section class="et-slide" id="tab-train">
        <TrainingPro/>
    </section>
     <section class="et-slide" id="tab-enlists">
        <Enlists/>
    </section>
   </main>
</div>  
</template>
<script>
import $ from 'jquery';
import Emploment from './Emploment.vue'
import Enlists from './Enlists.vue'
import Etp from './Etp.vue'
import TrainingPro from './TrainingPro.vue'
export default {
    name:'Main',
    components:{
      Etp,
      Enlists,
      Emploment,
      TrainingPro
    }
    ,
     mounted(){
        require('../assets/js/headerscript.js')
    }
}
</script>

<style scoped>
/* 首页背景 */
video{
    position: absolute;
    width:100%;  
    height:100vh; 
    z-index: 1;
}

/* 首页文字 */
.title_font{
    position:absolute;
    font-family: "BinHuo-RE";
    font-size: 35px;
    color: whitesmoke;
    z-index: 1;
}

#title_font1{
    left:43%;
    top:20%;
}

#title_font2{
    left:48%;
    top:30%;
}

#title_font3{
    left:53%;
    top:10%;
}

#title_font4{
    left:58%;
    top:20%;
}
/* 导航样式 */
a {
  text-decoration: none;
}

.et-hero-tabs{
  display: flex;
  flex-direction: column;
  width: 100%;
  height: 100vh;
  position: relative;
  background: #000;
}

.et-hero-tabs-container {
  display: flex;
  flex-direction: row;
  position: absolute;
  bottom: 0;
  width: 100%;
  height: 10vh;
  box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
  background: #fff;
  z-index: 10;
}

.et-slide {
  align-items: center;
  height: 100vh;
  position: relative;                              
}

.et-hero-tabs-container--top {
  position: fixed;
  top: 0;
}

.et-hero-tab {
  display: flex;
  justify-content: center;
  align-items: center;
  flex: 1;
  color: #000;
  letter-spacing: 0.1rem;
  transition: all 0.5s ease;
  font-size: 0.8rem;
}

.et-hero-tab:hover {
  color: white;
  background: rgba(102, 177, 241, 0.8);
  transition: all 0.5s ease;
}

.et-hero-tab-slider {
  position: absolute;
  bottom: 0;
  width: 0;
  height: 6px;
  background: #66B1F1;
  transition: left 0.3s ease;
}

@media (min-width: 800px) {
  .et-hero-tab {
    font-size: 1rem;
  }
}

/* 登录、注册按钮样式 */
.btn_log {
    position: absolute;
    width: 100px;
    height: 60px;
    text-align: center;
    line-height: 60px;
    margin: 45px;
    text-decoration: none;
    color: aqua;
    font-size: 20px;
    padding: 0 20px;
    text-transform: uppercase;
    transition: 0.5s;
    overflow: hidden;
    -webkit-box-reflect: below 1px linear-gradient(transparent, #1113);
    z-index: 1;
    display: block;
}
.btn_log::before {
    content: '';
    position: absolute;
    top: 0;
    left: 0;
    width: 20px;
    height: 20px;
    border-top: 2px solid aqua;
    border-left: 2px solid aqua;
    transition: 0.5s;
    transition-delay: 0.5s;
}
.btn_log::after {
    content: '';
    position: absolute;
    bottom: 0;
    right: 0;
    width: 20px;
    height: 20px;
    border-bottom: 2px solid aqua;
    border-right: 2px solid aqua;
    transition: 0.5s;
    transition-delay: 0.5s;
}
.btn_log:hover::before, a:hover::after {
    width: 100%;
    height: 100%;
    transition-delay: 0s;
}
.btn_log:hover {
    background-color: aqua;
    color: #000;
    box-shadow: 0 0 50px #21ebff;
    transition-delay: 0.3s;
}
.btn_log:nth-child(2) {
    filter: hue-rotate(70deg);
    left: 65%;
    top:50%;
}
.btn_log:nth-child(3) {
    filter: hue-rotate(150deg);
    left: 65%;
    top: 60%;
}
</style>

