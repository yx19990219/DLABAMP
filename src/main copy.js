// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
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
import axios from 'axios'
// import 'bootstrap-table/dist/locale/bootstrap-table-zh-CN.min.js'
import { Message,Upload,Tag,Divider,Button,Loading,Tooltip,Tabs,TabPane,FormItem,Form,Input,InputNumber,Popover,Popconfirm,Autocomplete,Radio,RadioButton,RadioGroup,MessageBox,Alert } from 'element-ui';
import lang from 'element-ui/lib/locale/lang/en'
import locale from 'element-ui/lib/locale'
import 'element-ui/lib/theme-chalk/index.css';

locale.use(lang)
Vue.component(Tooltip.name, Tooltip)

Vue.component(Popover.name, Popover)
Vue.component(MessageBox.name, MessageBox)
Vue.component(Alert.name, Alert)
Vue.component(RadioGroup.name, RadioGroup)
Vue.component(RadioButton.name, RadioButton)
Vue.component(Radio.name, Radio)
Vue.component(Autocomplete.name, Autocomplete)
Vue.component(Input.name, Input)
Vue.component(InputNumber.name, InputNumber)
Vue.component(Tabs.name, Tabs)
Vue.component(TabPane.name, TabPane)
Vue.component(Upload.name, Upload)
Vue.component(Tag.name,Tag)
Vue.component(Divider.name,Divider)
Vue.component(Button.name,Button)
Vue.component(Form.name, Form)
Vue.use(Popconfirm)
Vue.component(FormItem.name, FormItem)
// import bootstrapCss from './bootstrap-5.1.3-dist/css/bootstrap.min.css'
// import * as  bootstrapJs from './bootstrap-5.1.3-dist/js/bootstrap.bundle.js'

Vue.config.productionTip = false
Vue.prototype.$msgbox = MessageBox;
Vue.prototype.$alert = MessageBox.alert;
Vue.prototype.$confirm = MessageBox.confirm;
Vue.prototype.$loading = Loading.service;
Vue.prototype.$message = Message;
Vue.prototype.$axios = axios;
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
// Vue.use(bootstrapCss)
// Vue.use(bootstrapJs)
// Vue.use(bootstrapTable)
// Vue.use(bootstrapTableJs)