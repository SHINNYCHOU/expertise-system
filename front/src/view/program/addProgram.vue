<template>
    <div>
        <navi></navi>
        <div style="margin-top: 10px">
            <el-form :model="Form"  label-width="100px">
                <el-row :gutter="20">
                    <el-col :span="6">
                        <el-form-item label="项目名称">
                            <el-input v-model="Form.name" ></el-input>
                        </el-form-item>
                    </el-col>
                    <el-col :span="4">
                        <el-form-item label="专家数量">
                            <el-input v-model="Form.number" ></el-input>
                        </el-form-item>
                    </el-col>
                </el-row>
                <el-form-item label="单位">
                    <el-input v-model="Form.company" ></el-input>
                </el-form-item>
                <el-row :gutter="20">
                    <el-col :span="10">
<!--                        <el-form-item label="项目日期">-->
<!--                            <el-date-picker-->
<!--                                    v-model="Form.date"-->
<!--                                    type="date"-->
<!--                                    placeholder="选择日期">-->
<!--                            </el-date-picker>-->
<!--                        </el-form-item>-->
                        <el-form-item label="项目日期">
                        <el-date-picker
                                v-model="Form.date"
                                type="datetimerange"
                                range-separator="至"
                                start-placeholder="开始日期"
                                end-placeholder="结束日期">
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
        name: "add",
        components: {navi},
        data(){
            return{
                Form:{
                    name:'',
                    number:'',
                    // secret:'',
                    company:'',
                    type:'',
                    area:'',
                    date:''
                },
                value: ''
            }
        },
    }
</script>

<style scoped>

</style>