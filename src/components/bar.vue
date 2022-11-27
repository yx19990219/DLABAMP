<template>
    <div class="bar">
        <div class="nav" v-if="heng">
            <!-- <p>DLABAMP</p> -->
        <el-menu
  class="el-menu-demo"
  :router="true"
  mode="horizontal"
  :default-active="activeIndex"
  background-color="#014167"
  text-color="#fff"
  active-text-color="#ffd04b">
  <el-menu-item><strong><span class="font-size:25px">DLABAMP</span></strong></el-menu-item>
  <el-menu-item index="1" route="/">&nbsp; Home &nbsp;</el-menu-item>
    <el-submenu index="2">
    <template slot="title">&nbsp;Browse&nbsp;</template>
    <el-menu-item index="2-1" route="/Browse">Browse_DALP</el-menu-item>
    <el-menu-item index="2-2" route="/Browse_domain">Browse_DALP_Domain</el-menu-item>
    <el-menu-item index="2-3" route="/Browse_submit">Browse_Submit</el-menu-item>
    </el-submenu>
  <el-menu-item index="3" route="/Search">&nbsp; Search&nbsp; </el-menu-item>
  <el-menu-item index="4" route="/Statistics">&nbsp; Statistics&nbsp; </el-menu-item>
  <el-menu-item index="5" route="/Alignment">&nbsp;Alignment&nbsp;</el-menu-item>
  <el-menu-item index="6" route="/Prediction">&nbsp;Prediction&nbsp;</el-menu-item>
  <el-menu-item index="7" route="/Submit">&nbsp;Submit</el-menu-item>
  <el-menu-item index="8" route="/Help">&nbsp;Help</el-menu-item>
</el-menu>
</div>
    </div>
</template>

<script>

import 'element-ui/lib/theme-chalk/display.css';
export default {
    name:'bar',
    data() {
        return{
            activeIndex:'1',
            heng: true
        }
    }
}
</script>
<style>
.nav {
    padding-left: 19%;
    background-color: #014167;
    position: relative;
}
</style>