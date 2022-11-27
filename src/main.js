// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import router from './router'
import axios from 'axios'
import BootstrapVue from 'bootstrap-vue'
import Blob from './vendor/Blob'
import Export2Excel from './vendor/Export2Excel'
import xlsx from 'xlsx'
import locale from 'element-ui/lib/locale/lang/en'

import $ from 'jquery'
// import 'bootstrap/dist/css/bootstrap.min.css'
import './bootstrap-5.1.3-dist/css/bootstrap.min.css'
import './bootstrap-5.1.3-dist/js/bootstrap.bundle.js'
import 'bootstrap-table/dist/bootstrap-table.min.css'
import 'bootstrap-table/dist/bootstrap-table.min.js'
import 'bootstrap-table/dist/extensions/export/bootstrap-table-export.js'
import './assets/tableExport.min.js'
import './assets/jspdf.min.js'
import './assets/jspdf.plugin.autotable.js'

Vue.use(BootstrapVue)
Vue.use(ElementUI, {locale})
Vue.prototype.$axios = axios;
Vue.config.productionTip = false

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
