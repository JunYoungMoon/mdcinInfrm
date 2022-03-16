<template>
  <div>
    <MdcInfHeader></MdcInfHeader>
  </div>
</template>

<script>
import Vue from "vue";
import MdcInfHeader from "@/components/MdcInfHeader.vue";

export default Vue.extend({
  name: "MainView",
  components: {
    MdcInfHeader,
  },
});
</script>
