<template>
    <div>
        <navi></navi>
        <div>
            <div class="detail_title">
                <p class="title" >{{name}}</p>
            </div>
            <div class="detail_main">
<!--                <div class="detail_cover">-->
<!--                    <img  class="cover" :src="cover" alt="" >&lt;!&ndash;150*140px&ndash;&gt;-->
<!--                </div>-->
                <div class="detail_info">
                    <p class="content" > <span style="font-weight: bold">姓名:</span>{{name}}<br/></p>
                    <p class="content" > <span style="font-weight: bold">性别：</span>{{gender}}<br/></p>
                    <p class="content" ><span style="font-weight: bold">年龄：</span>{{age}}<br/></p>
                    <p class="content" ><span style="font-weight: bold">类型:</span>{{type}}<br/></p>
                    <p class="content" ><span style="font-weight: bold">领域:</span>{{area}}<br/></p>
                </div>
<!--                <div class="detail_right">&lt;!&ndash;购物车&ndash;&gt;-->
<!--                    <br/>-->
<!--                    <br/>-->
<!--                    数量:-->
<!--                    <input type="text" name="add_number" placeholder="请输入数字" v-model="addnum"><br/>-->
<!--                    <button type="button" class="top" @click="addtobag (name,addnum,store,logstate,user)"> 加入购物车 </button>-->
<!--                    <button type="button" class="top"> 直接购买 </button>-->
<!--                </div>-->
            </div>
        </div>
    </div>
<!--    雷达图，信息，过往记录-->
</template>

<script>
    import navi from "../../components/navi";
    export default {
        name: "expertDetail",
        components: {navi},
        data(){
            return{
                name:'赵旭',
                gender:'男',
                age:'42',
                type:'技术',
                area:'核工程'

            }
        },
        created: function () {
            this.load()
        },
        methods: {
            load(){
                this.$route.query.id
            }
        }
    }
</script>

<style scoped>

</style>