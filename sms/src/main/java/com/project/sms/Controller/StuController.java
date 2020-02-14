package com.project.sms.Controller;

import com.project.sms.Bean.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StuController{

    @Autowired
    private StuRepository repository;

    //查找所有
    @GetMapping("/findall")
    public List<Stu> list(){
        return repository.findAll();
    }

    //通过学号（id）查找
    @GetMapping("findbyid")
    public Object findById(@RequestParam("id") Integer id){
        System.out.println("查询。。。。。。");
        return repository.findById(id);
    }
    //通过班级查询
    @GetMapping("findbyclass")
    public Object findByClazz(@RequestParam("clazz") String clazz){
        return repository.findByClazz(clazz);
    }
    //
}
