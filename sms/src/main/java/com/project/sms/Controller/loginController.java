package com.project.sms.Controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @GetMapping({"/","/index"})
    public String toindex(){ return "请登录"; }

    @GetMapping("/tologin")
    public String login(){
        return "请登录";
    }

    //登录
    @GetMapping("/login")
    public String login(String username,String password){
        //获取当前用户
        Subject subject= SecurityUtils.getSubject();
        //封装用户登录数据
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);

        try {
            subject.login(token);//执行登录
            return "登录成功";
        }catch (UnknownAccountException e){
            return "用户名错误";
        }catch (IncorrectCredentialsException e){
            return "密码错误";
        }
    }

    //未授权界面
    @RequestMapping("/noauth")
    public String unauthorized(){
        return "未授权，无法访问";
    }

    //登出
    @GetMapping("/user/logout")
    public String logout(){
        //获取当前用户
        Subject subject= SecurityUtils.getSubject();
        subject.logout();
        return "退出";
    }
}
