package com.project.sms.Controller;

import com.project.sms.Bean.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeaRepository extends JpaRepository<Teacher,Integer> {
    @Query("select s from Teacher s where s.name=?1")
    List<Teacher> findByName(String name);

    @Modifying
    @Query("update Teacher set clazz=?1 where name=?1")
    List<Teacher> updateclazz(String name,String clazz);
}
