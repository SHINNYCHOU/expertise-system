<template>
    <div>
        <navi></navi>
        <div style="margin-top: 10px">
            <el-form :model="Form"  label-width="100px">
                <el-row :gutter="20">
                    <el-col :span="6">
                        <el-form-item label="姓名">
                            <el-input v-model="Form.name" ></el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="4">
                        <el-form-item label="性别">
                            <el-select v-model="Form.gender" clearable placeholder="请选择">
                                <el-option label="男" value="male"></el-option>
                                <el-option label="女" value="female"></el-option>
                                <el-option label="其他" value=" "></el-option>
                            </el-select>
                        </el-form-item>
                    </el-col>
                    <el-col :span="6">
                        <el-form-item label="是否机密">
                            <el-select v-model="Form.secret" placeholder="请选择">
                                <el-option
                                        v-for="item in secretoptions"
                                        :key="item.value"
                                        :label="item.label"
                                        :value="item.value">
                                </el-option>
                            </el-select>
                        </el-form-item>
                    </el-col>
                    <el-col :span="6" style="align-items: end">
                        <el-form-item label="电话">
                            <el-input v-model="Form.phone" ></el-input>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-form-item label="单位">
                    <el-input v-model="Form.company" ></el-input>
                </el-form-item>
                <el-row :gutter="20">
                    <el-col :span="6">
                        <el-form-item label="出生日期">
                            <el-date-picker
                                    v-model="Form.birth"
                                    type="date"
                                    placeholder="选择日期">
                            </el-date-picker>
                        </el-form-item>
                    </el-col>
                    <el-col :span="6">
                        <el-form-item label="类型">
<!--                            <el-input v-model="Form.type" ></el-input>-->
                            <el-select v-model="Form.type" placeholder="请选择">
                                <el-option label="学术" value="male"></el-option>
                                <el-option label="财务" value="female"></el-option>
                                <el-option label="法律" value=" "></el-option>
                                <el-option label="其他" value=" "></el-option>
                            </el-select>
                        </el-form-item>
                    </el-col>
                    <el-col :span="9">
                        <el-form-item label="领域">
                            <el-input v-model="Form.area" ></el-input>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-form-item>
                    <el-button type="primary" @click="submitForm()">立即创建</el-button>
                    <el-button @click="resetForm()">重置</el-button>
                </el-form-item>
            </el-form>
        </div>
    </div>
</template>

<script>
    import navi from "../../components/navi";
    export default {
        name: "edit",
        components: {navi},
        data(){
            return{
                Form:{
                    name:'',
                    phone:'',
                    gender:'',
                    secret:'',
                    company:'',
                    type:'',
                    area:'',
                    birth:''
                },
                secretoptions: [{
                    value: '1',
                    label: '机密人员'
                }, {
                    value: '0',
                    label: '非机密人员'
                }],
                value: ''
            }
        },
        methods:{
            resetForm(){
                this.Form = {}
            },
            submitForm(){
                // let that = this
                var url = 'http://localhost:8080/user/add/' + this.newUsername
                this.$http({
                    method: 'post',
                    url: url,
                    headers: {
                        'Access-Control-Allow-Credentials': true,
                        'Access-Control-Allow-Origin': true
                        // 'Content-Type': 'text/plain'
                    },
                    data: {
                        'isbn': '',
                        'content': ''
                    }
                })
                    .then(response => {
                        console.log(response.data)
                        console.log('get response')
                    })
                    .catch(error => {
                        JSON.stringify(error)
                        console.log(error)
                    })
            }
        }
    }
</script>

<style scoped>

</style>