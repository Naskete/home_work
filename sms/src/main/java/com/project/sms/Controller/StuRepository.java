package com.project.sms.Controller;

import com.project.sms.Bean.Stu;
import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StuRepository extends JpaRepository<Stu,Integer> {
    @Query("select s from Stu s where s.clazz=?1")
    List<Stu> findByClazz(String clazz);

    @Query("select s from Stu s where s.name=?1")
    List<Stu> findByName(String name);

    /*@Query("select s from Stu s left join Familier where s.name=?1")
    List<Stu> findFamilier(String name);*/
}
