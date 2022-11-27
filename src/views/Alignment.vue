<template>
<div class="Alignment">
<el-row type="flex" class="row-bg" justify="center">
<el-col :span="13"><div class="grid-content"><div class="path">
    <el-breadcrumb separator-class="el-icon-arrow-right">
<el-breadcrumb-item :to="{ path: '/' }">Home</el-breadcrumb-item>
<el-breadcrumb-item>Alignment</el-breadcrumb-item>
</el-breadcrumb>
    </div></div></el-col>
</el-row>
<div><iframe v-loading="loading" id="ii" height="600px" width="100%" src="https://blast.ncbi.nlm.nih.gov/Blast.cgi?PROGRAM=blastn&PAGE_TYPE=BlastSearch&BLAST_SPEC=&LINK_LOC=blasttab&LAST_PAGE=blastx">
    </iframe></div>
</div>
</template>

<script>
export default {
  name: 'Alignment',
  data () {
    return {
      loading : true
    }
  },
  mounted(){
    var ii = document.getElementById("ii");
    if (ii.attachEvent){
        ii.attachEvent("onload", function(){
            this.loading = false;
        });
    } else {
        ii.onload = function(){
            this.loading = false;
        };
    }
}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
.path {
    height: 36px;
    padding-top: 10.5px;
    border-radius: 4%;
    padding-left: 16px;
    background-color: rgba(211, 211, 211, .55);
    margin-top: 40px;
    margin-bottom: 10px;
}
</style>
