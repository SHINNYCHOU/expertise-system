<template>
    <div>
        <navi></navi>
        <div style="margin-top: 10px">
            <el-form  label-width="100px">
                <el-row :gutter="20">
                    <el-col :span="6">
                        <el-form-item label="项目名称">
                            <el-input v-model="name" ></el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="4">
                        <el-form-item label="专家数量">
                            <el-input v-model="number" ></el-input>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-form-item label="单位">
                    <el-input v-model="company" ></el-input>
                </el-form-item>
                <el-row :gutter="20">
                    <el-col :span="10">
                        <el-form-item label="项目日期">
                            <el-date-picker
                                    v-model="date"
                                    type="date"
                                    placeholder="选择日期">
                            </el-date-picker>
                        </el-form-item>
<!--                        <el-form-item label="项目日期">-->
<!--                        <el-date-picker-->
<!--                                v-model="date"-->
<!--                                type="datetimerange"-->
<!--                                range-separator="至"-->
<!--                                start-placeholder="开始日期"-->
<!--                                end-placeholder="结束日期">-->
<!--                        </el-date-picker>-->
<!--                        </el-form-item>-->
                    </el-col>
                    <el-col :span="6">
                        <el-form-item label="类型">
                            <!--                            <el-input v-model="Form.type" ></el-input>-->
                            <el-select v-model="type" placeholder="请选择">
                                <el-option label="学术" value="学术"></el-option>
                                <el-option label="财务" value="财务"></el-option>
                                <el-option label="法律" value="法律"></el-option>
                                <el-option label="其他" value="其他"></el-option>
                            </el-select>
                        </el-form-item>
                    </el-col>
                    <el-col :span="9">
                        <el-form-item label="领域">
                            <el-input v-model="area" ></el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="9">
                        <el-form-item label="描述">
                            <el-input v-model="keyword" ></el-input>
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
        name: "add",
        components: {navi},
        data(){
            return{
                    name:'',
                    number:'',
                    company:'',
                    type:'',
                    area:'',
                    date:'',
                    keyword: ''
            }
        },
        methods:{
            resetForm(){
                // this.birth='',
                    this.name='',
                    this.number='',
                    this.company='',
                    this.type='',
                    this.area='',
                    this.date='',
                    this.keyword=''
            },
            submitForm(){
                let data = {
                    name: this.name,
                    number: this.number,
                    company:this.company,
                    type: this.type,
                    area:this.area,
                    time: this.date,
                    keyword: this.keyword
                }
                console.log(data)
                var url = 'http://localhost:8080/program/insert/'
                this.$http({
                    method: 'post',
                    url: url,
                    headers: {
                        'Access-Control-Allow-Credentials': true,
                        'Access-Control-Allow-Origin': true,
                        'Content-Type': 'application/json'
                    },
                    data: JSON.stringify(data)
                })
                    .then(response => {
                        console.log(response.data)
                        console.log('get response')
                        //redirect
                        this.$router.push({path: '/programList'})
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