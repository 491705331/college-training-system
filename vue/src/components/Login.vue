<template>
    <div class="contain">
            <a class="btn_log" @click="$router.push('/login')">Login</a>
            <a class="btn_log" @click="$router.push('/login/register')">Register</a>
            <a class="btn_log" @click="$router.push('/')">Back</a>
            <a class="btn_log" @click="$router.push('/login/rem')">Can't&nbsp;Rem</a>
        <form class="form">
            <div class="form__cover"></div>
            <div class="form__loader">
            <div class="spinner active">
                <svg class="spinner__circular" viewBox="25 25 50 50">
                <circle class="spinner__path" cx="50" cy="50" r="20" fill="none" stroke-width="4" stroke-miterlimit="10"></circle>
                </svg>
            </div>
            </div>
            <div class="form__content">
            <router-view></router-view>
            </div>
        </form>
    </div>
</template>

<script>
export default {
    name:'Login',
    mounted(){
        require('../assets/js/login.js')
        console.log(111);
        
        if(this.$bus.x == 0){
            setTimeout(function () {
        var btn = document.getElementsByClassName('btn_log')
        for(var i=0;i<btn.length;i++)
        btn[i].style.display = "block";
        }, 2600);

        this.$bus.x +=1;
        }
        else {
        var btn = document.getElementsByClassName('btn_log')
        for(var i=0;i<btn.length;i++)
        btn[i].style.display = "block";
        }
        

    }
}
</script>

<style lang="scss" scoped>

</style>