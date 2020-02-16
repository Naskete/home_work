package com.project.sms.config;

import com.project.sms.Bean.User;
import com.project.sms.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

//自定义的realm extends AuthorizingReam
public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals){
        System.out.println("执行授权");
        SimpleAuthorizationInfo info =new SimpleAuthorizationInfo();

        //获取user
        Subject subject = SecurityUtils.getSubject();
        User currentUser=(User) subject.getPrincipal();
        //社长当前权限
        info.addStringPermission(currentUser.getPerm());
        return  info;
    }
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)throws AuthenticationException {
        System.out.println("执行认证");

        UsernamePasswordToken userToker = (UsernamePasswordToken) token;

        User user =userService.queryUserByName(userToker.getUsername());
        if (user==null) {
            return null;
        }
        //密码认证
        //用户认证，密码，用户名
        return new SimpleAuthenticationInfo(user,user.getPassword(),"");
    }
}
