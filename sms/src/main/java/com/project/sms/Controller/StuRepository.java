package com.project.sms.Controller;

import com.project.sms.Bean.Familier;
import com.project.sms.Bean.Stu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StuRepository extends JpaRepository<Stu,Integer> {
    @Query("select s from Stu s where s.clazz=?1")
    List<Stu> findByClazz(String clazz);

    @Query("select s from Stu s where s.name=?1")
    List<Stu> findByName(String name);

    @Modifying
    @Query("update Stu set teacher=?1 where clazz=?1")
    List<Stu> updateclaz(String teacher,String clazz);

    @Query("delete from Stu where name=?1")
    List<Stu> deleteByName(String name);
}
