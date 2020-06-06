package com.gordon.myblog.controller;

import com.gordon.myblog.VO.MyUtils;
import com.gordon.myblog.VO.Result;
import com.gordon.myblog.VO.ResultEnum;
import com.gordon.myblog.VO.ResultUtil;
import com.gordon.myblog.entity.User;
import com.gordon.myblog.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2020-05-10 15:34:29
 */
@RestController
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RequestMapping(" /user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        System.out.println("----"+this.userService.queryById(id));
        new ClassPathXmlApplicationContext();
        return this.userService.queryById(id);
    }

    @RequestMapping(value="/loginPage",method = RequestMethod.GET)
    public ModelAndView loginPage(){
        return new ModelAndView("login.html");
    }

    @RequestMapping("/login")
    public Result<Object> loginVerify(String userName, String userPass,HttpServletResponse response,HttpServletRequest request){
      System.out.println("请求进入------"+userName+"---"+userPass);
      User result = this.userService.queryByUserName(userName);
      if(result != null){
        if(userPass.equals(result.getUserPass())){
          request.getSession().setAttribute("user", result);
          Cookie nameCookie = new Cookie("userName", userName);
          nameCookie.setMaxAge(7*24*60*60);
          Cookie pwdCookie = new Cookie("userPass", userPass);
          pwdCookie.setMaxAge(7*24*60*60);
          response.addCookie(nameCookie);
          response.addCookie(pwdCookie);
          result.setUserLastLoginTime(new Date());
          result.setUserLastLoginIp(MyUtils.getIpAddr(request));
          this.userService.update(result);
          return ResultUtil.success(ResultEnum.SUCCESS,result);
        }
        return ResultUtil.error(ResultEnum.WRONGPASS);
      }
      return ResultUtil.error(ResultEnum.WRONGNAME);
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Result<Object> register(){

      return ResultUtil.error(ResultEnum.SUCCESS);
    }

    @RequestMapping(value = "logout")
    public Result<Object> logout(HttpSession ss){
      ss.removeAttribute("user");
      ss.invalidate();
      return ResultUtil.error(ResultEnum.SUCCESS);
    }

}
