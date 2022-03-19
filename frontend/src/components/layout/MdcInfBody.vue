<template>
  <div>
    <input type="text" /><button>검색</button>
    <MdcInfMap id="mapComponent"></MdcInfMap>
  </div>
</template>

<script>
import MdcInfMap from "@/components/api/MdcInfMap.vue";

export default {
  name: "MdcInfBody",
  components: {
    MdcInfMap,
  },
};
</script>

<style scoped>
#mapComponent {
  display: flex;
  justify-content: center;
  margin-top: 10px;
}
</style>
