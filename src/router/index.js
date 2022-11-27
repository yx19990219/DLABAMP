import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/views/Home'
import Browse from '@/views/Browse'
import Statistics from '@/views/Statistics'
import Search from '@/views/Search'
import Alignment from '@/views/Alignment'
import Prediction from '@/views/Prediction'
import Submit from '@/views/Submit'
import Browse_submit from '@/views/Browse_submit'
import Browse_domain from '@/views/Browse_domain'
import Help from '@/views/Help'
import sanji from '@/views/sanji'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/Browse',
      name: 'Browse',
      component: Browse
    },
    {
      path: '/Statistics',
      name : Statistics,
      component : Statistics
    },
    {
      path : '/Search',
      name : Search,
      component:Search
    },
    {
      path : '/Alignment',
      name : Alignment,
      component : Alignment
    },
    {
      path : '/Prediction',
      name : Prediction,
      component : Prediction
    },
    {
      path : '/Submit',
      name : Submit,
      component : Submit
    },
    {
      path : '/Browse_submit',
      name :　Browse_submit,
      component : Browse_submit
    },
    {
      path : '/Browse_domain',
      name :　Browse_domain,
      component : Browse_domain
    },
    {
      path : '/Help',
      name :　Help,
      component : Help
    },
    {
      path : '/sanji',
      name : sanji,
      component : sanji
    }
  ]
})
