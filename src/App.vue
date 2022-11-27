<template>
  <div id="app">
    <bar/>
    <router-view/>
    <bottom/>
  </div>
</template>

<script>
import bar from '@/components/bar'
import bottom from '@/components/bottom'
export default {
  components: {bar , bottom},
  name: 'App'
}
</script>

<style>
* {
  padding: 0px;
  margin: 0px;
  font-size:1rem;
}
</style>
