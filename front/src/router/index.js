import Vue from 'vue'
import Router from 'vue-router'

import main from '../view/main'
import expert from '../view/expert/expertList'
import edit from '../view/expert/editExpert'
import programDetail from "../view/program/programDetail";

Vue.use(Router)

export default new Router({
    routes: [
        {
            path: '/home',
            component: main
        },
        {
            path: '/expert',
            component: expert
        },
        {
            path: '/edit',
            component: edit
        },
        {
            path: '/programDetail',
            component: programDetail
        },
        {
            path: '/',
            redirect: '/expert'
        }
    ]
})
