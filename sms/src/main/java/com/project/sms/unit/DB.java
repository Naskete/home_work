package com.project.sms.unit;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB{
    public static Connection con;
    //加载驱动
    public String Driver="com.mysql.jdbc.Driver";
    //数据库地址
    private String url="jdbc:mysql://localhost:3306/sms";
    //用户名
    private String user="root";
    //密码
    private String password="123123";
    //构造方法
    public DB(){
        try{
            Class.forName(Driver);
            con= DriverManager.getConnection(url,user,password);
            if (!con.isClosed()) {
                System.out.println("数据库连接成功");
            }
        }catch (Exception e){
            System.out.println("连接失败");
            System.out.println("e");
        }
    }
    public static Connection getconnection(){
        if(con!=null){
            new DB();
        }
        return con;
    }
}
