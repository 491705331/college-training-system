 
import Vue from 'vue'   //引入Vue
import Router from 'vue-router'  //引入vue-router
import Main from '../components/Main.vue'  //引入根目录下的Main.vue组件
import Login from '../components/Login.vue'
import Register from '../components/Register.vue'
import Loginhome from '../components/Loginhome.vue'
import Remember from '../components/Remember.vue'
 
Vue.use(Router)  //Vue全局使用Router
 
export default new Router({
  routes: [              //配置路由，这里是个数组
    {                    //每一个链接都是一个对象
      path: '/',         //链接路径
      name: 'Main',     //路由名称，
      component: Main   //对应的组件模板
    },{
      path:'/login',
      name: 'Login',
      component: Login,
      children:[
        {
          path:'',
          component: Loginhome
        },
        {
          path:'register',
          name:'Register',
          component: Register
        },
        {
          path:'rem',
          name:'Remember',
          component: Remember
        }
      ]
    }
  ]
})

