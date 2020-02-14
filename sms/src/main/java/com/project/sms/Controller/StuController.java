package com.project.sms.Controller;

import com.project.sms.Bean.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //通过名字查询
    @GetMapping("findbyname")
    public Object findByName(@RequestParam("name") String name){
        return repository.findByName(name);
    }
    //查看家庭成员信息
    /*@GetMapping("findfamilier")
    public Object findfamilier(@RequestParam("name") String name){
        return repository.findFamilier(name);
    }*/
    //修改学生信息
    @PutMapping("/modify/{id}")
    private Stu modify(@PathVariable("id") Integer id,
                       @RequestParam("name") String name,
                       @RequestParam("college") String college,
                       @RequestParam("clazz") String clazz,
                       @RequestParam("teacher") String teacher){
        Optional stu=repository.findById(id);
        if(stu.isPresent()){
            Stu newstu= (Stu) stu.get();
            newstu.setName(name);
            newstu.setCollege(college);
            newstu.setClazz(clazz);
            newstu.setTeacher(teacher);
            return repository.save(newstu);
        }
        return null;
    }
}
