<template>
    <el-container>
        <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm" size="middle"
          :hide-required-asterisk="true">
        <br>
        <br>
        <el-form-item label="姓名" prop="name">
            <el-input v-model="ruleForm.name"></el-input>
        </el-form-item>
        <el-form-item label="联系方式" prop="phone">
            <el-input v-model.number="ruleForm.phone"></el-input>
        </el-form-item>
        <el-form-item label="学习方向" prop="direction">
            <el-select v-model="ruleForm.direction" placeholder="请选择学习方向">
            <el-option label="java" value="java"></el-option>
            <el-option label="big data" value="data"></el-option>
            <el-option label="game design" value="game"></el-option>
            <el-option label="network security" value="net"></el-option>
            </el-select>
        </el-form-item>
        <el-form-item label="学历" prop="degree">
            <el-select v-model="ruleForm.degree" placeholder="请选择学历">
            <el-option label="大四本科在读" value="dasi"></el-option>
            <el-option label="本科毕业" value="benke"></el-option>
            <el-option label="研究生" value="yanjiu"></el-option>
            <el-option label="其他" value="refuse"></el-option>
            </el-select>
        </el-form-item>
         <el-form-item prop="delivery">
            <el-switch v-model="ruleForm.delivery" ref="delivery"></el-switch>
            <label>&nbsp;&nbsp;本人承诺以上信息属实</label>
        </el-form-item>
        <el-form-item>
            <el-button type="danger" @click="submitForm('ruleForm')">立即报名</el-button>
            <el-button @click="resetForm('ruleForm')">重置</el-button>
        </el-form-item>
        </el-form>
    </el-container>
</template>

<script>
export default {
    name:'Enlists',
     data() {
      return {
        ruleForm: {
          name: '',
          phone: '',
          direction: '',
          degree: '',
          delivery: false,
        },
        rules: {
          name: [
            { required: true, message: '请输入姓名', trigger: 'blur' },
            { min: 2, max: 5, message: '长度在 2 到 5 个字符', trigger: 'blur' }
          ],
          phone:[
            { required: true, message: '请输入联系电话'},
            { type: 'number', message: '电话必须为数字值'}
          ],
          direction: [
            { required: true, message: '请选择学习方向', trigger: 'change' }
          ],
          degree: [
            { required: true, message: '请选择学历', trigger: 'change' }
          ]
        }
      };
    },
    methods: {
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
            console.log(this);
          if (valid && this.ruleForm.delivery) {
            alert('submit!');
          } else if(valid){
            alert ('please agree the delivery')
            return false;
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
}
</script>

<style scoped>
.el-container{
    height: 100vh;
    justify-content: center;
    background-color: rgb(61, 60, 60);
}

.el-form{
    width: 600px;
    margin-top: 20px;
    margin-bottom:80px ;
    border-radius: 10px;
    background-color: rgb(213, 190, 179);
}

.el-input__inner{
    
}

.el-input{
    width: 70%;
}
</style>