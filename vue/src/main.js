import Vue from 'vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import App from './App.vue'
import jquery from 'jquery';
Vue.prototype.$ = jquery
import echarts from 'echarts';
Vue.prototype.$echarts = echarts
import router from './router/index'

Vue.config.productionTip = false
Vue.prototype.$bus = {
  x:0
}
Vue.use(ElementUI);


new Vue({
  render: h => h(App),
  router
}).$mount('#app')

