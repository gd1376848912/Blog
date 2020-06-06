package com.gordon.myblog.VO;

public enum ResultEnum {
  // 错误码 错误信息
  UNKNOW_ERROR(-1, "系统错误"),
  FAIL(0, "失败"),
  SUCCESS(200, "成功"),
  WRONGPASS(200, "密码错误"),
  WRONGNAME(200, "用户名错误");

  private int code;
  private String msg;

  ResultEnum(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public int getCode() {
    return code;
  }

  public String getMsg() {
    return msg;
  }

  }
