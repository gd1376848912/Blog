<template>
  <div class="login">
    <input type="text" name="userName" v-model="userName">
    <input type="password" name="userPass" v-model="userPass">
    <input type="submit"  @click="login">
  </div>
</template>
<script>
export default {
  name: 'Login',
  data () {
    return {
      userName: '',
      userPass: ''
    }
  },
  methods: {
    login: function () {
      this.$http.post('/api/user/login', {'userName': this.userName, 'userPass': this.userPass}, {emulateJSON: true}).then(result => {
        console.log('-------------', result)
        if (result.data !== '') {
          this.$router.push('/')
        }
      })
    }
  }
}
</script>
