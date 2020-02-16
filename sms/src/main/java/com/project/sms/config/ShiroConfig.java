package com.project.sms.config;


import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean=new ShiroFilterFactoryBean();
        //设置安全管理器
        //添加shiro内置过滤器
        Map<String,String> filterMap=new LinkedHashMap<>();

        //设置权限
        filterMap.put("/user/findme","perms[teacher]");

        filterMap.put("/user/modify/*","perms[teacher]");

        filterMap.put("/user/findbyname","perms[admin]");

        filterMap.put("/user/addstudent","perms[admin]");

        filterMap.put("/user/modifystudent/*","perms[admin]");

        filterMap.put("/user/deletestudent","perms[admin]");

        filterMap.put("/user/setclass/*","perms[admin]");

        filterMap.put("/user/findteacher","perms[admin]");

        filterMap.put("/user/addteacher","perms[admin]");

        filterMap.put("/user/modifyteacher/*","perms[admin]");

        filterMap.put("/user/deleteteacher","perms[admin]");

        filterMap.put("/user/updateclass/*","perms[admin]");

        //设置所有操作要登录后才能执行
        filterMap.put("/user/*","authc");

        //设置登录请求
        bean.setLoginUrl("/tologin");

        //定义未授权页面
        bean.setUnauthorizedUrl("/noauth");

        bean.setFilterChainDefinitionMap(filterMap);
        bean.setSecurityManager(defaultWebSecurityManager);
        return bean;
    }
    @Bean(name ="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager =new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }
    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }
}
