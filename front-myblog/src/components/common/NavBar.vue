<style>
</style>
<template>
  <div id="nav-bar">
    <my-modal title="登录" :visible="isVisible" :size="size">
      <div slot="body"  class="row">
        <form  role="form">
          <div class="form-group col-sm-8 col-sm-offset-2">
            <input type="text" class="form-control " id="firstname" placeholder="邮箱/用户名">
          </div>
          <div class="form-group col-sm-8 col-sm-offset-8">
            <input type="text" class="form-control" id="lastname" placeholder="请输入密码">
          </div>
        </form>
      </div>
      <div slot="foot">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
      </div>
    </my-modal>
    <b-navbar toggleable="lg" type="dark" variant="info">
      <b-navbar-brand href="#">MyBlog</b-navbar-brand>

      <b-navbar-toggle target="nav-collapse"></b-navbar-toggle>

      <b-collapse id="nav-collapse" is-nav>
        <b-navbar-nav>
          <b-nav-item href="#">申请友链</b-nav-item>
          <b-nav-item href="#">文章归档</b-nav-item>
          <b-nav-item href="#">关于本站</b-nav-item>
        </b-navbar-nav>

        <!-- Right aligned nav items -->
        <b-navbar-nav class="ml-auto">
          <b-nav-form>
            <b-form-input size="sm" class="mr-sm-2" placeholder="搜索文章"></b-form-input>
            <b-button size="sm" class="my-2 my-sm-0" type="submit">Search</b-button>
          </b-nav-form>
          <b-nav-item-dropdown right v-if="isLogin">
            <!-- Using 'button-content' slot -->
            <template v-slot:button-content>
              <em>{{username}}</em>
            </template>
            <b-dropdown-item href="#">发布文章</b-dropdown-item>
            <b-dropdown-item href="#">退出登录</b-dropdown-item>
          </b-nav-item-dropdown>
          <b-navbar-nav>
            <b-nav-item  data-toggle="modal" data-target="#myModal" @click="loginPage()" >登录</b-nav-item>
          </b-navbar-nav>
        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </div>
</template>
<script>
export default {
  name: 'NavBar',
  data () {
    return {
      meal: '',
      isLogin: '',
      isVisible: false,
      nickName: '',
      size: 'sm'
    }
  },
  methods: {
    loginPage: function () {
      this.isVisible = !this.isVisible
      console.log(this.isVisible)
    }
  }
}
</script>
