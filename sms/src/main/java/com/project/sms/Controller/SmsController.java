package com.project.sms.Controller;

import com.project.sms.Bean.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SmsController{

    @Autowired
    private StuRepository repository;
//学生 2
    //查找所有 2
    @GetMapping("/findall")
    public List<Stu> list(){
        return repository.findAll();
    }

    //通过学号（id）查找 2
    @GetMapping("findbyid")
    public Object findById(@RequestParam("id") Integer id){
        System.out.println("查询。。。。。。");
        return repository.findById(id);
    }
    //通过班级查询 1+2
    @GetMapping("findbyclass")
    public Object findByClazz(@RequestParam("clazz") String clazz){
        return repository.findByClazz(clazz);
    }
    //查看家庭成员信息
    /*@GetMapping("findfamilier")
    public Object findfamilier(@RequestParam("name") String name){
        return repository.findFamilier(name);
    }*/
//辅导员 1
    //修改学生信息???????
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

//管理员 0
    //通过名字查询学生 0
    @GetMapping("findbyname")
    public Object findByName(@RequestParam("name") String name){
        return repository.findByName(name);
    }
    //增加学生
    @PostMapping("/add")
    public Stu add(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("tel") Long tel,
                   @RequestParam("QQ") Integer qq, @RequestParam("wechatnum") String wechat, @RequestParam("college") String college,
                   @RequestParam("mainpro") String mainpro, @RequestParam("clazz") String clazz, @RequestParam("teacher") String teacher){
        Stu stu =new Stu();
        stu.setId(id);
        stu.setName(name);
        stu.setTel(tel);
        stu.setQQ(qq);
        stu.setWechatnum(wechat);
        stu.setCollege(college);
        stu.setMainpro(mainpro);
        stu.setClazz(clazz);
        stu.setTeacher(teacher);
        return repository.save(stu);
    }
    //删除学生
    @GetMapping("/delete")
    public String del(@RequestParam("name") String name){
        
    }
    //配置学生班级
    @PutMapping("/setclass/{id}")
    public Stu setclass(@PathVariable("id") Integer id,
                        @RequestParam("clazz") String clazz){
        Optional stu=repository.findById(id);
        if(stu.isPresent()){
            Stu newstu=(Stu) stu.get();
            newstu.setClazz(clazz);
            return repository.save(newstu);
        }
        return null;
    }
    //配置辅导员班级
    @PutMapping("/updateclass/{class}")
    public  Object updateclass(@PathVariable("class") String clazz,
                            @RequestParam("teacher") String teacher){
        return  repository.updateclaz(teacher,clazz);
    }
}