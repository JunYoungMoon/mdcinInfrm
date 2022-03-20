<template>
  <div>
    <input
      id="serachInput"
      type="text"
      v-model="searchWords"
      v-on:keyup.enter="search()"
    /><button v-on:click="search()">검색</button>
    <MdcInfMap id="mapComponent" v-bind:searchWords="searchWords"></MdcInfMap>
  </div>
</template>

<script>
import MdcInfMap from "@/components/api/MdcInfMap.vue";

export default {
  name: "MdcInfBody",
  data: function () {
    return {
      searchWords: "",
    };
  },
  methods: {
    search() {
      if (this.searchWords === "") {
        alert("지역을 입력해주세요");
        document.getElementById("serachInput").focus();
      } else {
        console.log(this.searchWords);
      }
    },
  },
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
