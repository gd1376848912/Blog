package com.gordon.myblog.VO;

public class ResultUtil {
  /**
   * 返回成功结果及数据
   * @param resultEnum
   * @param object
   * @return
   */
  public static Result<Object> success(ResultEnum resultEnum, Object object){
    Result<Object> result = new Result<>();
    result.setCode(resultEnum.getCode());
    result.setMsg(resultEnum.getMsg());
    result.setData(object);
    return result;
  }

  /**
   * 返回成功结果
   * @param resultEnum
   * @return
   */
  public static Result<Object> success(ResultEnum resultEnum){
    return success(resultEnum, null);
  }
  /**
   * 返回自定义成功结果
   * @param code
   * @param msg
   * @return
   */
  public static Result<Object> success(int code, String msg,Object object){
    Result<Object> result = new Result<>();
    result.setCode(code);
    result.setMsg(msg);
    result.setData(object);
    return result;
  }

  /**
   * 返回自定义异常结果
   * @param code
   * @param msg
   * @return
   */
  public static Result<Object> error(int code, String msg){
    Result<Object> result = new Result<>();
    result.setCode(code);
    result.setMsg(msg);
    return result;
  }


  /**
   * 返回失败结果
   * @param resultEnum
   * @return
   */
  public static Result<Object> error(ResultEnum resultEnum){
    Result<Object> result = new Result<>();
    result.setCode(resultEnum.getCode());
    result.setMsg(resultEnum.getMsg());
    return result;
  }

}
