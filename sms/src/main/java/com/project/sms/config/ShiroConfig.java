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

        filterMap.put("/user/add","perms[admin]");

        filterMap.put("/user/update","perms[teacher]");

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
