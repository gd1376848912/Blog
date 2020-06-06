<style>
  .modal-wrap{
    height: 200px;
  }
</style>
<template>
  <div>
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" v-if="visible">
      <div :class="setSize()">
        <div class="modal-content">
          <div class="modal-header">
            {{title}}
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          </div>
          <div class="modal-body">
            <slot name="body"></slot>
          </div>
          <div class="modal-footer">
            <slot name="foot">
              <!--<div class="ft" slot="ft">
                <a href="javscript:void(0)" class="btn make-sure" @click="sure">确定</a>
                <a href="javscript:void(0)" class="btn cancel" @click="close">取消</a>
              </div>-->
            </slot>
          </div>
        </div>
      </div><!-- /.modal-content -->
    </div><!-- /.modal -->
  </div>
</template>

<script>
export default {
  name: 'MyModal',
  props: {
    visible: {
      type: Boolean,
      default: false,
      required: true
    },
    title: {
      type: String,
      default: ''
    },
    size: {
      type: String,
      default: 'sm'
    }
  },
  watch: {
    visible: function (curVal) {
    }
  },
  methods: {
    close () {
      this.$emit('update:visible', false)
    },
    setSize: function () {
      switch (this.size) {
        case 'sm': return 'modal-dialog modal-sm'
        case 'xl': return 'modal-dialog modal-xl'
        case 'lg': return 'modal-dialog modal-lg'
        case 'md': return 'modal-dialog modal-md'
      }
    }
  }
}
</script>
