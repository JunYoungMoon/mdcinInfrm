<template>
  <div>
    <MdcInfHeader></MdcInfHeader>
    <MdcInfBody></MdcInfBody>
  </div>
</template>

<script>
import Vue from "vue";
import MdcInfHeader from "@/components/layout/MdcInfHeader.vue";
import MdcInfBody from "@/components/layout/MdcInfBody.vue";

export default Vue.extend({
  name: "MainView",

  components: {
    MdcInfHeader,
    MdcInfBody,
  },
});
</script>
