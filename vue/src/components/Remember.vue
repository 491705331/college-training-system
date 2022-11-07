<template>
  <div>
    <h1>Remember</h1>
    <div class="styled-input">
        <input type="text" class="styled-input__input" name="nickname" placeholder="Username">
    </div>
    <div class="styled-input">
        <input type="password" class="styled-input__input" placeholder="Password">
    </div>
  </div> 
</template>

<script>
export default {
    name:'Remember'
}
</script>

<style scoped>
@import '../assets/css/login.css';
</style>