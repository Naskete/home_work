package com.project.sms.Controller;

import com.project.sms.Bean.Stu;
import com.project.sms.Bean.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface TeaRepository extends JpaRepository<Teacher,Integer> {
    @Query("select s from Teacher s where s.name=?1")
    List<Teacher> findByName(String name);

    @Query("select s from Teacher  s where s.clazz=?1")
    Teacher findByClazz(String clazz);
}
