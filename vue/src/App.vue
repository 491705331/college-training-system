<template>
    <router-view></router-view>
</template>

<script>
import Main from './components/Main.vue';

export default {
  name: 'App',
  components: {
    Main
  }
}
</script>
<style>
@import './assets/font/font.css';
body{
  margin:0;
}
</style>


